package inheritance;

public class inher {
     void eat() {
        System.out.println("The animal is eating.");
    }

    void sleep() {
        System.out.println("The animal is sleeping.");
    }
}
class Bird extends inher {
    
    @Override
    void eat() {
        System.out.println("The bird is pecking at some seeds.");
    }

    
    @Override
    void sleep() {
        System.out.println("The bird is sleeping in its nest.");
    }

    
    void fly() {
        System.out.println("The bird is flying in the sky.");
    }
}\
public class Main {
    public static void main(String[] args) {
       
        inher animal = new inher();
        System.out.println("Inher Object:");
        animal.eat();
        animal.sleep();

        System.out.println("\nBird Object:");
     
        Bird bird = new Bird();
        bird.eat();
        bird.sleep();
        bird.fly();
    }
}
