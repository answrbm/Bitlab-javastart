package bitlab.javastart.chapter2;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        if(i == 1) System.out.println("Monday");
        if(i == 2) System.out.println("Tuesday");
        if(i == 3) System.out.println("Wednesday");
        if(i == 4) System.out.println("Thursday");
        if(i == 5) System.out.println("Friday");
        if(i == 6) System.out.println("Saturday");
        if(i == 7) System.out.println("Sunday");

    }
}
