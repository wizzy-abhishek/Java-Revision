package practical;

import java.util.ArrayList;
import java.util.List;

public class EmailPreProcess {

    public static void main(String[] args) {

        List<String> enrol = new ArrayList<>(List.of("0111CS221006", "0111CS221084"));
        List<String> name = new ArrayList<>(List.of("Abhishek", "Gargi"));

        System.out.println(email(enrol , name));

    }

    public static List<String> email(List<String> enrol , List<String> name){
        List<String> email = new ArrayList<>();
        for (int i = 0 ; i < enrol.size() ; i++){
            String enrollment = enrol.get(i).toLowerCase();
            String student_name = name.get(i).toLowerCase() ;
            email.add(enrollment + "." + student_name + "@technocratsgroup@edu.in");
        }
        return email ;
    }


}
