public class Q9 {

    public static void main(String[] args) {
        for(Houses h : Houses.values()){
            h.getPrice();
        }
    }
}

enum Houses{
    Flat(10000),Appartment(200000),Villa(500000);

    int cost;
    Houses(int p){
        cost = p;
    }
     public void getPrice(){
         System.out.println("Cost of " +name()+ " is " +cost);
     }

}
