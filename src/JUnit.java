import java.util.Scanner;

public class JUnit {
    public static void countCurrency(int amount) {

    int[] notes = new int[]{1000, 100, 50, 10,5, 2, 1 };
    int[] noteCounter = new int[9];

    // count notes using Greedy approach
        for (int i = 0; i < 7; i++) {
        if (amount >= notes[i]) {
            noteCounter[i] = amount / notes[i];
            amount = amount % notes[i];
        }
    }

    // Print notes
        System.out.println("Currency Count ->");
        for (int i = 0; i < 9; i++) {
        if (noteCounter[i] != 0) {
            System.out.println(notes[i] + " : "
                    + noteCounter[i]);
        }
    }
}

    public static void main(String argc[]){
        int amount = 2450;
        countCurrency(amount);
    }

}
