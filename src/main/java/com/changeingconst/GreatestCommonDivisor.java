package com.changeingconst;

import java.util.ArrayList;
import java.util.List;

public class GreatestCommonDivisor {
    public int gcd(int A, int B) {
        List<Integer> arr= new ArrayList<>();
        List<Integer> arrB= new ArrayList<>();
        if(A==0) return B;
        else if(B==0) return A;
        arr=findMultiple(A);
        arrB=findMultiple(B);
        int gcd=1;
        for(int i=0;i<arr.size();i++)
        {
            if(arrB.contains(arr.get(i)))
            {
                arrB.remove(arr.get(i));
                gcd=gcd*arr.get(i);
            }
        }

        return gcd;
    }

    private List<Integer> findMultiple(int a) {
        List<Integer> arr= new ArrayList<>();
        int div=2;
        while(a>1)
        {
            if(a%div==0)
            {
                arr.add(div);
                a=a/div;
            }
            else div++;
        }
        return arr;
    }



    public static void main(String[] args) {
        System.out.println(new GreatestCommonDivisor().gcd(2,0));
    }

}
