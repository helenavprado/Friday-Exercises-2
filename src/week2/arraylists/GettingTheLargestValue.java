package week2.arraylists;
import java.util.ArrayList;
import java.util.Random;

public class GettingTheLargestValue {
    public static final Random RANDOM = new Random();

    public static void main(String[] args) {
            ArrayList<Integer> randomArrayList = new ArrayList<>();
            for (int i = 1; i <= 10; i++) {
                int randomNumber = RANDOM.nextInt(99) + 1;
                randomArrayList.add(randomNumber);
            }

            int maxValue = 0;
            for (int i = 0; i < randomArrayList.size(); i++) {
                if (randomArrayList.get(i) > maxValue) {
                    maxValue = randomArrayList.get(i);
                }
            }

        System.out.println(randomArrayList);
        System.out.println("The largest value is " + maxValue);
    }
}

