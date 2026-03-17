package CodingWithRaviSir.lect05;

public class HomeWork {
    public static void printPattern01(int n){
        int i = 0;
        while (i < n) {
            int j = 0;
            while (j < n) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }

    public static void printPattern02(int n){
        int i = 0;
        while (i < n) {
            int j = 0;
            while (j <= i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }

    public static void printPattern03(int n){
        int i = 0;
        while (i < n) {
            int j = n;
            while (j > i) {
                System.out.print("*");
                j--;
            }
            System.out.println();
            i++;
        }
    }

    public static void printPattern04(int n){
        int i = 1;
        while (i <= n) {
            int j = 1;
            while(j <= n-i){
                System.out.print(" ");
                j++;
            }
            int k = 1;
            while(k <= i){
                System.out.print("*");
                k++;
            }
            System.out.println();
            i++;
        }
    }

    public static void printPattern05(int n){
        int i = 0;
        while (i < n) {
            int j = 0;
            while(j < i){
                System.out.print(" ");
                j++;
            }
            int k = 0;
            while(k < n-i){
                System.out.print("*");
                k++;
            }
            System.out.println();
            i++;
        }
    }


    public static void main(String[] args) {
        printPattern05(5);
    }
}
