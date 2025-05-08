package hemant_sir.cognigent;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class NextPermutation {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());

        System.out.println(nextP(number));

    }

    private static int nextP(Integer number) {

        char[] numArray = String.valueOf(number).toCharArray();
        int j = numArray.length -1 ;

        while(j > 0){
            char[] arrayCopy = Arrays.copyOf(numArray , numArray.length);
            int newNum = swap(arrayCopy , j);
            if (newNum > number){
                return newNum ;
            }
            j-- ;
        }

        return -1 ;
    }

    private static int swap(char[] array, int target) {
        char temp = array[target];
        array[target] = array[target -1];
        array[target -1 ] = temp ;

        return Integer.parseInt(new String(array));
    }

}