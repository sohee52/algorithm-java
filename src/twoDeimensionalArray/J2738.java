package twoDeimensionalArray;

import java.io.*;
import java.util.StringTokenizer;

public class J2738 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer dimensions = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(dimensions.nextToken());
        int m = Integer.parseInt(dimensions.nextToken());

        int[][] firstMatrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            StringTokenizer row = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                firstMatrix[i][j] = Integer.parseInt(row.nextToken());
            }
        }

        int[][] secondMatrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            StringTokenizer row = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                secondMatrix[i][j] = Integer.parseInt(row.nextToken());
                bw.write(String.valueOf(firstMatrix[i][j] + secondMatrix[i][j]));
                if (j < m - 1) bw.write(" ");
            }
            bw.newLine();
        }

        bw.flush();
        br.close();
        bw.close();
    }
}