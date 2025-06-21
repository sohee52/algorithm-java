package sString;

import java.io.*;
import java.util.Scanner;

public class J5622 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();

        // 문자열로 각 숫자의 알파벳들을 정의
        String[] dial = {"", "", "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};

        int totalTime = 0;

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            // 각 숫자(2-9)에서 해당 문자를 찾기
            for (int j = 2; j <= 9; j++) {
                if (dial[j].contains(String.valueOf(ch))) {
                    totalTime += (j + 1); // 숫자 j를 누르는데 걸리는 시간 = j + 1초
                    break;
                }
            }
        }

        System.out.println(totalTime);
        sc.close();
    }
}
