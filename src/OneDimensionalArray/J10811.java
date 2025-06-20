package OneDimensionalArray;

import java.io.*;

public class J10811 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] terms = br.readLine().split(" ");
        int n = Integer.parseInt(terms[0]);
        int m = Integer.parseInt(terms[1]);

        int[] ball = new int[n];
        for (int i = 0; i < n; i++) {
            ball[i] = i + 1;
        }

        for (int i = 0; i < m; i++) {
            String[] term = br.readLine().split(" ");
            int s = Integer.parseInt(term[0]);
            int e = Integer.parseInt(term[1]);

            int start = s - 1;
            int end = e - 1;

            while (start < end) {
                int temp = ball[start];
                ball[start] = ball[end];
                ball[end] = temp;
                start++;
                end--;
            }
        }

        for (int i = 0; i < n; i++) {
            bw.write(String.valueOf(ball[i]) + " ");
        }
        bw.flush();
        br.close();
        bw.close();
    }
}