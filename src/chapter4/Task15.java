package chapter4;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Task15 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int capacity = scanner.nextInt();
        int[] nums = new int[capacity];
        for(int i = 0; i < nums.length; i++) {
            nums[i] = scanner.nextInt();
        }

        AtomicInteger mult = new AtomicInteger(1);
        Arrays.stream(nums).filter(x -> x != 0).forEach(y -> mult.updateAndGet(v -> v * y));
        System.out.println(mult.get());
    }
}
