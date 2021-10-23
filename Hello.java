class Baba{
    public int g=78;
    static int b= 66;

    public static int getB() {
        return b;
    }

    public static void setB(int b) {
        Baba.b = b;
    }
    public static void kalam(){
        int gggg= 555;
        System.out.println(gggg);

    }

}


class Nana extends Baba{
//    System.out.println(g);
//    System.out.println(b);
    static public void method (){
        System.out.println("Ashshshhsshhshshshshshshs");
    }
//    System.out.println("Ahshshshshshshshshshshshshsh");
}


public class Hello {
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public static void main(String[] args) {
        Baba dd =new Baba();
//        System.out.println(dd.gggg);
        System.out.println(dd.b);
        dd.kalam();

        Nana nn =new Nana();
//        System.out.println(nn.gggg);
        System.out.println(nn.b);
        nn.kalam();
    }
}
