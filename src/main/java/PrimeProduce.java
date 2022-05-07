import java.util.Arrays;

public class PrimeProduce {

    public int[] solve(int n)
    {
        if(n>1) {
            for (int i = 2; i < n/2; i++) {
                if (isprime(i) && isprime(n-i))
                {
                    int arr[]={i,n-i};
                    return arr;
                }
            }
        }

        return null;
    }

    private boolean isprime(int n) {
       if (n==2|| n==3) return true;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new PrimeProduce().solve(74)));

    }
}
