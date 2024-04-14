package Practice_Questions;

public class PrimeNumber {

    public static void main(String args[]) {
        int n = 9;
        if (n == 0 || n == 1) {
            System.out.println("not prime prime");
        }
        int count = 0;

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                count++;
                break; // optimization method
            }
        }

        if (count == 0) {
            System.out.println(" prime");
        } else {
            System.out.println("not prime");
        }
    }

}
