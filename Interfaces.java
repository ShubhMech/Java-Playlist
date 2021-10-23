interface Jamaila{
    public int brake(int g);
    public float engine();
}

interface Jamaila2{
    public int brake2(int g);
    public float engine2();
}

class Pankha implements Jamaila, Jamaila2{
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
    }
}
