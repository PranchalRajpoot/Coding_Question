package Practice_Questions;

public class ReverseNUmber {

    public static void main(String args[]) {
        int n = 12345;
        int r = 0;
        int d;
        while (n > 0) {
            r = r * 10 + n % 10;
            n = n / 10;

        }
        System.out.println(r);

    }

}
