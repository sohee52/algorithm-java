package iteration;

import java.util.Scanner;

public class J25314 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int byteNum = scanner.nextInt();
        int longNum = byteNum / 4;
        for (int i = 0; i < longNum; i++) {
            System.out.print("long ");
        }
        System.out.println("int");
        scanner.close();
    }
}
