public class MedianOfTwoSortedArray {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int arr[]=new int[nums1.length+nums2.length];
        int mid=0, mid2=0;
        int i=0, j=0,k=0;
        while(i<nums1.length ||j<nums2.length)
        {
            if(i==nums1.length)
            {
                arr[k]=nums2[j];
                j++;
            }
            else if(j==nums2.length)
            {
                arr[k]=nums1[i];
                i++;
            }
            else if(nums1[i]<nums2[j])
            {
                arr[k]=nums1[i];
                i++;
            }
            else {
                arr[k]=nums2[j];
                j++;
            }
            if(k==(int)(arr.length/2)) mid=arr[k];
            else if(k==(arr.length%2==0?(arr.length/2-1):-1))
                mid2=arr[k];
            k++;

        }
        if(mid2==0)
            return mid;
        double val=(double) (mid+mid2)/2;
        return val;
    }

    public static void main(String[] args) {
        int num1[]={1,1};
        int num2[]={1,2};

        System.out.println(findMedianSortedArrays(num1,num2));
    }
}
