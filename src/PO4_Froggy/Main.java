package PO4_Froggy;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int [] stonesNumbers = Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt).toArray();

        String endWord = scanner.nextLine();

        StringBuilder sb = new StringBuilder();

        Lake lake = new Lake(stonesNumbers);
        for (Integer integer : lake) {
           sb.append(integer).append(", ");
        }
        System.out.println(sb.toString().substring(0,sb.toString().lastIndexOf(", ")));
    }
}
