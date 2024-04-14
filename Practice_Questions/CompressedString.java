package Practice_Questions;

public class CompressedString {

    public static void main(String args[]) {
        String s = "aaabbbccaad";

        String compressString = "";
        int count = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                if (count > 1)

                    compressString = compressString + count;
                count = 1;

            }
            compressString += s.charAt(i);
        }

        if (count > 1) {
            compressString = compressString + count;
            count = 1;
        }

        System.out.println(compressString);

    }

}
