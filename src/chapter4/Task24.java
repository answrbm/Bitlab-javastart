package chapter4;

import java.util.Scanner;

public class Task24 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int capacity = scanner.nextInt();
        int[] nums = new int[capacity];
        for(int i = 0; i < nums.length; i++) {
            nums[i] = scanner.nextInt();
        }


        int m = scanner.nextInt();
        boolean isExist = false;
        int index = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == m) {
                isExist = true;
                index = i;
            }
        }
        if(isExist) {
            System.out.println("YES");
            System.out.println(index);
        } else {
            System.out.println("NO");
        }
    }
}
