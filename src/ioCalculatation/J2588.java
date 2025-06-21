package ioCalculatation;

import java.util.Scanner;

public class J2588 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = b % 10;
        int d = (b % 100 - b % 10) / 10;
        int e = b / 100;
        System.out.println(a * c);
        System.out.println(a * d);
        System.out.println(a * e);
        System.out.println(a*c + (a*d)*10 + (a*e)*100);
        scanner.close();
    }
}
