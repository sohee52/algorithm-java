package oneDimensionalArray;

import java.io.*;

public class J10810 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] strArr = br.readLine().split(" ");
        int n = Integer.parseInt(strArr[0]);
        int m = Integer.parseInt(strArr[1]);

        int[] arr = new int[n];

        for (int j = 0; j < m; j++) {
            String[] strArr1 = br.readLine().split(" ");
            int s = Integer.parseInt(strArr1[0]);
            int e = Integer.parseInt(strArr1[1]);
            int k = Integer.parseInt(strArr1[2]);

            for (int i = (s - 1); i < e; i++) {
                arr[i] = k;
            }
        }

        for (int i = 0; i < n; i++) {
            bw.write(String.valueOf(arr[i]) + " ");
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
