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

        Arrays.sort(points, (p1, p2) -> {
            if (p1.x == p2.x) {
                return p1.y - p2.y;
            } else {
                return p1.x - p2.x;
            }
        });

        for (Point point : points) {
            System.out.println(point.x + " " + point.y);
        }
    }

    static class Point {
        int x;
        int y;
    }


}

