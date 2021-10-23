class Circle {
    public float r;
    Circle(float s){
        r= s;
    }

    public float area(float r1) {
        this.r = r1;
        return (float) (Math.PI * r * r);

    }
}
class Cylind extends Circle{
    float radius;
    float height;
    Cylind(float r, float h){
        super(r);
        radius= r;
        height= h;


    }
    public float area(){
//        System.out.println(h);
//        System.out.println(this.r);
        return (float) (Math.PI*this.radius*this.radius)*height;

}
}



public class Area {
    public static void main(String[] args) {
        Cylind c= new Cylind(4.5f, 6.7f);
        float ans1=c.area();
        System.out.println(ans1);
//
    }
}

