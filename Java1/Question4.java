import java.util.Scanner;

public class Sol4 {

    public static void main(String[] args) {
        int L_case=0, U_case=0, Dig=0, S_sym=0;
        float p_Low,p_Up,p_Dig,p_Spe;


        Scanner s = new Scanner(System.in);
        System.out.println("Enter the string");
        String input_String = s.nextLine();

        float len = input_String.length();

        for(int i=0; i<input_String.length(); i++ ){

            if(Character.isUpperCase(input_String.charAt(i))){
                U_case++;
            }
            else if((Character.isLowerCase(input_String.charAt(i)))){
                L_case++;
            }
            else if(Character.isDigit(input_String.charAt(i))){
                Dig++;
            }
            else{
                S_sym++;
            }

        }
        p_Up = ((U_case/len)*100);
        p_Low = ((L_case/len)*100);
        p_Dig = ((Dig/len)*100);
        p_Spe = ((S_sym/len)*100);

        System.out.println("No. of Upper Case " + U_case + "\n" +
                            "No. of Lower Case " + L_case + "\n" +
                            "No. of Digit " + Dig + "\n" +
                            "No. of Special Characters" + S_sym);

        System.out.println("Percentage of Upper Case " + p_Up + "\n" +
                            "Percentage of Lower Case " + p_Low + "\n" +
                            "Percentage of Digit " + p_Dig + "\n" +
                            "Percentage Special Characters " + p_Spe);


    }


}
