public class LargestCoprimeDivisor {

//    public static void main(String[] args) {
//        System.out.println(cpFact(48,16));
//    }
    public  int cpFact(int A, int B)
    {
        while(gcd(A, B)!=1)
        {
            A=A/gcd(A, B);
        }
        return A;
    }
    public  int gcd(int X,int B)
    {
        if(X == 0)
            return B;
        return gcd(B%X,X);
    }


    public static void main(String[] args) {

        System.out.println(new LargestCoprimeDivisor().cpFact(2,2));
    }
}
