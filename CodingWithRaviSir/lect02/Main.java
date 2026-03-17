package CodingWithRaviSir.lect02;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // ClassWork
        System.out.println("Enter x and y:");
        int x = s.nextInt();
        int y = s.nextInt();
        ClassWork.addTwoNo(x, y);

        System.out.println("Enter p r t:");
        int p = s.nextInt();
        int r = s.nextInt();
        int t = s.nextInt();
        ClassWork.simpleInterest(p, r, t);

        System.out.println("Enter number for even/odd:");
        int n = s.nextInt();
        ClassWork.evenOrOdd(n);

        System.out.println("Enter x y z:");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        ClassWork.findMaxNum(a, b, c);

        // HomeWork
        System.out.println("Enter n for sum of natural numbers:");
        int num = s.nextInt();
        HomeWork.sumOfNatural(num);

        HomeWork.printEven();
        HomeWork.sumEven();
        HomeWork.tableOfSeven();

        System.out.println("Enter number to reverse:");
        int rev = s.nextInt();
        HomeWork.reverseNumber(rev);
        s.close();
    }
}
