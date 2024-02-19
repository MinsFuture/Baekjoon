import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str = null;
        
        for (int i = 0; i < n; i++) {
            str = br.readLine();
            int result = 0;
            int score = 1;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == 'O') {
                    result += score++;
                } else {
                    score = 1;
                }
            }
            System.out.println(result);
        }

    }
}
