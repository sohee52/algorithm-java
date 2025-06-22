package deepening;

import java.io.*;

public class J2444 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i < n; i++) {
            bw.write(String.valueOf(" ").repeat(n - i));
            bw.write(String.valueOf("*").repeat(i * 2 - 1));
            bw.newLine();
        }

        for (int i = n; i > 0; i--) {
            bw.write(String.valueOf(" ").repeat(n - i));
            bw.write(String.valueOf("*").repeat(i * 2 - 1));
            bw.newLine();
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
