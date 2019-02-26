import java.util.Scanner;

public class Sol5 {

    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);

        System.out.println("enter number of elements");

        int n=s.nextInt();

        int arr[]=new int[n];

        System.out.println("enter elements");

        for(int i=0;i<n;i++){//for reading array1
            arr[i]=s.nextInt();
        }

        System.out.println("enter number of elements for second array");

        int n1=s.nextInt();

        int arr1[]=new int[n1];

        System.out.println("enter elements for second array");

        for(int i=0;i<n1;i++){//for reading array2
            arr1[i]=s.nextInt();
        }

        for(int x=0; x<n; x++){
            for(int y=0; y<n1; y++){

                if(arr[x]==arr1[y]){

                    System.out.println(arr[x] + " is a common element");

                }
            }

        }

    }
}
