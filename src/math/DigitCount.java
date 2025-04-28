package math;

public class DigitCount {
    public static void main(String[] args) {
        int number = 1_00;
        int count = 0 ;

        while(number >= 1){
            count++ ;
            number = number /10;
        }

        System.out.println(count);
    }
}
