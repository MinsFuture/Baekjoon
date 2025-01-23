import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());

        Queue<Integer> truck = new LinkedList<>();
        Queue<Integer> bridge = new LinkedList<>();
        int tome = 0;
        int nowW = 0;
        st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < n; i++) {
            truck.add(Integer.parseInt(st.nextToken())); // 트럭의 무게를 큐에 담음
        }

        for (int i = 0; i < w; i++) {
            bridge.add(0); // 현재 다리에 올라와있는 트럭의 무게
        }

        while (!bridge.isEmpty()) { // 현재 다리에 올라와 있는 트럭이 존재하지 않을 때 까지
            tome++; // 로직이 진행될 때 마다 시간이 1씩 증가
            nowW -= bridge.poll(); // 다리에 올라와있는 트럭이 한대 씩 다리에서 내려옴 , queue.poll() : 큐의 맨 앞의 값 추출

            if(!truck.isEmpty()){
                if(truck.peek() + nowW <= l){
                    nowW += truck.peek();
                    bridge.add(truck.poll());
                } else{
                    bridge.add(0);
                }
            }
        }
        System.out.println(tome);

    }
}