package sString;

import java.io.*;

public class J10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String ss = br.readLine();

        int[] position = new int[26];
        for (int i = 0; i < 26; i++) {
            position[i] = -1;
        }

        for (int i = 0; i < ss.length(); i++) {
            int a = ss.charAt(i) - 'a';
            if (position[a] == -1) {
                position[a] = i;
            }
        }

        for (int i = 0; i < 26; i++) {
            bw.write(String.valueOf(position[i]) + " ");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
