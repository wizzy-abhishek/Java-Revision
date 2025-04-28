package hemant_sir.contest;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BookExercise {

    // Books are messed up, writes in the back of and keeps updating the remaining exercise
    public static void main(String[] args) throws Exception {

        // n -> number of action
        // then n line follows
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] pile = new String[n];

        for (int i = 0 ; i < n ; i++) {
            pile[i] = br.readLine();
        }

        int min_exe = Integer.MAX_VALUE ;
        int min_index = -1 ;

        for (int i = 0 ; i < n ; i++) {
            String[] curr_sub = pile[i].split(" ");
            if (i == 0 && pile[i].equals("-1") ){
                System.out.println("No book piled");
                continue;
            }
            if (pile[i].equals("-1")){
                System.out.println(pile[min_index] + " " + (i - min_index - 1));
            }
            if ((Integer.parseInt(curr_sub[0]) > 0) && Integer.parseInt(curr_sub[0]) < min_exe){
                min_index = i ;
                min_exe = Integer.parseInt(curr_sub[0]);
            }
        }
    }

    //output ->
    // 1 maths
    // 0 graphics

    // input ->
    // 6
    // 9 english
    // 6 maths
    // 8 geography
    // -1
    // 3 graphics
    // -1
}
