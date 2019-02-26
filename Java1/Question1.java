import java.util.Scanner;

public class Sol1 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the string");
        String input_String = s.nextLine();

        System.out.println("Enter the sub-string to be replaced ");
        String Pre_String = s.nextLine();

        System.out.println("Enter the new sub-string");
        String new_String = s.nextLine();

       input_String = input_String.replace(Pre_String,new_String);

        System.out.println("New String \n" + input_String);

    }
}
