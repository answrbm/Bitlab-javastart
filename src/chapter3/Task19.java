package bitlab.javastart.chapter3;

import java.util.Scanner;

public class Task19 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        while(scanner.nextInt() != 0) {
            counter++;
        }
        System.out.println(counter);
    }
}
