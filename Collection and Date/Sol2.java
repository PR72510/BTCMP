import java.util.*;

public class Sol2 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the String-");
        String str = s.nextLine();
        char[] ch = str.toCharArray();

        System.out.println("Total no. of unique characters are : "+ unique(ch));

    }

    private static int unique(char arr[]){

        LinkedHashMap<Character, Integer> list  = new LinkedHashMap<>();
        for(char c1 : arr){
            if(list.containsKey(c1)){               // if list already contains c1
                list.put(c1,list.get(c1)+1);        // then it`s next entry gets value 2 or greater
            }
            else{                                   // if list does not contain key c1
                list.put(c1,1);                     // 1 is assigned as value for corresponding key
            }
        }
        for(Map.Entry e : list.entrySet()){                 // entrySet returns set view of mappings contained in this map
            if((int)e.getValue()==1){                       //.getValue returns value corresponding to that entry
                System.out.println(e.getKey());
            }
            else{
                list.remove(e);                     // changes in entrySet are reflected in Map from which it sets view and vice versa
            }
        }
        return list.size();
    }
}
