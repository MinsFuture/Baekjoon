import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []ary = new int[n+1];
        Map<Integer, Integer> map = new HashMap<>();
        boolean[] visited = new boolean[n+1];
        List<Integer> answer = new ArrayList<>();
        Set<Integer> up = new HashSet<>();
        Set<Integer> down = new HashSet<>();


        for(int i = 1; i<=n; i++){
            ary[i] = sc.nextInt();
            if(i == ary[i]){
                visited[i] = true;
                answer.add(i);
            }
            map.put(i, ary[i]);
        }

        for(int i = 1; i<=n; i++){
            int key = i;
            List<Integer> temp = new ArrayList<>();
            up = new HashSet<>();
            down = new HashSet<>();

            while(!visited[key]){
                up.add(key);
                temp.add(key);

                visited[key] = true;
                key = map.get(key);
                down.add(key);
            }

            if(up.equals(down)){
                answer.addAll(temp);
            } else{
                for (Integer integer : temp) {
                    visited[integer] = false;
                }
            }

        }

        System.out.println(answer.size());
        Collections.sort(answer);
        for(int i = 0; i<answer.size(); i++){
            System.out.println(answer.get(i));
        }
    }

}

