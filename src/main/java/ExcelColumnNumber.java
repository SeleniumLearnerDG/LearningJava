public class ExcelColumnNumber {

    public static void main(String[] args) {
        System.out.println(new ExcelColumnNumber().convertToTitle(943566));
    }

    public int titleToNumber(String A) {
        int arr[] = new int[A.length()];
        if (A.equals("A")) return 1;
        for (int i = 0; i < A.length(); i++) {
            arr[i] = (int) (A.charAt(i)) - 64;
        }
        int finalValue = 0;
        for (int i = 0; i < arr.length; i++) {
            finalValue += (arr[i]) * Math.pow(26, arr.length - i - 1);
        }
        return finalValue;
    }

    public String convertToTitle(int A) {
        String finalString = "";

        while (A > 0) {
            if ((A % 26) != 0) {
                finalString = (char) (A % 26 + 64) + finalString;
                A = A / 26;
            }
            else
            {
                finalString = "Z" + finalString;
                A = (A / 26) -1;
            }

        }

        return finalString;
    }
}
