package iteration;

import java.util.Scanner;

public class J25304 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int price = scanner.nextInt();
        int totalNum = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < totalNum; i++) {
            int product = scanner.nextInt();
            int num = scanner.nextInt();
            sum += product * num;
        }
        if (price == sum) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        scanner.close();
    }
}
