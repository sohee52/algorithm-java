package sString;

import java.io.*;

public class J9086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String ss = br.readLine();
            bw.write(String.valueOf(ss.charAt(0)));
            bw.write(String.valueOf(ss.charAt(ss.length() - 1)));
            bw.newLine();
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
