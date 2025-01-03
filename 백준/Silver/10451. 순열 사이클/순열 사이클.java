import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i = 0; i<N; i++){
            int num = sc.nextInt();
            int[] ary = new int[num+1];
            for(int j = 1; j<=num; j++){
                ary[j] = sc.nextInt();
            }

            int result = bfs(ary);
            System.out.println(result);
        }
    }

    public static int bfs(int[] ary){
        boolean[] visited = new boolean[ary.length];
        Queue<Integer> q = new LinkedList<>();
        int result = 0;

        for(int i = 1; i< ary.length; i++){
            if(!visited[i]){
                q.add(i);
                visited[i] = true;
                while(!q.isEmpty()){
                    int num = ary[q.poll()];
                    if(!visited[num]){
                        visited[num] = true;
                        q.add(num);
                    }
                }
                result++;
            }
        }
        return result;
    }
}