package chapter4;

import java.util.ArrayList;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        int n = scanner.nextInt();

        for(int i = 0; i < n; i++) {
            numbers.add(scanner.nextInt());
        }

        numbers.stream().filter(x -> x >= 0).forEach(y -> System.out.print(y + " "));
    }
}
