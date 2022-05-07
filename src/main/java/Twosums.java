import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class Twosums {

     public static int[] twoSum(int[] numbers, int target) {
         HashMap<Integer, Integer> map = new HashMap<>();
         for (int i = 0; i < numbers.length; i++)
         {
             if (map.containsKey(target - numbers[i])) {
                 int toReturn[] = {map.get(target - numbers[i]), i + 1};
                 return toReturn;
             } else map.put(numbers[i], i + 1);
     }
     return null;
     }

    public static void main(String[] args) {
        int[] numbers={2,7,11,15};
        int target=9;
        Arrays.stream(twoSum(numbers,target)).forEach(System.out::println);
        StringBuilder input1 = new StringBuilder("adss");

        Arrays.sort(numbers);

        System.out.println(input1);
    }
}




