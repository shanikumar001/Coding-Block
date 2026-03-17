package CodingWithRaviSir.lect08;

public class PrintPatterns {
    // Pattern 01 : 
    public static void pattern01(){
        int rows = 5;
        // int star = 1;
        for(int i = 1; i <= rows; i++){
            for(int j = 1; j <= rows; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Pattern 02 : 
    public static void pattern02(){
        int row = 5;
        // int star = 1;
        for(int i = 1; i <= row; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Pattern 03 : 
    public static void pattern03(){
        int row = 5;
        int star = 5;
        for(int i = 1; i <= row; i++){
            for(int j = star; j >= 1; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        pattern03();
    }
}
