import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        Stack<Integer> stack = new Stack<>();
        List<Character> operations = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int cur = 1;
        Boolean run = true;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            while (cur <= num) {
                stack.push(cur++);
                operations.add('+');
            }

            if (!stack.isEmpty()) {
                if (stack.peek().equals(num)) {
                    stack.pop();
                    operations.add('-');
                } else{
                    run = false;
                    break;
                }
            }
        }

        if (run) {
            for (int i = 0; i < operations.size(); i++) {
                bw.write(operations.get(i) + "\n");
            }
        } else {
            bw.write("NO");
        }


        bw.flush();
        bw.close();
    }
}
