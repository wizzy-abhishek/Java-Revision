package striver;

public class DecimalToBinary {
    public static void main(String[] args) {
        System.out.println(decimalToBinary(9));
    }

    private static long decimalToBinary(int decimal){
        if(decimal <= 1){
            return decimal;
        }

        return (decimalToBinary(decimal/2) * 10) + decimalToBinary(decimal%2);
    }
}
