package com.changeingconst;

public class UniqueElement {
    public static void main(String[] args) {
        int arr[]={1,1,2};
        System.out.println(new UniqueElement().getUniqueElement(arr));
    }

    public int getUniqueElement(int[] nums)
    {
        int result = 0;
        for(int i : nums)
            result ^= i;

        return result;
    }
}
