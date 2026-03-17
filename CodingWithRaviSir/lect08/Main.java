package CodingWithRaviSir.lect08;

public class Main {

    public static void add(int a, int b){
        int c = a + b;
        System.out.println("sum of two number is : " + c);
    }

    public static int returnAdd(int a, int b){
        int c = a + b;
        return c;
    }

     public static void simpleInterest(int var0, int var1, int var2) {
      int var3 = var0 * var1 * var2 / 100;
      System.out.println("Simple Interest = " + var3);
   }

   public static void evenOrOdd(int var0) {
      if (var0 % 2 == 0) {
         System.out.println("Number is Even");
      } else {
         System.out.println("Number is Odd");
      }

   }

   public static void findMaxNum(int var0, int var1, int var2) {
      if (var0 >= var1 && var0 >= var2) {
         System.out.println("" + var0 + " is the largest number");
      } else if (var1 >= var0 && var1 >= var2) {
         System.out.println("" + var1 + " is the largest number");
      } else {
         System.out.println("" + var2 + " is the largest number");
      }

   }

   public static void personWins(int n){
        
        if(n>=300 && n<=460){
            System.out.println("The prize is macbook !!");
            if(n >= 300 && n <= 380){
                System.out.println("The prize is macbook M1 !!");
            }else{
                System.out.println("The prize is macbook M2 !!");
            }
        }else if(n>=200 && n <=240){
            System.out.println("The prize is kurkure !!");
            if(n >= 300 && n <= 380){
                System.out.println("The prize is chilli kurkure !!");
            }else{
                System.out.println("The prize is onion kurkure !!");
            }
        }else if(n>=1100 && n<=1500){
            System.out.println("The prize is cycle !!");
            if(n >= 1100 && n <= 1300){
                System.out.println("The prize is avon cycle !!");
            }else{
                System.out.println("The prize is hero cycle !!");
            }
        }else if(n>50 && n<=80){
            System.out.println("The prize is bike !!");
            if(n >= 60 && n <= 65){
                System.out.println("The prize is bullet !!");
            }else{
                System.out.println("The prize is rajdoot !!");
            }
        }else{
            System.out.println("Better luck next time!!");
        }
    }

    public static void cordinate(int x1, int x2, int x3, int y1, int y2, int y3){
        int m1 = (y2-y1)/(x2-x1);
        int m2 = (y3-y2)/(x3-x2);
        if(m1 == m2){
            System.out.println("its a straight line!");
        }else{
            System.out.println("it's not a straight line!");
        }
    }

    public static void printDif(int st, int ls, int dif){
        for(int i = st; i <= ls; i = i+dif){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        add(a, b);
        int c = returnAdd(a, b);
        System.out.println("sum of two number is : " + c);
        
    }
}
