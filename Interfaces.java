interface Jamaila{
    public int f=56;
    public int brake(int g);
    public float engine();

//    public int brake1(int g){
//        System.out.println("hahahaha"+g);
//        return 45;
//    }

}

interface Jamaila2{

    private void musu(){
        System.out.println("Implementing the private method");
    }

    default public void susu(){
        musu();
        System.out.println("Implementing the default method");
    }
    public int brake2(int g);
    public float engine2();
}

class Pankha implements Jamaila, Jamaila2{
    int f=6;
    public int brake(int g){
        System.out.println("hahahaha"+g);
        return 45;
        }
    public float engine(){
        System.out.println("Bwahahahaha");
        return 56;
        }

    public int brake2(int g){
        System.out.println("hahahaha"+g);
        return 45;
    }
    public float engine2(){
        System.out.println("Bwahahahaha");
        return 56;
    }
}

public class Interfaces {
    public static void main(String[] args) {
        System.out.println("nananananana");
        Pankha p =new Pankha();
        p.brake(666);
        p.engine();
        p.susu();
//        p.f=56;
    }
}
