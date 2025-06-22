package deepening;

import java.io.*;
import java.util.Scanner;

public class J2941 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();

        int count = 0;
        int i = 0;

        while (i < word.length()) {
            // 3글자 패턴 체크 (dz=)
            if (i <= word.length() - 3 && word.substring(i, i + 3).equals("dz=")) {
                count++;
                i += 3;
            }
            // 2글자 패턴 체크 (c=, c-, d-, lj, nj, s=, z=)
            else if (i <= word.length() - 2) {
                String twoChar = word.substring(i, i + 2);
                if (twoChar.equals("c=") || twoChar.equals("c-") ||
                        twoChar.equals("d-") || twoChar.equals("lj") ||
                        twoChar.equals("nj") || twoChar.equals("s=") ||
                        twoChar.equals("z=")) {
                    count++;
                    i += 2;
                } else {
                    // 일반 문자 (1글자)
                    count++;
                    i++;
                }
            }
            // 마지막 문자가 1글자만 남은 경우
            else {
                count++;
                i++;
            }
        }

        System.out.println(count);
        sc.close();
    }
}
