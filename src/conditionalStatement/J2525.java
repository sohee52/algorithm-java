package conditionalStatement;

import java.util.Scanner;

public class J2525 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = scanner.nextInt();
        int minute = scanner.nextInt();
        int need = scanner.nextInt();
        scanner.close();
        if (minute + need >= 60) {
            int newMinute = (minute + need) % 60;
            int newHour = hour + ((minute + need) / 60);
            if (newHour >= 24) {
                newHour -= 24;
            }
            System.out.println(newHour + " " + newMinute);
        } else {
            System.out.println(hour + " " + (minute + need));
        }
    }
}