package CodingWithRaviSir.lect03;

public class ClassWork {
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
}
