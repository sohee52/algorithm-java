package deepening;

import java.io.*;

public class J10988 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String word = br.readLine();

        boolean tf = true;
        int sp = 0;
        int ep = word.length() - 1;

        while (sp < ep) {
            char s = word.charAt(sp);
            char e = word.charAt(ep);
            if (s != e) {
                tf = false;
                break;
            }
            sp++;
            ep--;
        }

        if (tf == false) {
            bw.write(String.valueOf(0));
        } else {
            bw.write(String.valueOf(1));
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
