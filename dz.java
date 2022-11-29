import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.*;
import java.util.Arrays;

public class dz {
    public static void main(String[] args) {
        Scanner work = new Scanner(System.in);
        System.out.print("2. Введите желаемый размер массива: ");
        String si = work.nextLine();
        int ze = Integer.parseInt(si);
        ArrayList<Integer> numbs = new ArrayList<>();
        ArrayList<Integer> odds = new ArrayList<>();
        for (int i = 0; i<ze; i++) {
            int randnum = ThreadLocalRandom.current().nextInt(0, 23);
            numbs.add(randnum);
            if (randnum % 2 != 0) {
                odds.add(randnum);
            }
        }
        System.out.println(Arrays.asList(numbs) + " - изначальный вид массива.");
        System.out.println(Arrays.asList(odds) + " - массив нечётных чисел.");
        work.close();

        int mini = numbs.get(0), maxi = 0, midi = 0;
        for (int i = 0; i<ze; i++) {
            int v1 = numbs.get(i);
            if (v1 > maxi) { maxi = v1; }
            else if (v1 < mini) { mini = v1;}
            else {midi = v1;}
        }
        System.out.println("\n3.\n" + maxi + " - максимальное значение первого массива.");
        System.out.println(mini + " - минимальное значение первого массива.");
        System.out.println(midi + " - среднее значение первого массива.");
    }
}
