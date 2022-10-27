package bitlab.javastart.chapter3;

import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int counter = 0;
        int n;
        while((n = scanner.nextInt()) != 0) {
            sum += n;
            counter++;
        }
        System.out.println(sum/counter);
    }
}
