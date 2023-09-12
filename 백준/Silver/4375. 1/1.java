import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str;
        while ((str = br.readLine()) != null) {
            int n = Integer.parseInt(str);
            int num = 0;
            int cnt = 1;

            while (true) {
                num = num * 10 + 1;
                num %= n;
                if (num == 0) {
                    bw.write(cnt + "\n");
                    bw.flush();
                    break;
                }
                cnt++;
            }
        }
        bw.close();
    }
}