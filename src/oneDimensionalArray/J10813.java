package oneDimensionalArray;

import java.io.*;

public class J10813 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] strArr = br.readLine().split(" ");
        int n = Integer.parseInt(strArr[0]);
        int m = Integer.parseInt(strArr[1]);

        int[] ball = new int[n];

        for (int i = 0; i < n; i++) {
            ball[i] = (i + 1);
        }

        for (int j = 0; j < m; j++) {
            String[] strArr1 = br.readLine().split(" ");
            int a = Integer.parseInt(strArr1[0]) - 1;
            int b = Integer.parseInt(strArr1[1]) - 1;
            int temp = ball[a];
            ball[a] = ball[b];
            ball[b] = temp;
        }

        for (int i = 0; i < n; i++) {
            bw.write(String.valueOf(ball[i]) + " ");
        }
        bw.flush();
        br.close();
        bw.close();
    }
}