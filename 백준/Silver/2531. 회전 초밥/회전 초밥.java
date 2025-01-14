import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int[] ary = new int[N];
        int[] num = new int[d + 1];

        for (int i = 0; i < N; i++) {
            ary[i] = Integer.parseInt(br.readLine());
        }

        int answer = 0;
        int result = 0;
        // 초기 k개의 접시
        for (int i = 0; i < k; i++) {
            num[ary[i]]++;
            if (num[ary[i]] == 1) {
                answer++;
            }
        }

        if(num[c] == 0){
            result = Math.max(answer + 1, result);
        }

        for (int i = 1; i < N; i++) {
            num[ary[i - 1]]--;
            if (num[ary[i - 1]] == 0) {
                answer--;
            }

            num[ary[(i - 1 + k) % N]]++;
            if (num[ary[(i - 1 + k) % N]] == 1) {
                answer++;
            }

            if (num[c] == 0) {
                result = Math.max(answer + 1, result);
            } else {
                result = Math.max(answer, result);
            }
        }
        System.out.println(result);
    }
}