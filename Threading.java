class Masha extends Thread {
    int i= 0 ;

    public void run() {
        while (i <= 10000) {
            System.out.println("halalalalalalalalalalalalala");
            i++;
        }
    }
}
class Pasha extends Thread {
    int j= 0;

    public void run() {
        while (j <= 10000) {
            System.out.println("hajajajajajajajajajajajajaalalalalqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqa");
            j++;
        }
    }
}

public class Threading {
        public static void main(String[] args){
            Masha p1= new Masha();
            p1.start();
            Pasha p2 =new Pasha();
            p2.start();

        }
}

