import java.util.Arrays;

public class Multipication {
    public static void main(String[] args) {
        int[] arr={10, 3, 5, 6, 2};
        int[] prod= multiplicationInArray(arr);
        Arrays.stream(prod).forEach(System.out::println);
    }

    private static int[] multiplicationInArray(int[] arr) {
        int[] prod= new int[arr.length];

         Arrays.fill(prod,1);
        /*for(int i=0; i<prod.length;i++)
        {
            for(int j=0;j<prod.length;j++)
            {
                if(i!=j)
                prod[i]*=arr[j];
            }
        }*/

        int left = 1, right = 1;
        for(int i = 0; i < arr.length; i++) {
            int j = arr.length-i-1;
            prod[i] = left * prod[i];
            prod[j] = right * prod[j];
            left *= arr[i];
            right *= arr[j];
        }

        return prod;
    }
}
