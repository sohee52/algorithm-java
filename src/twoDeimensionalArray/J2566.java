package twoDeimensionalArray;

import java.io.*;
import java.util.StringTokenizer;

public class J2566 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int max = -1;
        int row = -1;
        int col = -1;
        for (int i = 0; i < 9; i++) {
            StringTokenizer matrix = new StringTokenizer(br.readLine());
            for (int j = 0; j < 9; j++) {
                int a = Integer.parseInt(matrix.nextToken());
                if (a > max) {
                    max = a;
                    row = i + 1;
                    col = j + 1;
                }
            }
        }

        bw.write(String.valueOf(max));
        bw.newLine();
        bw.write(row + " " + col);

        bw.flush();
        br.close();
        bw.close();
    }
}
