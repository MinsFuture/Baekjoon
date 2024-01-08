import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] rope = new int[N];

        int maxW = 0;

        for (int i = 0; i < N; i++) {
            rope[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(rope);
        
        for (int i = 0; i < N; i++) {
            int w = 0;
            w += rope[i] * (N - i);
            maxW = Math.max(maxW, w);
        }

        System.out.println(maxW);
    }
}
