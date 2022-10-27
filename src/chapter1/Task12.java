package bitlab.javastart.chapter1;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y= scanner.nextInt();
        int z= scanner.nextInt();

        System.out.println(x*x*x*x + 4*x*y*y - 4*y*z + z*z*z*z);


    }
}
