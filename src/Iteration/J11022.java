package Iteration;

import java.io.*;

public class J11022 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        for (int i = 1; i <= n; i++) {
            String[] input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);
            bw.write("Case #" + i + ": " + a + " + " + b + " = " + (a + b) + "\n");
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
