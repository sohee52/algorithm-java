package deepening;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class J1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (isGroupWord(br.readLine())) {
                count++;
            }
        }

        System.out.println(count);
        br.close();
    }

    public static boolean isGroupWord(String word) {
        boolean[] used = new boolean[26];
        char prev = 0;

        for (int i = 0; i < word.length(); i++) {
            char curr = word.charAt(i);

            if (curr != prev) { // 새로운 문자 그룹 시작
                int idx = curr - 'a';
                if (used[idx]) return false; // 이미 사용된 문자면 그룹 단어 아님
                used[idx] = true;
                prev = curr;
            }
        }

        return true;
    }
}
