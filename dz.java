import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.*;
import java.util.Arrays;
import java.util.*;

public class dz {
    public static void main(String[] args) {
        // int[] a1 = new int[] {21, 23, 24, 40, 75, 76, 78, 77, 900, 2100, 2200, 2300, 2400, 2500};
        // int[] a2 = new int[] {10, 11, 41, 50, 65, 86, 98, 101, 190, 1100, 1200, 3000, 5000};
        // int[] a3 = new int[a1.length + a2.length];
        // int l = 0, j = 0;
        // for (int k = 0; k<a3.length; k++) {
        //     if (l > a1.length-1) {
        //         int a = a2[j];
        //         a3[k] = a;
        //         j++;
        //     }
        //     else if (j > a2.length-1) {
        //         int a = a1[l];
        //         a3[k] = a;
        //         l++;
        //     }
        //     else if (a1[l] < a2[j]) {
        //         int a = a1[l];
        //         a3[k] = a;
        //         l++;
        //     }
        //     else {
        //         int b = a2[j];
        //         a3[k] = b;
        //         j++;
        //     }
        // }
        // System.out.println("1. " + Arrays.toString(a3));

        // Scanner work = new Scanner(System.in);
        // System.out.print("2. Введите желаемый размер массива: ");
        // String si = work.nextLine();
        // int ze = Integer.parseInt(si);
        // ArrayList<Integer> numbs = new ArrayList<>();
        // ArrayList<Integer> odds = new ArrayList<>();
        // for (int i = 0; i<ze; i++) {
        //     int randnum = ThreadLocalRandom.current().nextInt(0, 23);
        //     numbs.add(randnum);
        //     if (randnum % 2 != 0) {
        //         odds.add(randnum);
        //     }
        // }
        // System.out.println(Arrays.asList(numbs) + " - изначальный вид массива.");
        // System.out.println(Arrays.asList(odds) + " - массив нечётных чисел.");
        // work.close();

        // int mini = numbs.get(0), maxi = 0, midi = 0, sum = 0;
        // for (int i = 0; i<ze; i++) {
        //     int v1 = numbs.get(i);
        //     sum += v1;
        //     if (v1 > maxi) { maxi = v1; }
        //     else if (v1 < mini) { mini = v1;}
        //     // else {midi = v1;}
        // }
        // midi = sum / ze;
        // System.out.println("\n3.\n" + maxi + " - максимальное значение первого массива.");
        // System.out.println(mini + " - минимальное значение первого массива.");
        // System.out.println(midi + " - среднее значение первого массива.");
        
        int verco = 4;
        List<ArrayList<String>> cat = new ArrayList<>(verco);
            for(int i = 0; i < verco; i++) {
                int horco = 5;
                cat.add(new ArrayList<String>(5));
                System.out.println(cat.get(i).size());
            }
            cat.get(0).add(0, "проза");
            cat.get(2).add(1, "поэзия");
            cat.get(1).add(2, "док");
            for (int i = 0; i < verco; i++) {
                int edgco = cat.get(i).size();
                for (int ni = 0; ni < edgco; ni++) {
                    int startver = i;
                    String e = cat.get(i).get(ni);
                    System.out.printf("%s ", e, "\t");
                    // System.out.printf("Vertex %s is connected to vertex %s%n", startver, e);
                }
            }
    }

}
