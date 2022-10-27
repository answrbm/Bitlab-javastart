package chapter4;

import java.util.Scanner;

public class Task28 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int capacity = scanner.nextInt();
        int[] nums = new int[capacity];
        for(int i = 0; i < nums.length; i++) {
            nums[i] = scanner.nextInt();
        }

        int capacity2 = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] % 2 == 0) {
                capacity2++;
            }
        }

        int[] oddNumbers = new int[capacity2];
        int index = 0;
        for(int i : nums) {
            if(i % 2 == 0) {
                oddNumbers[index] = i;
                System.out.print(oddNumbers[index] + " ");
                index++;
            }
        }
    }
}
