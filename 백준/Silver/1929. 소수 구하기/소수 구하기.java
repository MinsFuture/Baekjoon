import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        findPrime(n, m);

    }

    static void findPrime(int n, int m) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Boolean> primeList = new ArrayList<>();
        primeList.add(false);
        primeList.add(false);
        for (int i = 2; i <= m; i++) {
            primeList.add(true);
        }

        for (int i = 2; i <= Math.sqrt(m); i++) {
            for (int j = i * i; j <= m; j += i) {
                if (primeList.get(j) == true) {
                    primeList.set(j, false);
                }
            }
        }

        for (int i = n; i <= m; i++) {
            if (primeList.get(i)) {
                bw.write(i + "");
                bw.newLine();
            }
        }

        bw.flush();
        bw.close();
    }
}
