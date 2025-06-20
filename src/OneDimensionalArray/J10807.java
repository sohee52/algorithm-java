package OneDimensionalArray;

import java.io.*;

public class J10807 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] strArr = br.readLine().split(" ");
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(strArr[i]);
        }

        int v = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (v == arr[i]) {
                count++;
            }
        }

        bw.write(String.valueOf(count));
        bw.flush();
        br.close();
        bw.close();
    }
}