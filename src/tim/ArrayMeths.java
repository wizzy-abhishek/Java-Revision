package tim;

import java.util.*;

public class ArrayMeths {
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5, 7, 1, 3};
        array[0] = 99;
        Arrays.sort(array);
        reverseArray(array);
        System.out.println(Arrays.toString(array));

        List<String > a = List.of("Hello", "Abhishek");
       /* a.sort(Comparator.naturalOrder());
        System.out.println(a);*/
        LinkedList<String> s = new LinkedList<>(a);
        for (int i = 0 ; i < 3 ; i++) {
            s.add("Abhishek An");
            System.out.println(s.get(i));
            if (s.get(i).equals("Hello")) {
                s.remove(i);
            }
        }
        System.out.println(s);
       /* s.add("Abhishek");
        s.removeAll(List.of("Abhishek", "Hello"));
        System.out.println(s);*/
    }

    private static void reverseArray(int[] array){
        int len = array.length - 1 ;
        int i = 0 ;
        while (i < len){
            array[i] = array[i] ^ array[len] ;
            array[len] = array[i] ^ array[len];
            array[i] = array[i] ^ array[len];
            i++;
            len-- ;
        }
    }
}
