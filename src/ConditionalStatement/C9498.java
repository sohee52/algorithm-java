package ConditionalStatement;

import java.util.Scanner;

public class C9498 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        scanner.close();
        switch(a / 10) {
            case(10):
                System.out.println("A");
                break;
            case(9):
                System.out.println("A");
                break;
            case(8):
                System.out.println("B");
                break;
            case(7):
                System.out.println("C");
                break;
            case(6):
                System.out.println("D");
                break;
            default:
                System.out.println("F");
                break;
        }
    }
}
