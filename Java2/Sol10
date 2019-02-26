import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Sol10 {
    public static void main(String[] args) {
        Customer customer=new Customer();
        customer.order_placed();
    }
}
class Customer extends Cashier{
    int amt[]={100,150,200};
    int cash;
    int order;
    int token;
    boolean c1=true;
    public void order_placed(){
        while(c1){
            System.out.println("Please select your drink... \n 1:Espresso \n 2:Cappuccino \n 3:Latte\n 4:Exit");
            System.out.println("Select your order:- ");
            order=new Scanner(System.in).nextInt();
            if((order==1)||(order==2)||(order==3)) {
                System.out.println("Please pay cash. Your amount is : "+amt[order-1]);
                cash=new Scanner(System.in).nextInt();
                order(cash,order);
            }
            else if (order==4){
                System.out.println("Thank You for coming");
                c1=false;
            }
            else System.out.println("Please select correct option");

        }

    }

    public void order_delivered(){
        System.out.println("Please collect your order. Enjoy your coffee");
    }
}

class Cashier extends Barista{
    int amt[]={100,150,200};
    int token=0;
    Queue<Integer> q = new LinkedList<>();
    public void order(int cash, int order){
        if(cash>=amt[order-1]) { token++;
            System.out.println("Your order will be delivered soon. ");
            if(cash>amt[order-1]) System.out.println("Your remaining cash :"+(cash-amt[order-1]));
            System.out.println("Your token number is:"+token);
            q.add(order);
            deliver(q.peek());          // Retrieve the first element from the stack
            q.remove();
        }
        else System.out.println("You ned to pay " +(amt[order-1]-cash)+ " more");

    }}
class Barista{
    String Drink;
    void deliver(int order){
        if(order==1) {
            Drink = "Espresso";
        }
        else if(order==2){
            Drink = "Capuccino";
        }
        else{
            Drink = "Latte";
        }
        System.out.println(Drink+ " Delivered");
    }
}
