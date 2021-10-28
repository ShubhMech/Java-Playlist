package com.Edu;
class Masha implements Runnable {
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
class Pasha implements Runnable {
    int j= 0;
    int g=0;
    public void run2() {

        while (g <= 10) {
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

public class Runn {
    public static void main(String[] args){
        Masha p1= new Masha();
        Thread t1 = new Thread(p1);
        t1.start();
        Pasha p2 =new Pasha();
        Thread t2 = new Thread(p2);
        t2.start();
        p2.run2();
    }
}


