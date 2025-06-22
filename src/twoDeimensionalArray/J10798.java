package twoDeimensionalArray;

import java.io.*;

public class J10798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] words = new String[5];
        int maxLength = 0;

        // 입력 받기
        for (int i = 0; i < 5; i++) {
            words[i] = br.readLine();
            maxLength = Math.max(maxLength, words[i].length());
        }

        // 세로로 읽어서 StringBuilder에 추가
        for (int col = 0; col < maxLength; col++) {
            for (int row = 0; row < 5; row++) {
                if (col < words[row].length()) {
                    sb.append(words[row].charAt(col));
                }
            }
        }

        System.out.print(sb);
        br.close();
    }
}