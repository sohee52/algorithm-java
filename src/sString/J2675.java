package sString;

import java.io.*;

public class J2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String[] ms= br.readLine().split(" ");
            int m = Integer.parseInt(ms[0]);
            String s = ms[1];
            for (int j = 0; j < s.length(); j++) {
                char a = s.charAt(j);
                bw.write(String.valueOf(a).repeat(m));
            }
            bw.newLine();
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
