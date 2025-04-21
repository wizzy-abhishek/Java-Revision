package tim;

public class Constructor {

    protected static String name = "Gargi";

    private String number ;
    private String about ;
    private int balance ;

    public Constructor(String number, String about , int balance) {
        this.number = number;
        this.about = about;
        this.balance = balance ;
    }

    public Constructor(String number, int balance, String about ) {
        this.number = number;
        this.about = about;
        this.balance = balance ;
    }

    public Constructor(int a) {
        System.out.println("Abhishek");
    }

/*    public int Constructor() {
        return 1 ;
    }*/
}
