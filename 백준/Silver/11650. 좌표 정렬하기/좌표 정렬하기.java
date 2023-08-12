import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Point[] points = new Point[n];

        for (int i = 0; i < n; i++) {
            points[i] = new Point();
            points[i].x = scanner.nextInt();
            points[i].y = scanner.nextInt();
        }

        Arrays.sort(points, new PointComparator());
        for (Point point : points) {
            System.out.println(point.x + " " + point.y);
        }
    }

    static class Point {
        int x;
        int y;
    }

    static class PointComparator implements Comparator<Point> {
        @Override
        public int compare(Point o1, Point o2) {
            if (o1.x == o2.x) {
                return o1.y - o2.y;
            } else {
                return o1.x - o2.x;
            }
        }
    }
}

