import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SquaresOfASortedArray {
    public static int[] sortedSquares(int[] nums) {
        int i = 0, j = nums.length-1 , k = j;
        int[] arr = new int[j+1];
        while(i <= j){
            if(Math.abs(nums[i]) > Math.abs(nums[j])){
                arr[k--] = nums[i] * nums[i];
                i++;
            }else{
                arr[k--] = nums[j] * nums[j];
                j--;
            }
        }
        return arr;

    }

    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> map= new HashMap<Integer, Integer>();
        for(int i=0;i<numbers.length;i++)
        {
            int requiredNumber=target-numbers[i];
            if(map.containsKey(requiredNumber))
                return new int[]{map.get(requiredNumber), i+1};
            else
                map.put(numbers[i],i+1);
        }

        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int a=1_12_12_123;
        System.out.println(a);
        int arr[]={-7,-3,2,3,11};
        Arrays.stream(sortedSquares(arr)).forEach(System.out::println);
    }
}
