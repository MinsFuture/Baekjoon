import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Line> lists = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Line[] lines = new Line[n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            lines[i] = new Line(start, end);
        }

        Arrays.sort(lines, new Comparator<Line>() {
            @Override
            public int compare(Line l1, Line l2) {
                if (l1.getEnd() > l2.getEnd()) {
                    return 1;
                } else if (l1.getEnd() == l2.getEnd()) {
                    return l1.getStart() - l2.getStart();
                } else {
                    return -1;
                }
            }
        });

        for (Line line : lines) {
            lists.add(line);
        }

        int endTime = 0, cnt = 0;

        for (Line m : lists) {
            if (endTime <= m.getStart()) {
                endTime = m.getEnd();
                cnt++;
            }
        }

        System.out.print(cnt);
    }

    static class Line {
        int start;
        int end;

        public Line(int start, int end) {
            this.start = start;
            this.end = end;
        }

        public int getStart() {
            return start;
        }

        public int getEnd() {
            return end;
        }
    }
}
