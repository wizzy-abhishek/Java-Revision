package tim;

public class Main {
    public static void main(String[] args) {
        //Constructor c = new Constructor(1);
        //System.out.println(Constructor.name);

        Dog dog1 = new Dog("German Sephard" , "Tuffy");

        System.out.println(dog1.getName() + " -- " + dog1.getBreed());

        Dog dog2 = new Dog("CHUWAWA" , "Lets see");
        System.out.println(dog2.getName() + " -- " + Dog.getBreed());

        System.out.println("Dog1 -> " +dog1.getName() + " -- " + dog1.getBreed());

    }
}
