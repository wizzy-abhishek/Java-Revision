package striver;

public class CheckIthBit {
    /**
     *
     * If iTh bit is 1, it is set or else not.
     * <p>
     * SOLUTION :
     * If we left shift 1 by iTh index and do an 'AND' with the number,
     * if that place contain 1 then we will get any number or else we will get zero,
     * as 0 & with any number is zero.
     */
    public static void main(String[] args) {
        int number = 21;

        if((number & (1 << 2)) == 0){
            System.out.println("Zero");
        }else{
            System.out.println("1");
        }
    }
}
