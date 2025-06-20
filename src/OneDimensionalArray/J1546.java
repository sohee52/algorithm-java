package OneDimensionalArray;

import java.io.*;

public class J1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        double max = 0;

        String[] scores = br.readLine().split(" ");
        double[] doubleScores = new double[n];

        // 점수 입력받으면서 최댓값 찾기
        for (int i = 0; i < n; i++) {
            doubleScores[i] = Integer.parseInt(scores[i]);
            max = Math.max(max, doubleScores[i]);
        }

        // 점수 변환: 모든 점수를 (점수/M)*100으로 변환
        for (int i = 0; i < n; i++) {
            doubleScores[i] = (doubleScores[i] / max) * 100;
        }

        // 평균 계산
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += doubleScores[i];
        }

        double average = sum / n;
        bw.write(String.valueOf(average));

        bw.flush();
        br.close();
        bw.close();
    }
}