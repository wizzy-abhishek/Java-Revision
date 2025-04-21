package striver;

public class BinaryToDecimal {
    public static void main(String[] args) {
        System.out.println(binaryToDecimal(11));
    }

    private static int binaryToDecimal (int binary){
        String binaryValue = String.valueOf(binary);

        int decimal = 0;
        int power = 0 ;
        for (int i = binaryValue.length() - 1  ; i >= 0  ; i--) {
            if(binaryValue.charAt(i) == '1'){
                decimal += (int) Math.pow(2,power);
            }
            power++ ;
        }

        return decimal ;
    }
}
