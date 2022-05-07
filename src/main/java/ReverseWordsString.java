public class ReverseWordsString {
    public static void main(String[] args) {
        System.out.println(new ReverseWordsString().reverseWords("hehhhhhhe"));
    }

    public String reverseWords(String input) {
        final StringBuilder word = new StringBuilder();
        final StringBuilder result = new StringBuilder();
        while (input.contains(" ")) {
            word.append(input, 0, input.indexOf(' '));
            result.append(word.reverse()+" ");
            word.setLength(0);
            input=input.substring( input.indexOf(' ')+1);
        }
        word.append(input);
        result.append(word.reverse());
        return result.toString();
    }
}
