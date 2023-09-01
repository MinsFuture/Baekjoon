import java.io.*;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        Stack<Integer> stack = new Stack<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            switch (num) {
                case 1:
                    int x = Integer.parseInt(st.nextToken());
                    stack.push(x);
                    break;
                case 2:
                    if (!stack.empty()) {
                        // System.out.println(stack.pop());
                        bw.write(stack.pop() + "");
                        bw.newLine();
                    } else {
                        bw.write(-1 + "");
                        bw.newLine();
                    }
                    break;

                case 3:
                    //  System.out.println(stack.size());
                    bw.write(stack.size() + "");
                    bw.newLine();
                    break;

                case 4:
                    if (stack.empty()) {
                        bw.write(1 + "");
                        bw.newLine();
                    } else {
                        bw.write(0 + "");
                        bw.newLine();
                    }
                    break;

                case 5:
                    if (!stack.empty()) {
                        bw.write(stack.peek() + "");
                        bw.newLine();
                    } else {
                        bw.write(-1 + "");
                        bw.newLine();
                    }
                default:
            }
        }
        bw.flush();
        bw.close();
    }
}
