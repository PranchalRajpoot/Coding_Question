package Practice_Questions;

public class ReplaceSpecailChar {

    public static void main(String args[]) {
        String s = "^*(__*&%$##@@@E**+aaabbbccc000)"; // regular expression ^ is a char operator
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(s);

    }

}
