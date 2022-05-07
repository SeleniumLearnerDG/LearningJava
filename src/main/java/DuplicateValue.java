import java.util.HashSet;
import java.util.TreeSet;

import static java.lang.Math.abs;

public class DuplicateValue {


    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> hash = new HashSet<Integer>();

        for (int i = 0; i < nums.length; i++) {
            if (hash.contains(nums[i])) {
                return true;
            } else {
                hash.add(nums[i]);
            }
        }
        return false;
    }


    public static boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        if (nums == null || nums.length <= 1) {
            return false;
        }
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int i = 0; i < nums.length; i++) {
            Integer low = treeSet.floor(nums[i]);   // get the greatest element smaller than this number
            Integer high = treeSet.ceiling(nums[i]);  // get the smallest element greater than this number

            if ((low != null && (long) nums[i] - low <= t) || (high != null && (long) high - nums[i] <= t)) {   // check for absolute differences
                return true;
            }
            treeSet.add(nums[i]);

            if (i >= k) {   // remove the first element when size of the tree set exceeds K
                treeSet.remove(nums[i - k]);
            }
        }
        return false;

    }

    public static void main(String[] args) {
        int nums[]={1,5,9,1,5,9};
        System.out.println(containsNearbyAlmostDuplicate(nums,2,3 ));
    }
}
