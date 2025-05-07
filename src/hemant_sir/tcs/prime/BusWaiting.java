package hemant_sir.tcs.prime;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class BusWaiting {

    /*
    U -> bus starts from
    S -> starting time from U
    V -> final station from U
    E -> time to reach final station

    If passenger arrives at bus station U at the time X (X <= S),
    he has to wait S - X unit of time,
    if he arrives at S he has 0 waiting time.

    Alice starts time 0 at bus station 1,
    he wants to go bus station N before time T and such that he spends maximum time at BUS.

    Input format:
    N T M -> num of bus station, deadline and number of buses
    U V S E -> buses param (M)

    Output format
    -1
    or
    maximum period of waiting time

     Sample Input :

     5 10 5
     1 2 1 2
     1 5 3 4
     2 4 4 5
     2 5 5 6
     4 5 6 7

     Output : 2
     */
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] ntm = br.readLine().split(" ");

        int n = Integer.parseInt(ntm[0]);
        int t = Integer.parseInt(ntm[1]);
        int m = Integer.parseInt(ntm[2]);

        int[][] uvseValue = new int[m][4];

        for (int i = 0 ; i < m ; i++) {
            String[] val = br.readLine().split(" ");
            for (int j = 0 ; j < 4 ; j++) {
                uvseValue[i][j] = Integer.parseInt(val[j]);
            }
        }

        int result = minimizeMaxWait(n , t , m , uvseValue);
        System.out.println(result);

    }

    static class Bus{
        int to, start, end ;

        public Bus(int end, int start, int to) {
            this.end = end;
            this.start = start;
            this.to = to;
        }
    }

    static class State implements Comparable<State>{
        int station, time, maxWait ;

        public State(int maxWait, int station, int time) {
            this.maxWait = maxWait;
            this.station = station;
            this.time = time;
        }

        @Override
        public int compareTo(State other) {
            return Integer.compare(this.maxWait , other.maxWait);
        }
    }

    public static int minimizeMaxWait(int n , int t , int m , int[][] buses){
        List<List<Bus>> graph = new ArrayList<>();

        for (int i = 0 ; i <= n  ; i++) {
            graph.add(new ArrayList<>());
        }

        //Build the graph
        for (int[] bus : buses){
            int u = bus[0], v = bus[1] , s = bus[2] , e = bus[3];
            graph.get(u).add(new Bus(v,s,e));
        }

        PriorityQueue<State> pq = new PriorityQueue<>();

        pq.add(new State(1,0,0));

        int[][] vistited = new int[n+1][t+1];

        for (int[] row: vistited)
            Arrays.fill(row , Integer.MAX_VALUE);

        while(!pq.isEmpty()){
            State current = pq.poll();

            if (current.station == n){
                return  current.maxWait ;
            }

            if (current.time > t || vistited[current.station][current.time] <= current.maxWait){
                continue;
            }

            vistited[current.station][current.time] = current.maxWait ;

            for (Bus bus : graph.get(current.station)){
                if (current.time <= bus.start){
                    int waitTime = bus.start - current.time;
                    int newTime = bus.end ;
                    int newMaxTime = Math.max(current.maxWait , waitTime);
                    if(newTime <= t && vistited[bus.to][newTime] > newMaxTime){
                        pq.add(new State(bus.to , newTime , newMaxTime));
                    }
                }
            }

        }
        return -1 ;
    }
}
