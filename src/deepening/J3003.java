package deepening;

import java.io.*;

public class J3003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] nums = br.readLine().trim().split(" ");
        int[] intNums = new int[nums.length];
        int[] chess = {1, 1, 2, 2, 2, 8};
        int[] need = new int[6];
        for (int i = 0; i < nums.length; i++) {
            intNums[i] = Integer.parseInt(String.valueOf(nums[i]));
            need[i] = chess[i] - intNums[i];
        }
        for (int i = 0; i < 6; i++) {
            bw.write(need[i] + " ");
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
