package chapter6;

import java.util.Scanner;

public class Task24 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        String[] arr = scanner.nextLine().split(" ");

        String newS = "";
        for(int i = 0; i < arr.length; i++) {
            char[] letters = arr[i].toCharArray();
            letters[0] = Character.toUpperCase(letters[0]);
            newS += new String(letters) + " ";
        }
        System.out.println(newS);
    }
}
