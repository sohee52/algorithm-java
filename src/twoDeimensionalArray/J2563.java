package twoDeimensionalArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class J2563 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean[][] paper = new boolean[100][100];
        int n = Integer.parseInt(br.readLine());
        int totalArea = 0;

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            for (int row = y; row < y + 10; row++) {
                for (int col = x; col < x + 10; col++) {
                    if (!paper[row][col]) {
                        paper[row][col] = true;
                        totalArea++;
                    }
                }
            }
        }
        System.out.println(totalArea);
        br.close();
    }
}
