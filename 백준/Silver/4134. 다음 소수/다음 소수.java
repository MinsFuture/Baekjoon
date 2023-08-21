import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        long num = Long.parseLong(br.readLine());
        for (int i = 0; i < num; i++) {
            long n = Long.parseLong(br.readLine());
            bw.write(nextPrime(n) + "");
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }

    static long nextPrime(long n) {
        if (n == 0 || n == 1) {
            return 2;
        }
        while (!isPrime(n++)) {
        }
        return n-1;
    }

    static boolean isPrime(long n) {
        for (long i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; // 소수가 아님
            }
        }
        return true;
    }

}
