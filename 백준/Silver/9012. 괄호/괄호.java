import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        Stack<Character> stack = new Stack<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            char[] ch = str.toCharArray();
            boolean run = true;
            for (int j = 0; j < str.length(); j++) {
                if (ch[j] == '(') {
                    stack.push('(');
                } else {
                    if (!stack.empty()) {
                        stack.pop();
                    } else {
                        run = false;
                        break;
                    }
                }
            }

            if (stack.size() > 0) {
                run = false;
            }

            if (run == true) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

            stack.clear();
        }
    }
}
