class Monkey{
    int height = 100;
    int weight= 55;
    public void jump(){
        System.out.println("I am a monkey, I jump often!");
    }
    public void bite(){
        System.out.println("I am a monkey and I bite often");

    }
}

class Human extends Monkey{
    public void eat(){
        System.out.println("Eat monkey, eat!");
    }
    public void sleep(){
        System.out.println("So ja bhosdike");
    }
}

public class Monkey_Human {
    public static void main(String[] args) {
        Human h1= new Human();
        h1.eat();
        h1.sleep();
        h1.bite();
        h1.jump();
    }
}
