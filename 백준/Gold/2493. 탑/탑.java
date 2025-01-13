import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] ary = new int[n+1];
        Stack<Top> stack = new Stack<>();
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 1; i <= n; i++) {
            ary[i] = Integer.parseInt(st.nextToken());
        }

        stack.add(new Top(ary[1], 1));
        bw.write("0 ");

        for(int i = 2; i<=n; i++){
            // 만약 stack에 있는 peek이 지금 인덱스 보다 높다면
            if(stack.peek().num > ary[i]){
                bw.write(stack.peek().index + " ");
                stack.add(new Top(ary[i], i));
            }
            // 만약 stack에 있는 peek이 지금 인덱스 보다 낮다면
            else{
                while(true){
                    // stack의 peek이 높을 때 까지 진행
                    stack.pop();

                    // 중간에 스택이 비면 0을 출력
                    if(stack.isEmpty()){
                        bw.write("0 ");
                        stack.add(new Top(ary[i], i));
                        break;
                    }

                    if(stack.peek().num > ary[i]){
                        bw.write(stack.peek().index + " ");
                        stack.add(new Top(ary[i], i));
                        break;
                    }
                }
            }
        }
        bw.flush();
        bw.close();
    }

    static class Top{
        int num;
        int index;

        public Top(int num, int index) {
            this.num = num;
            this.index = index;
        }
    }
}