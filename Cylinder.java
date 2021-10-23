public class Cylinder {
    static float radius;
    static float height;
    public Cylinder(float h, float r){
        radius= r;
        height= h;

    }

    static public float Area(){
        float r_2= radius*radius;
        float area = r_2*height;
        return area;

    }
    public float kshetrafal(){
        float r_2= radius*radius;
        float area2 = r_2*height;
        return area2;

    }

    public static void main(String[] args) {
        Cylinder c1= new Cylinder(3.5f, 8.9f);
        System.out.println(Area());
        System.out.println(c1.kshetrafal());
    }


}


