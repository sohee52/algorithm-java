package sString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class J11718 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;

        // 입력이 끝날 때까지 한 줄씩 읽어서 그대로 출력
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        br.close();
    }
}
