package chapter6;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String letter = scanner.nextLine();

        int index = s.indexOf(letter);
        if(index != -1) System.out.println(index);
        else System.out.println("THERE IS NO SUCH LETTER");
    }
}
