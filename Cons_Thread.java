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
        while (h <= 10) {
            System.out.println("Kulllllllllllllllllllllllllllllllla");
            h++;
        }
    }

    public void run2() {
        int h1=0;
        while (h1 <= 10) {
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


        Thr thr2= new Thr("Mishra's Thread");
        thr2.start();
        System.out.println(thr2.getId());
        System.out.println(thr2.getName());


        Thr thr3= new Thr("Swati's Thread");
        thr3.start();
        System.out.println(thr3.getId());
        System.out.println(thr3.getName());


        Thr thr4= new Thr("Dixit's Thread");
        thr4.start();
        System.out.println(thr4.getName());


        thr.run2();
        thr2.run1();
        thr2.setPriority(Thread.NORM_PRIORITY);
        thr3.setPriority(Thread.MAX_PRIORITY);
        thr4.setPriority(Thread.MIN_PRIORITY);

        System.out.println(thr4.getPriority());
        System.out.println(thr2.getPriority());
        System.out.println(thr.getPriority());
        System.out.println(thr3.getPriority());
    }

}
