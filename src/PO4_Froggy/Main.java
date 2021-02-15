package PO4_Froggy;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int [] stonesNumbers = Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt).toArray();

        StringBuilder sb = new StringBuilder();

        Lake lake = new Lake(stonesNumbers);
        List<String> result = new ArrayList<>();
        for (Integer integer : lake) {
        }
        System.out.println(sb.toString().substring(0,sb.toString().lastIndexOf(", ")));
    }
}
