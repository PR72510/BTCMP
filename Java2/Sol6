import java.util.Scanner;

public class Sol6 {

    public static void main(String[] args) {
        int a,b,arr[]=new int[5];
        float res;
        Scanner sc =new Scanner(System.in);
        Sol6 obj=new Sol6();
        System.out.println("Enter First Number");
        a=sc.nextInt();
        System.out.println("Enter Second Number");
        b=sc.nextInt();
        try {
            res=obj.div(a,b);
            System.out.println(res);
            res=arr[5];
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Execption:- Cannot divide by 0");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds Execption");
        }
        finally {
            System.out.println("Inside finally block");
        }



    }
    public float div(int a,int b){
        return a/b;
    }
}
