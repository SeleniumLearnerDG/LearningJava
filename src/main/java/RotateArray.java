import java.util.Arrays;

public class RotateArray {
    public  void rotate(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums, 0, nums.length - 1 - k);
        reverse(nums, nums.length - k, nums.length - 1);
        reverse(nums, 0, nums.length - 1);

        Arrays.stream(nums).forEach(System.out::println);
    }

    public void reverse(int[] nums, int start, int end){
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

   /* public void rotate(int[] nums, int k) {
        int arr[]= Arrays.copyOf(nums,nums.length);
        k=k%nums.length;
        for (int i=0;i<nums.length;i++)
        {
            nums[i]=arr[(arr.length-k+i)%arr.length];
        }
    }*/
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        new RotateArray().rotate(arr,3);
    }
}
