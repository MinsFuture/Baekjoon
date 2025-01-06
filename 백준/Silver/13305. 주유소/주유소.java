import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] roadLength = new int[N - 1];
        int[] oil = new int[N];


        for (int i = 0; i < N - 1; i++) {
            roadLength[i] = sc.nextInt();
        }

        for (int i = 0; i < N; i++) {
            oil[i] = sc.nextInt();
        }

        int minIndex = N-1;

        int cost = 0;

        while(minIndex != 0){
            int min = Integer.MAX_VALUE;
            int tempIndex = 0;

            // 이전 minIndex;
            int beforeMinIndex = minIndex;

            for(int i = 0; i<minIndex; i++){
                if(min > oil[i]){
                    min = oil[i];
                    tempIndex = i;
                }
            }
            minIndex = tempIndex;

            int sum = 0;
            for(int i = minIndex; i<beforeMinIndex; i++){
                sum += roadLength[i];
            }
            cost += sum * oil[minIndex];
        }

        System.out.println(cost);
    }
}