package week2.arraylists;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class WhereIsIt {
    public static final Random RANDOM = new Random();

    public static void main(String[] args) {
        ArrayList<Integer> randomArrayList = new ArrayList<>();
        Scanner userInput = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            int randomNumber = RANDOM.nextInt(99) + 1;
            randomArrayList.add(randomNumber);
        }

        System.out.println(randomArrayList);
        System.out.println("Value to find: ");
        int numberChosen = userInput.nextInt();
        boolean found = false;

        for (int j = 0; j < randomArrayList.size(); j++) {
            if (randomArrayList.get(j) == numberChosen) {
                System.out.println(String.format("%d is in slot %d.", numberChosen, j));
                found = true;
            }
        }

        if (found == false) {
            System.out.println(numberChosen + " is not in the ArrayList.");
        }
    }
}
