class Cl{
    int aa; String ss;
    Cl(int a, String s){
        aa= a;
        ss=s; }
    Cl(){
        System.out.println("In constructor of base");

    }

}

class Cl1 extends Cl{
//    int gg;
//    String sst;
//    super(66,"Mishra");
//    Cl1(int as, String ss1){
//        gg=as;
//        sst= ss1;
//    }
    Cl1(){
        super(66,"Mishra");
        System.out.println("In constructor of derived");
    }
//    Cl1(int y){
//        super(66,"Mishra");
//        System.out.println("Maja aa gaya Bhidu");
//    }

}

public class Ga {
    public static void main(String[] args) {
        Cl cl1= new Cl();
        Cl cl11= new Cl(555,"Gandush");
//        System.out.println();

        System.out.println(" ");
        Cl1 cl2 = new Cl1();
//        Cl1 cl22= new Cl1(55);
        System.out.println(cl2.aa);
        System.out.println(cl2.ss);


    }

}
