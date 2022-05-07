public class NextSimilarNumber {
    public  static String solve(String A) {

        char arr[]=A.toCharArray();
            for(int j=arr.length-1; j>0;j--)
            {
                for(int k=j-1; k>0;k--)
                if(arr[j]>arr[k])
                {
                    char temp =arr[j];
                    arr[j]=arr[k];
                    arr[k]=temp;

                    while( k!=j-1 && j<=A.length()-1 && arr[j-1]>arr[j] )
                    {
                        char temp1 =arr[j];
                        arr[j]=arr[j-1];
                        arr[j-1]=temp1;
                        j++;
                    }
                    return new String(arr);
                }
        }
            return "-1";
    }

    public static void main(String[] args) {
        System.out.println(solve("657"));
    }
}
