package chapter4;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int capacity = scanner.nextInt();
        int[] nums = new int[capacity];
        for(int i = 0; i < nums.length; i++) {
            nums[i] = scanner.nextInt();
        }

        for(int i = 0; i < nums.length; i++) {
            System.out.println(i + " - " + nums[i]);
        }
    }
}
