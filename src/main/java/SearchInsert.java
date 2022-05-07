public class SearchInsert {
    public static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int mid = (start + end) / 2;
        if (nums[0] > target)
            return 0;
        if (nums[end] < target)
            return nums.length;
        while (start <= end) {

            if (nums[mid] == target) return mid;
            else if (nums[mid] < target) start = mid + 1;
            else end = mid - 1;
            mid = (start + end) / 2;
        }

        if (start < nums.length && nums[start] > target)
            return start;
        else if (end < nums.length && nums[end] < target)
            return end + 1;
        else return mid;
    }

    public static void main(String[] args) {
        int arr[]={-3,0, 1,4,5,11,29};
        System.out.println(searchInsert(arr,30));
    }
}
