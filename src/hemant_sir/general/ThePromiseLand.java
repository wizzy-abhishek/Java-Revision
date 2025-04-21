package hemant_sir.general;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* TODO:
 N (vertically) x M (horizontal) array -> rectangle piece of land
 X river in horizontal direction
 Y river in vertical dir
 house -> S*S in remaining land
 Max house such that, no house overlap and not on river
 */
public class ThePromiseLand {

    // t -> test case
    // N and M
    // X Y S
    // Values of x, such that Xi is eow in which river is flowing horizontally
    // Values of Y, such that Yi denoting the indices of column river flowing vertically

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            String[] nAndM = br.readLine().trim().split(" ");
            int n = Integer.parseInt(nAndM[0]);
            int m = Integer.parseInt(nAndM[1]);

            String[] xYAndS = br.readLine().trim().split(" ");
            int x = Integer.parseInt(xYAndS[0]);
            int y = Integer.parseInt(xYAndS[1]);
            int s = Integer.parseInt(xYAndS[2]);

            int[][] area = new int[n][m];

            String[] xIValues = br.readLine().trim().split(" ");
            for (int i = 0; i < x; i++) {
                int row = Integer.parseInt(xIValues[i]) - 1;
                if (row >= 0 && row < n) {
                    Arrays.fill(area[row], 1);
                }
            }

            String[] yIValues = br.readLine().trim().split(" ");
            for (int i = 0; i < y; i++) {
                int col = Integer.parseInt(yIValues[i]) - 1;
                if (col >= 0 && col < m) {
                    for (int row = 0; row < n; row++) {
                        area[row][col] = 1;
                    }
                }
            }

            int count = 0;

            // Check for all SxS blocks starting from (i, j)
            for (int i = 0; i <= n - s; i++) {
                for (int j = 0; j <= m - s; j++) {
                    boolean canPlace = true;

                    for (int x1 = 0; x1 < s && canPlace; x1++) {
                        for (int y1 = 0; y1 < s; y1++) {
                            if (area[i + x1][j + y1] == 1) {
                                canPlace = false;
                                break;
                            }
                        }
                    }

                    if (canPlace) {
                        count++;

                        for (int x1 = 0; x1 < s; x1++) {
                            for (int y1 = 0; y1 < s; y1++) {
                                area[i + x1][j + y1] = 1;
                            }
                        }
                    }
                }
            }

            System.out.println(count);
    }
}


    // Sample input
    /*
    * 2 -> t
    * 7 8 -> N * M
    * 1 2 2 -> X Y S
    * 5 -> Xi
    * 4 8 -> Yi
    * t2
    * 6 5
    * 2 0 1
    * 1 4
    * 0
    */

    //Sample output
    // 6
    // 20
}
