import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int K = Integer.parseInt(br.readLine());

        int[] intArr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i<N; i++)
            intArr[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(intArr);

        List<Integer> list = new LinkedList<>();
        for(int i = 0; i<N-1; i++)
            list.add(intArr[i+1] - intArr[i]);

        Collections.sort(list);

        int sum = 0;
        for(int i = 0; i<N-K; i++){
            sum += list.get(i);
        }

        System.out.println(sum);
    }
}