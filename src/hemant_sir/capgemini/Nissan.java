package hemant_sir.capgemini;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

// stack of N
// first element -> top of stack.
// stack can be converted into queue, not vice versa
// bottom of the stack -> front of the queue
// remove K element such that sum of the K removed is maximum
public class Nissan {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] nAndK = br.readLine().split(" ");

        int n = Integer.parseInt(nAndK[0]);
        int k = Integer.parseInt(nAndK[1]);

        String[] array = br.readLine().split(" ");

        int[] ar = new int[n];

        for (int i = 0 ; i < n ; i++) {
            ar[i] = Integer.parseInt(array[i]);
        }

        final var max = getMax(ar, k);

        System.out.println(max);

    }
    // 10,9,1,2,3,4,5,6,7,8
    private static int getMax(int[] ar, int k) {
        int n = ar.length;

        int[] frontSum = new int[k + 1];
        int[] backSum = new int[k + 1];

        for (int i = 1; i <= k; i++) {
            frontSum[i] = frontSum[i - 1] + ar[i - 1];
        }

        for (int i = 1; i <= k; i++) {
            backSum[i] = backSum[i - 1] + ar[n - i];
        }

        int max = 0;

        for (int i = 1; i <= k; i++) {
            int back = k - i;
            if (back <= n - i) {
                int total = frontSum[i] + backSum[back];
                max = Math.max(max, total);
            }
        }

        return max;
    }
}
