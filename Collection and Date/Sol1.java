import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Sol1 {

    public static void main(String[] args) {
        float res = 0;
        List<Float> list = new ArrayList<>();
        list.add(3.27f);
        list.add(9.34f);
        list.add(6.64f);
        list.add(7.18f);
        list.add(8.38f);

        System.out.println("Elements are : ");
        Iterator<Float> iterator = list.iterator();
        while(iterator.hasNext()){
            float num = iterator.next();

            if(iterator.hasNext()) {
                System.out.println(num + " ");
                res += num;
            }
            else{
                System.out.println(num);
            }
        }
        System.out.println("Sum of elements of list is - " + res);
    }
}
