public class BinarySearch {
    public static  int search(int[] nums, int target) {
        int start=0;
        int end= nums.length;
        while(start!=end)
        {
            int mid=(start+end)/2;
            if(nums[mid]==target) return  mid;
            else if  (nums[mid]>target) end=mid-1;
            else start=mid+1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={-3,0, 1,4,5,11,29};
        System.out.println(search(arr,11));
    }
}
