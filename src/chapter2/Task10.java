package bitlab.javastart.chapter2;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int i1 = scanner.nextInt();
        int i2 = scanner.nextInt();
        int i3 = scanner.nextInt();
        int i4 = scanner.nextInt();

        if(i1 % 2 == 0 && i1 > i2 && i1 > i3 && i1 > i4) System.out.println(i1);
        else if(i2 % 2 == 0 && i2 > i1 && i2 > i3 && i2 > i4) System.out.println(i2);
        else if(i3 % 2 == 0 && i3 > i1 && i3 > i2 && i3 > i4) System.out.println(i3);
        else if(i4 % 2 == 0 && i4 > i1 && i4 > i2 && i4 > i3) System.out.println(i4);
        else System.out.println("Not Found");
    }
}
