package ConditionalStatement;

import java.util.Scanner;

public class C2480 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        scanner.close();
        int money;
        if (a == b && b == c) {
            money = 10000 + (a * 1000);
            System.out.println(money);
        } else if (a == b) {
            money = 1000 + (a * 100);
            System.out.println(money);
        } else if (c == b) {
            money = 1000 + (b * 100);
            System.out.println(money);
        } else if (a == c) {
            money = 1000 + (a * 100);
            System.out.println(money);
        } else {
            money = Math.max(Math.max(a, b), c) * 100;
            System.out.println(money);
        }
    }
}
