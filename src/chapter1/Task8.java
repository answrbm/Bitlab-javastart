package bitlab.javastart.chapter1;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sqr = (int)Math.pow(number,2);
        int cube = (int)Math.pow(number,3);
        System.out.println(sqr);
        System.out.println(cube);
    }
}
