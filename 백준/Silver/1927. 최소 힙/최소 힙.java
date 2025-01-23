import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PriorityQueue<Integer> q = new PriorityQueue<>();

        for(int i = 0; i<n; i++){
            int num = sc.nextInt();
            if(num == 0){
                if(!q.isEmpty()){
                    System.out.println(q.poll());
                    continue;
                }
                System.out.println(0);
                continue;
            }
            q.add(num);
        }

    }
}