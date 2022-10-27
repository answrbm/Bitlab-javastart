package bitlab.javastart.chapter3;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for(int i = 1; i <= number; i++) {
            System.out.print(i + " ");
        }
    }
}
