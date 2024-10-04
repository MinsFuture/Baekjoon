import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] tree = new int[n];
        int max = 0;

        for(int i = 0; i<n; i++){
            tree[i] = sc.nextInt();
            if(max < tree[i]){
                max = tree[i];
            }
        }

        long result = binarySearch(tree, max, m);
        System.out.println(result);
    }

    public static long binarySearch(int[] tree, int max, int m){
        long low = 0;
        long high = max;

        long answer = 0;
        long mid = (low + high) / 2;

        // answer 이 m 보다 작다 -> mid가 너무 높다 -> high를 줄임
        // answer 이 m 보다 크다 -> mid가 너무 낮다 -> low를 올림
        while(low < high){
            mid = (low + high) / 2;
            answer = 0;

            for(int i = 0; i<tree.length; i++){
                long length = tree[i] - mid;
                if(length < 0){
                    continue;
                }
                answer += length;
            }
            if(answer < m){
                high = mid;
            } else{
                low = mid + 1;
            }
        }

        return low -1;
    }
}