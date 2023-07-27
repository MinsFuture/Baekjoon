import java.util.Scanner;

public class Main {
    static double cnt = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        double grades;
        String subject;

        double sum = 0;
        int n = 20;

        for (int i = 0; i < n; i++) {
            name = scanner.next();
            grades = scanner.nextDouble();
            subject = scanner.next();
            if (!subject.equals("P")) {
                cnt += grades;
            }
            sum += majorPoint(grades, subject);
        }

        System.out.println(sum / cnt);
    }

    public static double majorPoint(double grades, String subject) {
        switch (subject) {
            case "A+":
                return grades * 4.5;
            case "A0":
                return grades * 4.0;
            case "B+":
                return grades * 3.5;
            case "B0":
                return grades * 3.0;
            case "C+":
                return grades * 2.5;
            case "C0":
                return grades * 2.0;
            case "D+":
                return grades * 1.5;
            case "D0":
                return grades * 1.0;
            case "F":
                return 0.0;
            case "P":
                return 0;
            default:
                return 0.0;
        }
    }
}
