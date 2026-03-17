package CodingWithRaviSir.lect02;

public class HomeWork {

    // Sum of n natural numbers
    public static void sumOfNatural(int n) {
        int sum = n * (n + 1) / 2;
        System.out.println("Sum of natural numbers = " + sum);
    }

    // Print even numbers from 1 to 1000
    public static void printEven() {
        for (int i = 2; i <= 1000; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // Sum of even numbers from 1 to 1000
    public static void sumEven() {
        int sum = 0;
        for (int i = 2; i <= 1000; i += 2) {
            sum += i;
        }
        System.out.println("Sum of even numbers = " + sum);
    }

    // Multiplication table of 7
    public static void tableOfSeven() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("7 x " + i + " = " + (7 * i));
        }
    }

    // Reverse a number
    public static void reverseNumber(int n) {
        int rev = 0;
        while (n > 0) {
            rev = rev * 10 + (n % 10);
            n /= 10;
        }
        System.out.println("Reversed number = " + rev);
    }
}
