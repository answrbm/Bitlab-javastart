package chapter6;

import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        String[] arr = scanner.nextLine().split(" ");
        int i1 = Integer.parseInt(arr[0]);
        int i2 = Integer.parseInt(arr[2]);
        switch(arr[1]) {
            case "+" : System.out.println(i1+i2);
                break;
            case "*" : System.out.println(i1*i2);
                break;
            case "/" : System.out.println(i1/i2);
                break;
            case "-" : System.out.println(i1-i2);
                break;
        }
    }
}
