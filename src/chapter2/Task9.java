package bitlab.javastart.chapter2;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int i1 = scanner.nextInt();
        int i2 = scanner.nextInt();
        int i3 = scanner.nextInt();
        System.out.println(Math.min(Math.min(i1,i2),i3));
    }
}
