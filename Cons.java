public class Cons {
    int n;
    String s1;
    public Cons(int x, String s) {
        this.n = x;
        s1= s;

    }
    public String getN() {
        this.n=9090;
        System.out.println(this.n);
        return this.s1;
    }
    public void set_name(){
        s1="Shuturmurg";
        System.out.println(s1);
    }

    public static void fff(){
        System.out.println("ahahahahahahahahahahahha");
    }

    public static void main(String[] args) {
        Cons ob1 = new Cons(6, "Shubham");
//        System.out.println(ob1.n);
//        System.out.println(ob1.getN());
        ob1.set_name();
        System.out.println(ob1.s1);
//        fff();


    }

}


//public class Main {
//    int x;
//
//    public Main(int y) {
//        x = y;
//    }
//
//    public static void main(String[] args) {
//        Main myObj = new Main(5);
//        System.out.println(myObj.x);
//    }

