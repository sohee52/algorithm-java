package OneDimensionalArray;

import java.io.*;

public class J10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] strArr = br.readLine().split(" ");
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(strArr[i]);
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i : arr) {
            min = Math.min(min, i);
            max = Math.max(max, i);
        }

        bw.write(String.valueOf(min) + " ");
        bw.write(String.valueOf(max));
        bw.flush();
        br.close();
        bw.close();
    }
}
