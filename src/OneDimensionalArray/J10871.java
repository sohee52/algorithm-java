package OneDimensionalArray;

import java.io.*;

public class J10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = br.readLine().split(" ");
        int n = Integer.parseInt(arr[0]);
        int x = Integer.parseInt(arr[1]);
        String[] arr2 = br.readLine().split(" ");
        int[] newArr = new int[n];
        for (int i = 0; i < n; i++) {
            newArr[i] = Integer.parseInt(arr2[i]);
        }
        for (int i = 0; i < n; i++) {
            if (newArr[i] < x) {
                bw.write(String.valueOf(newArr[i]) + " ");
            }
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
