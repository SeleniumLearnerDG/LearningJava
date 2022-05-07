public class Demo {
    static  int badVersion=1;
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target)
                return mid;
            else if (nums[start] <= nums[mid]) {
                if (target <= nums[mid] && target >= nums[start]) end = mid - 1;
                else
                    start = mid + 1;
            } else if (nums[end] >= nums[mid]) {
                if (target >= nums[mid] && target <= nums[end]) start = start + 1;
                else end = mid - 1;
            }
        }

        return -1;
    }


        public int firstBadVersion(int n) {
            int start = 1;
            int end = n;
            while(start<end){
                int mid = start+(end-start)/2;
                if(!isBadVersion(mid)){
                    start = mid + 1 ;
                }else {
                    end = mid;
                }
            }
            return start;
        }

    public int searchInsert(int[] nums, int target) {
        int start=0;
        int end = nums.length-1;
        while(start<=end)
        {
            int mid= (start+end)/2;
            if(nums[mid]==target)
                return mid;
            else if(nums[mid]<target)
                start= mid+1;
            else
                end=mid-1;
        }
        if(start==nums.length )
            return nums.length ;
       else if(nums[start]>=target)
            return start;
        else if(nums[end]<=target)
            return end;
        else  return (start+end)/2;
    }
    public int[] buildArray(int[] nums) {
        int arr[]= new int[nums.length];
        for(int i=0,j=nums.length-1;i<=nums.length/2||j>nums.length/2;i++,j--) {
            arr[i] = nums[nums[i]];
            arr[j] = nums[nums[j]];
        }

        return arr;
    }
    private boolean isBadVersion(int mid) {
        if(mid==badVersion)
            return true;
        return false;
    }



    public static void main(String[] args) {

        int arr[]={4,5,6,7,0,1,2};
        System.out.println(new Demo().search(arr, 0));
//        badVersion=2;
//        System.out.println(new Demo().firstBadVersion(5));
    }
}
