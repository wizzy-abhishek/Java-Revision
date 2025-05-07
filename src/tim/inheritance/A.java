package tim.inheritance;

public class A {

    public static void main(String[] args) {
       X zoo = new Zoo();
       zoo.a();
    }
}

@FunctionalInterface
interface X {
    void a();
}

@FunctionalInterface
interface Y extends X {

    void z();

    default void a(){

    }

    default void n(){}
}

class Zoo implements Y {

    public void see(){
        System.out.println("Watch");
    }

    @Override
    public void z() {

    }
}