package CodingWithRaviSir.lect02;

public class ClassWork {

    // Add two numbers
    public static void addTwoNo(int x, int y) {
        System.out.println("Sum = " + (x + y));
    }

    // Simple Interest
    public static void simpleInterest(int p, int r, int t) {
        int si = (p * r * t) / 100;
        System.out.println("Simple Interest = " + si);
    }

    // Even or Odd
    public static void evenOrOdd(int n) {
        if (n % 2 == 0)
            System.out.println("Number is Even");
        else
            System.out.println("Number is Odd");
    }

    // Find maximum of three numbers
    public static void findMaxNum(int x, int y, int z) {
        if (x >= y && x >= z)
            System.out.println(x + " is the largest number");
        else if (y >= x && y >= z)
            System.out.println(y + " is the largest number");
        else
            System.out.println(z + " is the largest number");
    }
}
