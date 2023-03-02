import java.util.Scanner;

public class JUnit {
    static Scanner sc = new Scanner(System.in); // Scanner Class
    static double C_F(double C){
        double F = (C * 9/5) + 32;
        return F;
    }
    static double F_C(double F){
        double C = (F - 32) * 5/9;
        return C;
    }
    static double input(String word){
        System.out.println("Enter "+word+" value:");
        double val = sc.nextDouble();
        return val;
    }
    static void output(double val, String word){
        System.out.printf("%s value: %.2f",word,val);
    }
    public static void main(String args[]){
        System.out.println("1. Celcius to Fahrenheit\n2.Fahrenheit to Celcius");
        do{
            System.out.println("\nEnter Choice: ");
            int ch = sc.nextInt();
            double num = 0;
            switch(ch){
                case 1: num = input("Celcius");
                    output(C_F(num), "Fahrenheit");
                    break;

                case 2: num = input("Fahrenheit");
                    output(F_C(num), "Celcius");
                    break;

                default: System.out.println("Invalid Input");
            }
        }while(true);
    }
}
