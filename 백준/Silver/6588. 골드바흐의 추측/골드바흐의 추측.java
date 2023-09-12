import java.io.*;

public class Main {
    private static final int max = 1000001;
    private static boolean[] primes = new boolean[max];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 2; i < max; i++) {
            primes[i] = true;
        }

        for (int i = 2; i < Math.sqrt(max); i++) {
            for (int j = i * i; j < max; j += i) {
                if (primes[j] == true) {
                    primes[j] = false;
                }
            }
        }

        String str = br.readLine();
        int n;
        while ((n = Integer.parseInt(str)) != 0) {
            boolean found = false;
            for (int i = 3; i <= n/2; i += 2) {
                if (primes[i] && primes[n - i]) {
                    bw.write(n + " = " + i + " + " + (n - i) + "\n");
                    bw.flush();
                    found = true;
                    break;
                }
            }
            if (!found) {
                bw.write("Goldbach's conjecture is wrong.\n");
            }
            str = br.readLine();
        }

        bw.close();
    }
}
