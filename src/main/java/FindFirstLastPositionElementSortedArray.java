import java.util.Arrays;

public class FindFirstLastPositionElementSortedArray {
    public static void main(String[] args) {
        int arr[] = {5, 7, 7, 8, 8, 10};
        int arr1[] = new FindFirstLastPositionElementSortedArray().searchRange(arr, 8);
        Arrays.stream(arr1).forEach(System.out::println);
    }

    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        ans[0] = BinarySearch(nums, target, true);
        ans[1] = BinarySearch(nums, target, false);
        return ans;
    }

    public int BinarySearch(int[] nums, int target, boolean search4FirstOccurance) {
        int start = 0;
        int end = nums.length - 1;
        int ans = -1; // Desired index will be stored in it

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                ans = mid; // Storing the potential ans
                if (search4FirstOccurance)
                    end = mid - 1;
                else
                    start = mid + 1;

            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }
}
