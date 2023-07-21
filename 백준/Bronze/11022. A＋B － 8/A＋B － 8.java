import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int repeatNum = Integer.parseInt(br.readLine());
        int a, b;
        StringTokenizer st;

        for (int i = 0; i < repeatNum; i++) {
            st = new StringTokenizer(br.readLine());
            bw.write("Case #" + (i+1) + ": ");
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            bw.write( a + " + " + b + " "
                    + "= " + (a + b) + "\n");
        }

        bw.flush();
        bw.close();
    }
}
