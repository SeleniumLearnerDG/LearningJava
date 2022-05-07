import java.util.Stack;

public class RepeatlyString {
    public static String repeatChar(String s) {
        String digit = "";
        String finalString = "";
        Stack<String> stack = new Stack<String>();
        for (int i = 0; i < s.length(); i++) {
            if (String.valueOf(s.charAt(i)).matches("^[0-9]$")) {
                digit += s.charAt(i);
            } else {
                if (digit.length() > 0)
                    stack.push(digit);
                if (!"]".equalsIgnoreCase(String.valueOf(s.charAt(i)))) {
                    stack.push(String.valueOf(s.charAt(i)));
                } else if ("]".equalsIgnoreCase(String.valueOf(s.charAt(i)))) {
                    String subString = "";
                    String s1 = "";
                    while (!stack.peek().equalsIgnoreCase("[")) {
                        s1 = stack.pop() + s1;
                    }
                    stack.pop();
                    Integer num = Integer.valueOf(stack.pop());
                    while ((num--) > 0) {
                        subString += s1;
                    }
                    if (!stack.isEmpty())
                        stack.push(subString);
                    else finalString += subString;
                }
                digit = "";
            }
        }
        String s1 = "";
        while (!stack.isEmpty()) {
            s1 = stack.pop() + s1;
        }
        return finalString + s1;
    }


    public static void main(String[] args) {
        String s = "2[abc]3[cd]ef";
        System.out.println(repeatChar(s));
    }
}
