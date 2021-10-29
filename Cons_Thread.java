class Thr extends Thread{
    String name;
    public Thr(String name){
        super(name);
        this.name= name;
    }
    public void run(){
        System.out.println("Staring thr thread with name as : " + this.name );
    }
    public void run1() {
        int h=0;
        while (h <= 1000) {
            System.out.println("Kulllllllllllllllllllllllllllllllla");
            h++;
        }
    }

    public void run2() {
        int h1=0;
        while (h1 <= 1000) {
            System.out.println("Khulla");
            h1++;
        }
    }
}

public class Cons_Thread {
    public static void main(String[] args) {
        Thr thr= new Thr("Shubham's Thread");
        thr.start();
        System.out.println(thr.getId());
        System.out.println(thr.getName());
        System.out.println(thr.getPriority());

        Thr thr2= new Thr("Mishra's Thread");
        thr2.start();
        System.out.println(thr2.getId());
        System.out.println(thr2.getName());
        System.out.println(thr2.getPriority());

        thr.run2();
        thr2.run1();;
    }

}
