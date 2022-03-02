package week2.arrays;
import java.util.Arrays;
import java.util.Random;

public class FindingTheLargestValue {
    public static final Random RANDOM = new Random();

    public static void main(String[] args) {
        int[] randomArray = new int[10];
        for (int i = 0; i < randomArray.length; i++) {
            int randomNumber = RANDOM.nextInt(99) + 1;
            randomArray[i] = randomNumber;
        }

        int maxValue = 0;
        for (int i = 0; i < randomArray.length; i++) {
            if (randomArray[i] > maxValue) {
                maxValue = randomArray[i];
            }
        }


        System.out.println("Array: " + Arrays.toString(randomArray));
        System.out.println(maxValue);


    }
}
