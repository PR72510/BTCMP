public class Sol4 {

    private static Sol4 sin_instance = null;

    public String s;

    private Sol4() {
        s = "String";
    }
        public static Sol4 getInstance()
        {
            if (sin_instance == null)
                sin_instance = new Sol4();

            return sin_instance;
        }

}

class Main
{
    public static void main(String args[])
    {

         Sol4 x = Sol4.getInstance();


        Sol4 y = Sol4.getInstance();


        Sol4 z = Sol4.getInstance();


        x.s = (x.s).toUpperCase();

        System.out.println("String from x is " + x.s);
        System.out.println("String from y is " + y.s);
        System.out.println("String from z is " + z.s);
        System.out.println("\n");


        z.s = (z.s).toLowerCase();

        System.out.println("String from x is " + x.s);
        System.out.println("String from y is " + y.s);
        System.out.println("String from z is " + z.s);
    }
}


