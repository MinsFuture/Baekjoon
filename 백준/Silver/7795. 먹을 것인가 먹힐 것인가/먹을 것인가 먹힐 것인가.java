import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            int answer = 0;
            int[] key = new int[n];
            for(int q = 0; q<n; q++){
                key[q] = sc.nextInt();
            }
            int[] ary = new int[m];
            for(int w = 0; w<m; w++){
                ary[w] = sc.nextInt();
            }
            Arrays.sort(ary);

            for(int j = 0; j<key.length; j++){
                int left = 0;
                int right = ary.length - 1;

                while(left <= right){
                    int mid = (left + right) / 2;

                    if(ary[mid] < key[j]){
                        left = mid + 1;
                    } else {
                        right = mid - 1;
                    }
                }
                answer += left;
            }

            System.out.println(answer);
        }

    }
}