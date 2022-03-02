package week2.arrays;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class WhereIsIt {
    public static final Random RANDOM = new Random();



    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            int randomNumber = RANDOM.nextInt(99) + 1;
            array[i] = randomNumber;
        }

        System.out.println(Arrays.toString(array));
        System.out.println("Value to find: ");
        int numberChosen = userInput.nextInt();
        boolean found = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberChosen) {
                found = true;
                System.out.println(String.format("%d is in slot %d.", numberChosen, i));
            }
        }
        if (found == false) {
            System.out.println(String.format("%d is not in the array.", numberChosen));
        }
    }



}



