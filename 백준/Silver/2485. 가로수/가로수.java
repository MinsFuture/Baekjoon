import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Integer, Integer> map = new HashMap<>();

        int n = Integer.parseInt(br.readLine());
        int[] ary = new int[n];
        for (int i = 0; i < n; i++) {
            ary[i] = Integer.parseInt(br.readLine());
        }
        int sum = 0;
        int gcdNum = 1;
        int value = 0;

        for (int i = 0; i < n - 1; i++) {
            int diff = ary[i+1] - ary[i];
            sum += diff;
            if (!map.containsKey(diff)) {
                map.put(diff, value++);
                if (value == 1) {
                    gcdNum = diff;
                } else {
                    gcdNum = gcd(gcdNum, diff);
                }
            }
        }

        System.out.print((sum - (n-1) * gcdNum) / gcdNum);

    }

    static int gcd(int a, int b) {
        int r;

        if (a > b) {
            while (b != 0) {
                r = a % b;
                a = b;
                b = r;
            }
            return a;
        } else {
            while (a != 0) {
                r = b % a;
                b = a;
                a = r;
            }
            return b;
        }
    }
}
