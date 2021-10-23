import java.sql.SQLOutput;
import java.util.Random;

class Method_{
    int jj=99;
    public Method_(){
        String name1= "Mishra";
    }
//    public void jaja(String t){
//        this.name1= t;
////        return t;
////        j=j;
//    }
    private int id;
    private String name_ = new String("Shubham");
    private char c= 'C';
    public char v= 'V';
    public int me(){
        return id;
    }

    public void setName(String s) {
        name_=s;
    }
    public String getName(){
        return name_;
    }
}

public class get_set {
    public static void main(String[] args) {
        Method_ m= new Method_();
//        System.out.println(m.name_);
        System.out.println(m.v);
        m.setName("ANANYA PANDEY");
        System.out.println(m.getName());
        Random rand= new Random();
        int i = rand.nextInt(4);
        System.out.println(i);
//        System.out.println(bar);







    }
}
