package CodingWithRaviSir.lect06;

public class Main {

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
        n = n-1;
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

    public static void printPattern04(){
        int n = 5;
        int i = 0;
        
        while (i < n) {
            int j = n;
            while (j > i) {
                System.out.print(" ");
                j--;
            }
            int m = 0;
            while(m <= i*4){
                System.out.print("*");
                m = m+2;
            }
            int k = 1;
            while(k <= n-i){
                System.out.print(" ");
                k++;
            }
            System.out.println();
            i++;
        }
    }

    public static void dimand() {
        int n = 5;
        int i = 1;
        int count = 1;
        // Upper half
        while (i <= n) {
            int space = n - i;
            while (space > 0) {
                System.out.print(" ");
                space--;
            }

            int star = 1;
            while (star <= (2 * i - 1)) {
                System.out.print(count);
                star++;
                count++;
            }

            System.out.println();
            i++;
        }

        // Lower half
        // i = n - 1;
        // while (i >= 1) {
        //     int space = n - i;
        //     while (space > 0) {
        //         System.out.print(" ");
        //         space--;
        //     }

        //     int star = 1;
        //     while (star <= (2 * i - 1)) {
        //         System.out.print("*");
        //         star++;
        //     }

        //     System.out.println();
        //     i--;
        // }

        // ** *
        //***** 
        //* **

    
    }



    public static void printPattern04(int n){
        printPattern02(n);
        printPattern03(n);
    }
    public static void main(String[] args) {
        // printPattern04(5);
        
        // int n =5;
        // int row=1;

        // int star =n-1;
        // int space =1;

        // while(row<=2*n-1){
        //     //star

        //     int i=1;
        //     while(i<=star){
        //         System.out.print("*");
        //         i++;
        //     }

        //     //space

        //     int j=1;
        //     while(j<=space){
        //         System.out.print(" ");
        //         j++;
        //     }

        //     i=1;
        //     while(i<=star){
        //         System.out.print("*");
        //         i++;
        //     }
        //     System.out.println();

        //     if(row<n){star--;
        //     space+=2;}
        //     else{
        //         star++;
        //         space-=2;
        //     }

        //     row++;


        // }

        dimand();

    }
}
