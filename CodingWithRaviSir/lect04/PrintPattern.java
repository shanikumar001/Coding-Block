package CodingWithRaviSir.lect04;

public class PrintPattern {
    public static void printPattern1(int n) {
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < n; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }
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

    public static void printPattern2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printPattern3(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printPattern4(int n) {
        // for (int i = 0; i < n; i++) {
        //     for (int j = n; j > i; j--) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        int i = 0;
        while(i< n){
            int j = n;
            while(j >i){
                System.out.print("*");
                j--;
            }
            System.out.println();
            i++;
        }
    }

    public static void printPattern5(int n) {
        // for (int i = 0; i < n; i++) {
        //     for (int j = n; j > i; j--) {
        //         System.out.print("_");
        //     }
        //     for(int k = 4; k>i; k--){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        int i = 0;
        while(i< n){
            int j = 0;
            while(j < i){
                System.out.print("_");
                j++;
            }
            int k = n;
            while(k>i){{
                System.out.print("*");
                k--;
            }}
            System.out.println();
            i++;
        }
    }

    public static void printPattern6(int n) {
        for (int i = 0; i < n; i++) {
            for(int k = 1; k<i; k++){
                System.out.print("_");
            }
            for (int j = i; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printPattern7(int n){
        int i = 0;
        while(i< n){
            int j = 0;
            while(j < i){
                System.out.print("__");
                j++;
            }
            int k = n;
            while(k>i){{
                System.out.print("*");
                k--;
            }}
            System.out.println();
            i++;
        }
    }

     protected static void printPattern8(){
        int n = 5;
        for(int i = 0; i<=n; i++){
            for(int j=0; j<=n; j++){
                if(i == 0 || j == 0 || i == n || j == n ){
                   System.out.print('8');
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    
    
}
