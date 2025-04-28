package tim.strings;

public class StringPractice {
    public static void main(String[] args) {
        String indexOf = "Hello World";
        String s1 = new String("Hello World") ;

        System.out.println(indexOf.indexOf("o"));
        System.out.println(indexOf.indexOf("l" , 3));
        System.out.println(indexOf.lastIndexOf("l" , 8));

        System.out.println(s1.contentEquals(indexOf));
        System.out.println(indexOf.regionMatches(0, "Hello" , 4 , 5));
    }
}
