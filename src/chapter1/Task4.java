package chapter1;

import java.util.Scanner;

public class Task4 {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        String surname = scanner.next();
        int age = scanner.nextInt();
        String country = scanner.next();

        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Age: " + age);
        System.out.println("Country: " + country);
    }
}
