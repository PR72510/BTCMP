public class Sol6 {

    public static void main(String[] args) {

        int arr[] = {2, 7, 6, 7, 4, 2, 4, 6, 1};

        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            if (arr[i] == 9) {
                continue;
            }
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == (arr[j])) {
                    count++;
                    arr[j] = 1010101;
                }
            }
            if(count==1){
                System.out.println(arr[i]+ " Occured once only ");
            }

        }
    }
}
