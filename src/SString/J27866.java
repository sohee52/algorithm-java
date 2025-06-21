package SString;

import java.io.*;

public class J27866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String word = br.readLine();
        int index = Integer.parseInt(br.readLine());

        char result = word.charAt(index - 1);
        bw.write(result);
        bw.newLine();

        bw.flush();
        br.close();
        bw.close();
    }
}