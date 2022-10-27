package bitlab.javastart.chapter3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int i = scanner.nextInt();
        int count = 0;
        while(count < i) {
            System.out.println(s);
            count++;
        }
    }
}
