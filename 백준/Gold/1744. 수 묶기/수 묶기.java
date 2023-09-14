import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int n = sc.nextInt();
        int[] ary = new int[n];
        int negativeNum = 0, zeroNum = 0, positiveNum = 0;

        for (int i = 0; i < n; i++) {
            ary[i] = sc.nextInt();
            if (ary[i] < 0) {
                negativeNum++;
            } else if (ary[i] == 0) {
                zeroNum++;
            } else if (ary[i] > 1) {
                positiveNum++;
            } 
        }

        Arrays.sort(ary);

        if (n == 1) {
            System.out.println(ary[0]);
        } else {
            if (negativeNum % 2 == 0) {
                int i;
                for (i = 0; i < negativeNum - 1; i += 2) {
                    sum += ary[i] * ary[i + 1];
                }

                while (i < n && ary[i] <= 1) {
                    sum += ary[i];
                    i++;
                }

                if (positiveNum % 2 == 0) {
                    for (; i < n - 1; i += 2) {
                        sum += ary[i] * ary[i + 1];
                    }
                } else {
                    sum += ary[i++];
                    for (; i < n - 1; i += 2) {
                        sum += ary[i] * ary[i + 1];
                    }
                }
            } else {
                int i;
                for (i = 0; i < negativeNum - 1; i += 2) {
                    sum += ary[i] * ary[i + 1];
                }

                if (zeroNum > 0) {
                    i++;
                } else {
                    sum += ary[i];
                    i++;
                }

                while (i<n && ary[i] <= 1) {
                    sum += ary[i];
                    i++;
                }

                if (positiveNum % 2 == 0) {
                    for (; i < n - 1; i += 2) {
                        sum += ary[i] * ary[i + 1];
                    }
                } else {
                    sum += ary[i++];
                    for (; i < n - 1; i += 2) {
                        sum += ary[i] * ary[i + 1];
                    }
                }
            }
            System.out.println(sum);

        }
    }
}
