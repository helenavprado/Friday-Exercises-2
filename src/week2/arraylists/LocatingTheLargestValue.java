package week2.arraylists;

import java.util.ArrayList;
import java.util.Random;

public class LocatingTheLargestValue {
    public static final Random RANDOM = new Random();

    public static void main(String[] args) {
        ArrayList<Integer> randomArrayList = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            int randomNumber = RANDOM.nextInt(99) + 1;
            randomArrayList.add(randomNumber);
        }

        int maxValue = 0;
        int index = 0;
        for (int i = 0; i < randomArrayList.size(); i++) {
            if (randomArrayList.get(i) > maxValue) {
                maxValue = randomArrayList.get(i);
                index = i;
            }
        }

        System.out.println(randomArrayList);
        System.out.println(String.format("The largest value is %d, which is in slot %d", maxValue, index));
    }
}
