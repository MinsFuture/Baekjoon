import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());

        int[] S = new int[N / 2];
        int[] J = new int[N / 2];

        for (int i = 0; i < N / 2; i++) {
            S[i] = Integer.parseInt(br.readLine());
            J[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(S);
        Arrays.sort(J);

        int min = Integer.MAX_VALUE;
        int count = 0;

        for (int i = 1; i < H + 1; i++) {
            int sum = N - binarySearch(N, i, S) - binarySearch(N, H - i + 1, J);

            if (min > sum) {
                min = sum;
                count = 0;
            }

            if (min == sum) {
                count++;
            }
        }

        System.out.print(min + " ");
        System.out.println(count);

    }

    public static int binarySearch(int N, int key, int[] ary) {

        int left = 0;
        int right = N / 2;

        while (left < right) {
            int mid = (left + right) / 2;

            if (ary[mid] >= key) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }
}