package oneDimensionalArray;

import java.io.*;

public class J2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] intArr = new int[9];
        int count = 0;

        for (int i = 0; i < 9; i++) {
            int n = Integer.parseInt(br.readLine());
            intArr[i] = n;
        }

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < 9; i++) {
            max = Math.max(max, intArr[i]);
            if (intArr[i] == max) {
                count = (i + 1);
            }
        }

        bw.write(String.valueOf(max + "\n"));
        bw.write(String.valueOf(count));
        bw.flush();
        br.close();
        bw.close();
    }
}
