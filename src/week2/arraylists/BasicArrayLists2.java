package week2.arraylists;
import java.util.ArrayList;
import java.util.Random;

public class BasicArrayLists2 {
    public static final Random RANDOM = new Random();



    public static void main(String[] args) {
        ArrayList<Integer> randomArrayList = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            int randomNumber = RANDOM.nextInt(99) + 1;
            randomArrayList.add(randomNumber);

        }

        System.out.println("ArrayList: " + randomArrayList);
    }


}


