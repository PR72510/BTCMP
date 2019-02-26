public class Sol5 implements Cloneable {

    int roll_no;
    String name;

    Sol5(int roll_no, String name) {
        this.roll_no = roll_no;
        this.name = name;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        try {
            Sol5 s1 = new Sol5(101, "John");
            Sol5 s2 = (Sol5) s1.clone();

            System.out.println(s1.roll_no+ " " +s1.name);
            System.out.println(s2.roll_no+ " " +s2.name);

            s2.name="Rick"; s2.roll_no = 102;

            System.out.println(s1.roll_no+ " " +s1.name);
            System.out.println(s2.roll_no+ " " +s2.name);

        }

        catch (CloneNotSupportedException e){}
    }
}
