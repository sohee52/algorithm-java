package oneDimensionalArray;

import java.io.*;

public class J5597 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] student = new int[30];
        for (int i = 0; i < 30; i++) {
            student[i] = i + 1;
        }

        for (int i = 0; i < 28; i++) {
            int k = Integer.parseInt(br.readLine());
            student[k - 1] = 0;
        }

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < 30; i++) {
            max = Math.max(max, student[i]);
        }

        int min = 0;
        for (int i = 0; i < 30; i++) {
            if (student[i] != max && student[i] != 0) {
                min = student[i];
            }
        }

        bw.write(String.valueOf(min) + "\n");
        bw.write(String.valueOf(max));
        bw.flush();
        br.close();
        bw.close();
    }
}
