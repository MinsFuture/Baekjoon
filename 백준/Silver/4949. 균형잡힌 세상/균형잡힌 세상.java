import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        Stack<Character> stack = new Stack<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        while (!str.equals(".")) {
            char[] ch = str.toCharArray();
            boolean run = true;
            for (int i = 0; i < str.length(); i++) {
                if (ch[i] == '(' || ch[i] == '[') {
                    stack.push(ch[i]);
                } else if (ch[i] == ')') {
                    if (!stack.empty()) {
                        char temp = stack.pop();
                        if (temp == '(') {
                            continue;
                        } else {
                            run = false;
                            break;
                        }
                    } else {
                        run = false;
                        break;
                    }
                } else if (ch[i] == ']') {
                    if (!stack.empty()) {
                        char temp = stack.pop();
                        if (temp == '[') {
                            continue;
                        } else {
                            run = false;
                            break;
                        }
                    } else {
                        run = false;
                        break;
                    }
                }
            }

            if (stack.size() > 0) {
                run = false;
            }

            if (run) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
            stack.clear();
            str = br.readLine();
        }
    }
}
