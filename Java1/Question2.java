import java.util.Scanner;

public class Sol2 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the string");
        String input_String = s.nextLine();

        String[] arr = input_String.split(" ");

        for(int i=0; i< arr.length; i++){
            int count=1;
            if(arr[i].equals("@")){
              continue;
            }
            for(int j=i+1; j<arr.length; j++){

                if(arr[i].equals(arr[j])){
                  count++;
                  arr[j]="@";
                }

            }
            if(count > 1)
            System.out.println(arr[i] + " occured " + count + " times ");
        }

    }

}
