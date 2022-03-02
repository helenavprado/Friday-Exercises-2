package week2.arraylists;
import java.util.ArrayList;
import java.util.Random;

public class FindingValueInArrayList {
    public static final Random RANDOM = new Random();

    public static void main(String[] args) {
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            int randomNumber = RANDOM.nextInt(99) + 1;
            arrayList1.add(randomNumber);
            arrayList2.add(randomNumber);

            if (i == 10) {
                arrayList1.set(9, -7);
            }
        }

        System.out.println("Array 1: " + arrayList1);
        System.out.println("Array 2: " + arrayList2);

    }

}
