import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Lecture[] lectures = new Lecture[n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int p = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            lectures[i] = new Lecture(p, d);
        }

        Arrays.sort(lectures, new Comparator<Lecture>() {
            @Override
            public int compare(Lecture o1, Lecture o2) {
                if (o1.p > o2.p) {
                    return -1;
                } else if (o1.p == o2.p) {
                    return o2.d - o1.d;
                } else {
                    return 1;
                }
            }
        });

        int sum = 0;
        boolean[] visit = new boolean[10001];

        for (int i = 0; i < n; i++) {
            for (int j = lectures[i].getD(); j >= 1; j--) {
                if (!visit[j]) {
                    visit[j] = true;
                    sum += lectures[i].getP();
                    break;
                }
            }

        }

        System.out.println(sum);
    }

    static class Lecture {
        int p; // pay
        int d; // day

        public Lecture(int p, int d) {
            this.p = p;
            this.d = d;
        }

        public int getP() {
            return p;
        }

        public int getD() {
            return d;
        }
    }
}

