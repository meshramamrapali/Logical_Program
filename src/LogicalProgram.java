public class LogicalProgram {
    public static void main(String[] args) {

        int i = 1, n = 10, num1 = 0, num2 = 1;
        System.out.println("Fibonacci Series");

        while (i <= n) {
            System.out.print(num1 + " ");

            int num3 = num1 + num2;
            num1 = num2;
            num2 = num3;

            i++;
        }
    }
    }
