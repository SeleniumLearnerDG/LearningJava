import java.util.Arrays;

public class MoveZeroes {
    public static void moveZeroes(int[] nums) {
        for(int lastNonZeroFound=0,  curr=0; curr<nums.length;curr++)
        {
            if(nums[curr]!=0) {
                int temp = nums[lastNonZeroFound];
                nums[lastNonZeroFound++]= nums[curr];
                nums[curr]=temp;
            }
        }
    }


    public static void main(String[] args) {
        int arr[]={0,0,1,1,0};
        moveZeroes(arr);
        System.out.println(arr);
    }
}
