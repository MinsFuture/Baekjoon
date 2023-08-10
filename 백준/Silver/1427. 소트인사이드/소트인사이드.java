import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int num = Integer.parseInt(str);
        int n = str.length();
        int[] ary = new int[n];
        int digit = 10;
        int quotient, remain;

        for (int i = 0; i < n; i++) {
            remain = (int) (num % Math.pow(digit, i + 1));
            quotient = (int) (remain / Math.pow(digit, i));
            ary[i] = quotient;
        }

        Arrays.sort(ary);
        for (int i = n-1; i >= 0; i--) {
            stringBuilder.append(ary[i]);
        }

        System.out.print(stringBuilder.toString());
    }
}
