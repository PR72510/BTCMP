public class Sol10 {

    public int add(int a, int b){
        return a+b;
    }

    public double add(double a, double b){
        return a+b;
    }

    public float mult(float a, float b){
        return a*b;
    }

    public int mult(int a, int b){
        return a*b;
    }

    public String conc(String a, String b){
        return a.concat(b);
    }

    public String conc(String a, String b, String c){
        String v1 = a.concat(b);
        return v1.concat(c);
    }

    public static void main(String[] args) {

        Sol10 obj = new Sol10();
        int res1 = obj.add(6,4);
        double res2 = obj.add(6.0,4.0);
        int res3 = obj.mult(4,7);
        float res4 = obj.mult(4.6f,8.5f);
        String res5 = obj.conc("intell","iJ");
        String res6 =  obj.conc("intell", "iJ","IDEA");

        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
        System.out.println(res4);
        System.out.println(res5);
        System.out.println(res6);
    }
}
