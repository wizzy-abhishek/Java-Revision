package tim.inheritance;

public class Composition {
    public static void main(String[] args) {
        Animal fishAnimal = new Animal(false , 5);
        Fish fish = new Fish(fishAnimal , "GoldFish");
        fish.makingSound();

        Animal dogAnimal = new Animal(true , 50);
        Dog dog = new Dog(dogAnimal , "German sephard");
        dog.barking();
    }
}

class Animal {

    private int weight ;
    private boolean hasFur ;

    public Animal(boolean hasFur, int weight) {
        this.hasFur = hasFur;
        this.weight = weight;
    }

    public void makeSound(){
        System.out.println("Animal making sound");
    }
}

class Dog {
    private Animal animal ;
    private String breed ;

    public Dog(Animal animal, String breed) {
        this.animal = animal;
        this.breed = breed;
    }

    public void barking(){
        animal.makeSound();
        System.out.println("Woof Woof");
    }
}

class Fish {

    private String type ;
    private Animal animal ;

    public Fish(Animal animal, String type) {
        this.animal = animal;
        this.type = type;
    }

    public void makingSound(){
        animal.makeSound();
        System.out.println( type +" tiking" );
    }

}
