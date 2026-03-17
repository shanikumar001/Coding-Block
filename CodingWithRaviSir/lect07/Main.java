package CodingWithRaviSir.lect07;

public class Main {

    public static void primeNo(int n) {
        System.out.println("Prime numbers up to " + n + " are:");

        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;

            for (int j = 2; j * j <= i; j++) {  
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void fibonacci(int n) {
        int a = 0, b = 1;
        System.out.println("Fibonacci series up to " + n + " terms:");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
        System.out.println();
    }

    public static void hcf(int a, int b) {
        while (b != 0) {
            int rm = a % b;
            a = b;
            b = rm;
        }
        System.out.println("HCF is: " + a);
    }

    public static void reverse(int n) {
        int reversed = 0;
        while (n != 0) {
            reversed = reversed * 10 + (n % 10);
            n /= 10;
        }
        System.out.println("Reversed number: " + reversed);
    }


    public static void sumOfDigit(int n) {
        int sum = 0;
        while(n != 0){
            int digit = n % 10;
            sum = sum + digit;
            n = n/10;
        }
        System.out.println("Sum is : " + sum);
    }

    public static void main(String[] args) {

        primeNo(20);        
        fibonacci(10);     
        hcf(36, 60);        
        reverse(632);
        sumOfDigit(4523);    
        
    }
}
