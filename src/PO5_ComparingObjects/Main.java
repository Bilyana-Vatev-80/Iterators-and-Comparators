package PO5_ComparingObjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String input = scanner.nextLine();

        List<Person> people = new ArrayList<>();
        while (!input.equals("END")){
            String[] personInfo = input.split("\\s+");
            Person person = new Person(personInfo[0], Integer.parseInt(personInfo[1]),personInfo[2]);
            people.add(person);

            input = scanner.nextLine();
        }
        int n = Integer.parseInt(scanner.nextLine());
        Person personForCompare = people.get(n -1);

        int countEqual = 0;

        for (Person person : people) {
            if(personForCompare.compareTo(person) == 0){
                countEqual ++;
            }
        }
        if(countEqual == 1){
            System.out.println("No matches");
        } else {
            System.out.println(countEqual + " " + (people.size() - countEqual) + " " + (people.size()));
        }
    }
}
