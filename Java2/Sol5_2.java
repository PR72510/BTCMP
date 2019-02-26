public class Sol5_1 {
     public int x,y;

     public Sol5_1(int x, int y){
         this.x=x;
         this.y=y;
     }

     public Sol5_1(Sol5_1 s){
         this.x=s.x;
         this.y=s.y;
     }

    public static void main(String[] args) {
        Sol5_1 s1 = new Sol5_1(4,7);
        Sol5_1 s2 = new Sol5_1(s1);

        System.out.println(s1.x+ " "+s1.y);
        System.out.println(s2.x+ " "+s2.y);

        s2.x=5;
        s2.y=9;

        System.out.println(s1.x+ " "+s1.y);
        System.out.println(s2.x+ " "+s2.y);

    }
}
