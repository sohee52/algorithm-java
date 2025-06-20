package Iteration;

import java.util.Scanner;

public class J10950 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        for (int i = 0; i < a; i++) {
            int m = scanner.nextInt();
            int n = scanner.nextInt();
            System.out.println(m+n);
        }
        scanner.close();
    }
}
