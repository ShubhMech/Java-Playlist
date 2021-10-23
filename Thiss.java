class Lauda{
    int a;
    Lauda(int a){
        this.a=a;

    }

    public void java(){
        System.out.println("Java hai Java");

    }
    public void java(int g){
        System.out.println("Java hai Java " + g );
    }

    public int java(int h, int h1){
        System.out.println("Java hai Java " + h);
        System.out.println("Java hai Java " + this.a);
        return h1;
    }
}

class Lahsun extends Lauda{

    int a1;
    Lahsun(int a1) {
        super (44);
        this.a1 = a1;
    }
    @Override
    public int java(int h, int h1){
        System.out.println("Java hai Mava " + h1);
        System.out.println("Java hai Mava " + h);
        return h;
    }

    public int java1(int h, int h1){
        System.out.println("Java hai Mava " + h1);
        System.out.println("Java hai Mava " + h);
        return h;
    }

}

public class Thiss {
    public static void main(String[] args) {
        Lauda l1= new Lauda(77);
        System.out.println(l1.a);
//        l1.java();
//        l1.java(5, 55);
//        l1.java(9666);
        Lahsun l2= new Lahsun(66);
        l2.java(4,6);
        System.out.println(l2.a);
//        l2.java();
        Lauda l3= new Lahsun(444);
        l3.java(5,8);
//        l3.java();
//        l3.java1(6,4);
        


    }
}
