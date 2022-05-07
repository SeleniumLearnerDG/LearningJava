package com.changeingconst;

public class PalindromeInteger {

    public static void main(String[] args) {
        System.out.println(new PalindromeInteger().isPalindrome(2147447412));
    }


        static boolean isPalindrome(int n)
        {
            // Find the appropriate divisor
            // to extract the leading digit
            int divisor = 1;
            while (n / divisor >= 10)
                divisor *= 10;

            while (n != 0)
            {
                int leading = n / divisor;
                int trailing = n % 10;

                // If first and last digit
                // not same return false
                if (leading != trailing)
                    return false;

                // Removing the leading and trailing
                // digit from number
                n = (n % divisor) / 10;

                // Reducing divisor by a factor
                // of 2 as 2 digits are dropped
                divisor = divisor / 100;
            }
            return true;
        }

        // Driver code



}
