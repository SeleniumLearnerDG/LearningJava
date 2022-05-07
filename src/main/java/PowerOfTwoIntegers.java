public class PowerOfTwoIntegers {
    public static int isPower(int n) {
        if(n==1) return 1;
        for(int A=2;A<= Math.sqrt(n); A++)
        {
            int y=2;
            double p=Math.pow(A,y);
            while (p<n)
            {
                p=Math.pow(A,++y);
            }
            if(p==n)
                return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(isPower(10240000));
    }
}
