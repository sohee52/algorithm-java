package sString;

import java.io.*;

public class J2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().trim().split(" ");
        int[] rInput = new int[2];

        for (int i = 0; i < 2; i++) {
            int a = Integer.parseInt(input[i]);

            int a1 = a % 10;
            int a2 = (a / 10) % 10;
            int a3 = a / 100;

            rInput[i] = a1 * 100 + a2 * 10 + a3;
        }

        bw.write(String.valueOf(Math.max(rInput[0], rInput[1])));
        bw.flush();
        br.close();
        bw.close();
    }
}