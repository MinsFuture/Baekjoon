import java.io.*;
import java.net.Inet4Address;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] ary = new int[n];

        for (int i = 0; i < n; i++) {
            ary[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(ary);
        for (int k : ary) {
            bw.write(Integer.toString(k));
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
