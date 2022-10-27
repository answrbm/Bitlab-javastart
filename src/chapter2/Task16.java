package bitlab.javastart.chapter2;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int i1 = scanner.nextInt();
        int i2 = scanner.nextInt();
        int i3 = scanner.nextInt();

        if(i1 > 10 && i2 > 10 && i3 > 10 &&
                i1 % 5 == 0 && i2 % 5 == 0 && i3 % 5 == 0) System.out.println("YES");
        else System.out.println("NO");
    }
}
