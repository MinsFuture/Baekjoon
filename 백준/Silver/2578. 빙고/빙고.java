import java.util.Scanner;
import java.util.logging.Filter;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int answer = 0;
        int[][] ary = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                ary[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                findAndMark(ary, sc.nextInt());
                int num = checkBingo(ary);
                if (num >= 3) {
                    answer = (i * 5) + j + 1;
                    System.out.println(answer);
                    return;
                }
            }
        }
    }

    public static void findAndMark(int[][] ary, int num) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (ary[i][j] == num) {
                    ary[i][j] = 0;
                }
            }
        }
    }

    public static int checkBingo(int[][] ary) {
        int bingoNum = 0;
        boolean flag = true;
        // 가로
        for (int i = 0; i < 5; i++) {
            flag = true;
            for (int j = 0; j < 5; j++) {
                if (ary[i][j] != 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                bingoNum++;
            }
        }
        // 세로
        for (int i = 0; i < 5; i++) {
            flag = true;
            for (int j = 0; j < 5; j++) {
                if (ary[j][i] != 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                bingoNum++;
            }
        }

        // 대각선 \
        flag = true;
        for (int i = 0; i < 5; i++) {
            if (ary[i][i] != 0) {
                flag = false;
                break;
            }
        }
        if (flag) {
            bingoNum++;
        }
        // 대각선 /
        flag = true;
        for (int i = 0; i < 5; i++) {
            if (ary[i][4 - i] != 0) {
                flag = false;
                break;
            }
        }
        if (flag) {
            bingoNum++;
        }

        return bingoNum;
    }

}