import com.sun.security.jgss.GSSUtil;

import java.util.Random;

public class Game {
    static int n;

    public Game(int x){
        n= x;
    }



    public static void Gamee(){
        Random rand= new Random();
        int num= rand.nextInt(5);
        if ( n== num){
            System.out.println(n);
            System.out.println(num);
            System.out.println("You won!!");
        }
        else if (n>num){
            System.out.println("Random number is : " +n);
            System.out.println("Num is : " + num);
            System.out.println("You lost! And num is smaller");
        }
        else if(n<num){
            System.out.println("Dekh bhai num bada ho gaya");
        }
    }

    public static void main(String[] args) {
        Game g1= new Game(3);

        Gamee();

    }

}
