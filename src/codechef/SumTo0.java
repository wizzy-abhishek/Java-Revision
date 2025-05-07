package codechef;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SumTo0 {

    public static void main (String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());

            if (n == 1) {
                System.out.println("-1");
                continue;
            }

            int[] array = new int[n];
            int currentSum = 0;

            for (int i = 0 ; i < n ; i++) {
                if (currentSum == 3) {
                    array[i] = -3;
                    currentSum = 0;
                } else if (i == n - 1) {
                    if (currentSum != 0) {
                        array[i] = -currentSum;
                    } else {
                        array[i] = -1;
                    }
                } else {
                    array[i] = 1;
                    currentSum += 1;
                }
            }

            if (array[n - 1] == 0 || Math.abs(array[n - 1]) > 3) {
                System.out.println("-1");
            } else {
                for (int num : array) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }
        }
    }
}
