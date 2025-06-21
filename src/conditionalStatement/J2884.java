package conditionalStatement;

import java.util.Scanner;

public class J2884 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = scanner.nextInt();
        int minute = scanner.nextInt();
        scanner.close();
        if (minute >= 45) {
            System.out.println(hour + " " + (minute - 45));
        } else {
            if (hour == 0) {
                System.out.println(23 + " " + (minute + 15));
            } else {
                System.out.println((hour -1 ) + " " + (minute + 15));
            }
        }
    }
}
