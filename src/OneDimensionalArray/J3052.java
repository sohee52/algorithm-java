package OneDimensionalArray;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class J3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] nums = new int[10];

        for (int i = 0; i < 10; i++) {
            nums[i] = Integer.parseInt(br.readLine());
        }

        Set<Integer> remainders = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            remainders.add(nums[i] % 42);
        }

        bw.write(remainders.size() + "\n");
        bw.flush();
        br.close();
        bw.close();
    }
}