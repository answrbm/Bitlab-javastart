package bitlab.javastart.chapter2;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        int year = scanner.nextInt();


        if(year >= 1000 && year <= 2000 && month >= 1 && month <= 12) System.out.println("YES");
        else System.out.println("NO");
    }
}
