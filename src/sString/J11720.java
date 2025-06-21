package sString;

import java.io.*;

public class J11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String arr = br.readLine();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int digit = arr.charAt(i) - '0';
            sum += digit;
        }
        bw.write(String.valueOf(sum));

        bw.flush();
        br.close();
        bw.close();
    }
}