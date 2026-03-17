package CodingWithRaviSir.lect05;
// import DsaWithRaviSir.*;
// import DsaWithRaviSir.lect04.PrintPattern;

public class Main {

    public static void printPattern1(int n){
        int i = 0;
        while (i < n) {

            int j = n - i - 1;
            while (j > 0) {
                System.out.print(" ");
                j--;
            }

            int k = 0;
            while (k <= 2 * i) {
                System.out.print("*");
                k++;
            }

            System.out.println();
            i++;
        }
    }

    public static void printPattern2(int n){
        int i = n - 2;
        while (i >= 0) {

            int j = n - i - 1;
            while (j > 0) {
                System.out.print(" ");
                j--;
            }

            int k = 0;
            while (k <= 2 * i) {
                if(k % 2 == 1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
                k++;
            }

            System.out.println();
            i--;
        }
    }


    public static void printPattern3(int n) {

        int i = 1;
        while (i <= n) {

            int j = 1;
            while (j <= i) {
                System.out.print("*");
                j++;
            }
            int spaces = 2 * (n - i);
            int k = 1;
            while (k <= spaces) {
                System.out.print(" ");
                k++;
            }
            int m = 1;
            while (m <= i) {
                System.out.print("*");
                m++;
            }

            System.out.println();
            i++;
        }
    }

    public static void printPattern5(int n) {
        int i = n;
        while (i >= 1) {

            // left stars
            int j = 1;
            while (j <= i) {
                System.out.print("*");
                j++;
            }

            // middle underscores
            int spaces = 2 * (n - i);
            int k = 1;
            while (k <= spaces) {
                System.out.print(" ");
                k++;
            }

            // right stars
            int m = 1;
            while (m <= i) {
                System.out.print("*");
                m++;
            }

            System.out.println();
            i--;
        }
    }

    public static void printPattern4(int n){
        // DsaWithRaviSir.lect04.PrintPattern p = new PrintPattern();
        // p.printPattern2(n);
        // p.printPattern3(n);
    }

    public static void main(String[] args) {
        int n = 9;
        // DsaWithRaviSir.lect04.PrintPattern p = new PrintPattern();
        // p.printPattern2(n);
        printPattern5(n);

    }
}
