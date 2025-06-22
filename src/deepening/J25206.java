package deepening;

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class J25206 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        HashMap<String, Double> mapGrade = new HashMap<String, Double>();
        String[] grades = {"A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F"};
        double[] scores = {4.5, 4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0, 0.0};
        for(int i = 0; i < grades.length; i++) {
            mapGrade.put(grades[i], scores[i]);
        }

        double total = 0;
        double sum = 0;
        for (int i = 0; i < 20; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String subject = st.nextToken();
            double credit = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();

            if (!grade.equals("P")) {
                total += credit * mapGrade.get(grade);
                sum += credit;
            }
        }

        bw.write(String.format("%.6f", total / sum));

        bw.flush();
        br.close();
        bw.close();
    }
}
