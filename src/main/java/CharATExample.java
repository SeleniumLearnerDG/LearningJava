public class CharATExample {
    public static void main(String[] args) {
        String s="abc";
        boolean flag= (String.valueOf(s.charAt(0)) instanceof  String);
        boolean flag2= (Character.toString(s.charAt(0)) instanceof  String);
            System.out.println(flag);
        System.out.println(flag2);


    }

}
