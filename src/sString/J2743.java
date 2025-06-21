package sString;

import java.io.*;

public class J2743 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String word = br.readLine();

        bw.write(String.valueOf(word.length()));
        bw.flush();
        br.close();
        bw.close();
    }
}
