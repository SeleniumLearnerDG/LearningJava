package com.changeingconst;

import java.util.Arrays;

public class FillArray {

    public static String[] fizzBuzz(int A) {
        String output[]= new String [A];
        Arrays.fill(output, "");
        if(A>=1)
            output[0]=output[0]+1;
        if(A>=2)
            output[1]=output[1]+2;
        if(A>=3){
            for(int i=3; i<=A;i++)
            {
                if(i%3==0)

                    output[i-1]=output[i-1]+"Fizz" ;

                if(i%5==0)
                    output[i-1]=output[i-1]+"Buzz" ;
                else
                    output[i-1]=output[i-1]+i ;
            }
        }

        return output;
    }

    public static void main(String[] args) {
        Arrays.stream(fizzBuzz(2)).forEach(System.out::print);
    }
}
