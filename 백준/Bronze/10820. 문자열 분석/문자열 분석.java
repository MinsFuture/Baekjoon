import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input;

        while ((input = br.readLine()) != null && !input.isEmpty()) {
            int small = 0;
            int big = 0;
            int num = 0;
            int space = 0;

            for (int i = 0; i < input.length(); i++) {
                if (97 <= (int)input.charAt(i) && (int)input.charAt(i) <= 122) {
                    small++;
                } else if (65 <= (int)input.charAt(i) && (int)input.charAt(i) <= 90) {
                    big++;
                } else if ((int)input.charAt(i) == 32) {
                    space++;
                } else {
                    num++;
                }
            }

            bw.write(small + " " + big + " " + num + " " + space + "\n");
            bw.flush();
        }

        bw.close();
    }
}
