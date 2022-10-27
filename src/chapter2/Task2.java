package bitlab.javastart.chapter2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        if(i > 10 && i < 20) System.out.println("YES");
        else System.out.println("NO");
    }
}
