package deepening;

import java.io.*;
import java.util.HashMap;

public class J1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String word = br.readLine().toUpperCase();
        HashMap<Character, Integer> alphabet = new HashMap<>();

        // 알파벳 초기화
        for (char c = 'A'; c <= 'Z'; c++) {
            alphabet.put(c, 0);
        }

        // 각 문자 개수 세기
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            alphabet.put(ch, alphabet.get(ch) + 1);
        }

        // 최댓값 찾기
        int maxCount = 0;
        char result = '?';
        int maxCountFreq = 0; // 최댓값이 몇 개인지 세기

        for (char c = 'A'; c <= 'Z'; c++) {
            int count = alphabet.get(c);
            if (count > maxCount) {
                maxCount = count;
                result = c;
                maxCountFreq = 1;
            } else if (count == maxCount && count > 0) {
                maxCountFreq++;
            }
        }

        // 최댓값이 여러 개면 '?', 아니면 해당 문자 출력
        if (maxCountFreq > 1) {
            bw.write('?');
        } else {
            bw.write(result);
        }

        bw.flush();
        br.close();
        bw.close();
    }
}