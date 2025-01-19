import java.util.*;

public class Main {
    static int n;
    static int k;
    static int zeroNum;
    static LinkedList<Node> list;
    static int answer;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        zeroNum = 0;
        answer = 0;
        list = new LinkedList<>();

        for (int i = 0; i < 2 * n; i++) {
            list.add(new Node(sc.nextInt(), false));
        }

        while (k > 0){
            moveBelt();
            moveRobot();
        }

        System.out.println(answer);
    }

    static void moveBelt(){
        answer++;
        // 한 칸 회전
        list.add(0, list.removeLast());
        if(list.get(n-1).robot){
            list.get(n-1).robot = false;
        }
    }

    static public void moveRobot() {
        // 로봇 밀기
            for (int i = n - 2; i >= 0; i--) {
                if (list.get(i).robot) {
                    if (!list.get(i + 1).robot && list.get(i + 1).cnt > 0) {
                        list.get(i).robot = false;
                        list.get(i + 1).robot = true;
                        list.get(i+1).cnt--;

                        if(list.get(i+1).cnt <= 0) k--;

                        // 마지막 위치에 도달하면
                        if (i + 1 == n - 1) {
                            list.get(i + 1).robot = false;
                        }
                    }
                }
            }

            // 올리는 위치에 로봇 올리기
            if (!list.get(0).robot && list.get(0).cnt > 0) {
                list.get(0).robot = true;
                list.get(0).cnt--;
                if(list.get(0).cnt <= 0) k--;
            }
    }


    static class Node {
        int cnt;
        boolean robot;

        public Node(int cnt, boolean robot) {
            this.cnt = cnt;
            this.robot = robot;
        }
    }
}

