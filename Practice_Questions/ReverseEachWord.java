package Practice_Questions;

public class ReverseEachWord {

    public static void main(String args[]) {

        String s = " Welcome to java world";

        String[] word = s.split(" ");
        String reversString = "";

        for (String w : word) {
            String reverseword = "";
            for (int i = w.length() - 1; i >= 0; i--) {
                reverseword = reverseword + w.charAt(i);
            }
            reversString = reversString + reverseword + " ";

        }
        System.out.println(reversString);

    }

}
