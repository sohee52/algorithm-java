package sString;

import java.io.*;

public class J11654 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        char a = input.charAt(0);
        int ascii = (int) a;

        bw.write(String.valueOf(ascii));
        bw.flush();
        br.close();
        bw.close();
    }
}