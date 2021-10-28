import java.util.Scanner;
abstract class Pen{
    public void write(){};
//        return null;

    public void read(){
//        return null;
    };
    }
class Jaja extends Pen {
    String s2;
    public void write() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the test you want to include");
        String s1 = sc.nextLine();
//        System.out.println(s1);
        s2= s1;
    }
//    String s2 = s1;
    public void read() {
//        System.out.println(s1);
        System.out.println("Printing the message now");
        System.out.println(s2);
    }

}

public class NewPractice {
    public static void main(String[] args) {
        Jaja j1 = new Jaja();
        j1.write();
        j1.read();
//        System.out.println(j1.s1);


    }
}

