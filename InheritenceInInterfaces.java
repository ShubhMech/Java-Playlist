//import org.w3c.dom.ls.LSOutput;

interface Chalega{
    public void haha();
    public int gaga();
}
interface Chalunga extends Chalega{

    default void naja(){
        System.out.println("Mat ja bhai");
    }
}

class ChalnaHaiToChal implements Chalunga, Chalega{
    int g =77;
//    System.out.println("Aa gaye class me");
    public void haha(){
        System.out.println("Implementing Chalega");
    }
    public int gaga() {
        return 1;
    }

    public int bhabha() {
        return 100;
    }



}
public class InheritenceInInterfaces {
    public static void main(String[] args) {
        ChalnaHaiToChal x =new ChalnaHaiToChal();
        System.out.println(x.gaga());
        x.haha();
        Chalega c1= new ChalnaHaiToChal();
        c1.haha();
//        c1.bhabha(); Not allowed to run methods of implementing class due to polymorphism
//        c1.naja(); Not allowed

    }
}
