package CodingWithRaviSir.lect03;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // First Question :
        // System.out.println("Enter value of prize :");
        // int n = s.nextInt();
        // ClassWork.personWins(n);

        // Second Question :
        // System.out.println("Enter value of all x : ");
        // int x1 = s.nextInt();
        // int x2 = s.nextInt();
        // int x3 = s.nextInt();
        // System.out.println("Enter value of all y : ");
        // int y1 = s.nextInt();
        // int y2 = s.nextInt();
        // int y3 = s.nextInt();
        // ClassWork.cordinate(x1, x2, x3, y1, y2, y3);

        //Third Question :
        System.out.println("Enter value of starting and ending point  : ");
        int st = s.nextInt();
        int ls = s.nextInt();
        System.out.println("Enter value of differencs : ");
        int dif = s.nextInt();
        ClassWork.printDif(st, ls, dif);



        s.close();
        // *     *
        //  *  *
        //   * 
        // *    * 
        //*       *

        // int st = 5;
        // for(int i = 0; i <= st; i++){
        //     for(int j = 0; j <= 5; j++){
        //         if(j == 0 || j == (st-1)){
        //             System.out.print("*");

        //         };
        //     }
        //     System.out.println();
        // }
    }
}
