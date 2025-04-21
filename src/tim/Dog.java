package tim;

public class Dog {

    private static String breed ; /** Just for testing purpose */
    private String name ;

    public Dog(){

    }

    public Dog(String breed , String name){
        this.name = name ;
        this.breed = breed ; /* Not a good practice use Dog.breed instead */
    }

    public static String getBreed() {
        return breed;
    }

    public String getName() {
        return name;
    }
}
