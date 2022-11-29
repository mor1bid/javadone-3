import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.*;
import java.util.Arrays;

public class dz {
    public static void main(String[] args) {
        Scanner work = new Scanner(System.in);
        System.out.println("2. Введите желаемый размер массива: ");
        String si = work.nextLine();
        int ze = Integer.parseInt(si);
        ArrayList<Integer> numbs = new ArrayList<>();
        ArrayList<Integer> odds = new ArrayList<>();
        for (int i = 0; i<ze; i++) {
            int randnum = ThreadLocalRandom.current().nextInt(0, 23);
            numbs.add(randnum);
            if (randnum / 2 != 0) {
                odds.add(randnum);
            }
        }
        System.out.println(Arrays.asList(numbs) + " - изначальный вид массива.");
        System.out.println(Arrays.asList(odds) + " - массив нечётных чисел.");
        work.close();
    }
}
