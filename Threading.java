class Masha extends Thread {
    int i= 0 ;
    int h= 0;

    public void run1() {

        while (h <= 10) {
            System.out.println("Kulla");
            h++;
        }
    }

    public void run() {

        while (i <= 10) {
            System.out.println("halalalalalalalalalalalalala");
            i++;
        }
    }
}
class Pasha extends Thread {
    int j= 0;
    int g=0;
    public void run2() {

        while (g <= 100000) {
            System.out.println("<Mulla>");
            g++;
        }
    }
    public void run() {
        while (j <= 10) {
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
            p2.run2();
        }
}

