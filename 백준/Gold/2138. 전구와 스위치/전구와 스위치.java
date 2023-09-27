import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    static int[] arr1;
    static int[] arr2;
    static int[] answer;
    static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        String inputString = br.readLine();
        String outputString = br.readLine();

        arr1 = new int[n]; // 1번째 전구를 안 누를때
        arr2 = new int[n]; // 1번째 전구를 눌렀을때
        answer = new int[n];

        for (int i = 0; i < n; i++) {
            arr1[i] = inputString.charAt(i) - '0';
            arr2[i] = inputString.charAt(i) - '0';
            answer[i] = outputString.charAt(i) - '0';
        }

        int a1 = 0;
        int a2 = 0;

        for (int i = 0; i < n; i++) {
            if (i == 0) {
                arr2[i] = 1 - arr2[i];
                arr2[i + 1] = 1 - arr2[i + 1];
                a2++;
            } else {
                if (arr1[i-1] != answer[i-1]) {
                    push(arr1, i);
                    a1++;
                }

                if (arr2[i-1] != answer[i-1]) {
                    push(arr2, i);
                    a2++;
                }
            }
        }

        int min = -1;

        if (!Arrays.equals(arr1, answer) && !Arrays.equals(arr2, answer)) {
        } else if (Arrays.equals(arr1, answer) && Arrays.equals(arr2, answer)) {
            min = a1 > a2 ? a2 : a1;
        } else {
            if (Arrays.equals(arr1, answer)) {
                min = a1;
            } else {
                min = a2;
            }
        }
        System.out.println(min);
    }


    private static void push(int[] ary, int i) {
        if (i == n - 1) {
            ary[i - 1] = 1 - ary[i - 1];
            ary[i] = 1 - ary[i];
        } else {
            ary[i - 1] = 1 - ary[i - 1];
            ary[i] = 1 - ary[i];
            ary[i + 1] = 1 - ary[i + 1];
        }
    }

}
