package tim.inheritance;

public class Main {
    public static void main(String[] args) {
        SchoolStudent abhishek = new SchoolStudent("Abhishek" ,
                "21" ,
                "Ajay" ,
                "10" ,
                "TIT");
        abhishek.details();
    }
}

class Child {
    private String name ;
    private String age ;

    public Child(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getAge() {
        return age;
    }

    protected String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " age is " + age;
    }
}

class Student extends Child{
    private final String parentName ;
    private final String standard ;

    public Student(String name, String age, String parentName, String standard) {
        super(name, age);
        this.parentName = parentName;
        this.standard = standard;
    }

    public String getStandard() {
        return standard;
    }

    public String getParentName() {
        return parentName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "parentName='" + parentName + '\'' +
                ", standard='" + standard + '\'' +
                '}';
    }
}

class SchoolStudent extends Student {
    private String schoolName ;

    public SchoolStudent(String name, String age, String parentName, String standard , String schoolName) {
        super(name, age, parentName, standard);
        this.schoolName = schoolName ;
    }

    public void details(){
        System.out.println("The student " + getName() + " is of " + getAge() +"\nHe is in " + getStandard() + " in " + schoolName + "\nHis parent is " + getParentName());
    }
}

