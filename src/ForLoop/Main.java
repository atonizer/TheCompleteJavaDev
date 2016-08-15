package ForLoop;

// https://docs.oracle.com/javase/tutorial/java/index.html - The Java™ Tutorials


public class Main {
    public static void main(String[] args) {
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 2.0));
        System.out.println("10,000 at 3% interest = " + calculateInterest(10000.0, 3.0));
        System.out.println("10,000 at 4% interest = " + calculateInterest(10000.0, 4.0));
        System.out.println("10,000 at 5% interest = " + calculateInterest(10000.0, 5.0));

        for (int i = 1; i < 6; i++) {
            System.out.println("Loop " + i + " hello!");
        }

        //
        //

        double amount = 10000.0d;
        // double interestRate = 0.0d;
        for (double interestRate = 1.0d; interestRate < 6; interestRate++) {
            System.out.println(String.format("%.2f", amount) + " at " + interestRate + " interest = " +
                    String.format("%.2f", calculateInterest(amount, interestRate)));
        }

        System.out.println("\n");

        //
        //
        amount = 10000.0d;
        // double interestRate = 0.0d;
        for (double interestRate = 8.0d; interestRate > 1; interestRate--) {
            System.out.println(String.format("%.2f", amount) + " at " + interestRate + " interest = " +
                    String.format("%.2f", calculateInterest(amount, interestRate)));
        }

        int count = 0;

        for (int i = 10; i < 50; i++) {
            if (isPrime(i)) {
                count++;
                System.out.println("Number " + i + " is prime number");
                if (count == 10) {
                    System.out.println("Exiting for loop");
                    break;
                }
            }
        }
    }

    //
    //


    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }

        for (int i = 2; i <= (long) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}
