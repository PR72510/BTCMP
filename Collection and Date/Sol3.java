import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Sol3 {
   public static void main(String... a) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the String-");
        String str = s.nextLine().toLowerCase();
        no_of_occurence(str);

    }

    private static void no_of_occurence(String str){
        char[] arr = str.toCharArray();
        HashMap<Character, Integer > list = new HashMap<>();

        for(char ch : arr){
            if(list.containsKey(ch)){
                list.put(ch, list.get(ch)+1);
            }
            else{
                list.put(ch,1);
            }
        }
        for(char key : list.keySet()){
            System.out.println(key+ " occured " +list.get(key)+ " Times " );
        }

    }
}
