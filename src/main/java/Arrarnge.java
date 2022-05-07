import java.util.ArrayList;
import java.util.Arrays;

public class Arrarnge {

    public static void main(String[] args) {
        ArrayList<Integer> a= new ArrayList<>(Arrays.asList(1,0));
        new Arrarnge().arrange(a);
    }

    public void arrange(ArrayList<Integer> a) {
        int[] vist = new int[a.size()];
        int arr[] = new int[a.size()];
        for (int i = 0; i < a.size(); i++) {
            if (vist[a.get(i)] == 0) {
                vist[i] = 1;
                arr[i] = a.get(i);
                a.add(i, a.get(a.get(i)));

            } else {
                vist[i] = 1;
                arr[i] = a.get(i);
                a.add(i, arr[a.get(i)]);
            }
            a.remove(i + 1);
        }

        System.out.println(a.toArray().toString());
    }
}
