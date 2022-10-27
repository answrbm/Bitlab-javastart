package bitlab.javastart.chapter1;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();

        int x3 = (int)Math.pow(x,3);
        int z3 = (int)Math.pow(z,3);

        System.out.println(x3 + 5*x*y - 6*z*y + z3);
    }
}
