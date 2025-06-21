package sString;

import java.io.*;

public class J1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine().trim(); // 앞뒤 공백 제거

        if (input.isEmpty()) {
            bw.write("0");
        } else {
            String[] a = input.split(" ");
            bw.write(String.valueOf(a.length));
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
