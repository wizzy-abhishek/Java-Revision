package tim.inheritance;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AbsCheck {

    public static void main(String[] args) {
        
        Animals dogs = new Dogs();
        Mammal fish = new Fishs();
        Dogs d = new Dogs();

        System.out.println(dogs.x);
        System.out.println(fish.x);
        System.out.println(d.x);

        System.out.println(fish.getDetails());
        fish.abs();
            //or
        if (dogs instanceof Mammal mammal){
            System.out.println(mammal.getDetails());
        }

        String s = "";
        s.compareTo("a");

        System.out.println();

    }
}

abstract class Animals{
    int x = 10 ;

    public Animals() {
        System.out.println("Hello");
    }

    protected abstract void move();

    void abs(){
        System.out.println("Hello abs");
    }


}

abstract class Mammal extends Animals{
    public final String getDetails(){
        return getClass().getSimpleName();
    }

}

class Dogs extends Mammal{

    int x = 30 ;

    @Override
    public void move() {
        System.out.println("Dog moving");
        /*System.out.println(getDetails());*/
    }

    @Override
    void abs() {
        super.abs();
    }
}

class Fishs extends Mammal{

    @Override
    protected void move() {
        System.out.println("Fish moves");
    }

    public void swim(final int z){
/*        z = 2;*/
        System.out.println("Fish swimming");
    }
}

interface Sum {
    int add(int a , int b);
}