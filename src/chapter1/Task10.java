package bitlab.javastart.chapter1;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        // T = (9/5 * t)+32
        Scanner scanner = new Scanner(System.in);
        double cel = scanner.nextInt();
        double far = (cel * 9/5) + 32;
        System.out.println(far);
    }
}
