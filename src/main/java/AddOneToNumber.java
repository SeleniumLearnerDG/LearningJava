public class AddOneToNumber {

    public int[] plusOne(int[] A) {

        int countNine=0, stop=A.length-1;
        for(int i=A.length-1;i>=0;i++)
        {
            if(A[i]==9)
                countNine++;
            else
            {
                stop=i;
                break;

            }
        }

        while(stop>=0)
        {
            
        }


        return A;
    }
    public static void main(String[] args) {
        System.out.println(System.getProperty("user.dir"));
    }
}
