import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < T; i++) {
            String func = sc.nextLine();
            int length = sc.nextInt();
            sc.nextLine();
            String str = sc.nextLine();

            str = str.replace("[", "");
            str = str.replace("]", "");
            str = str.replace(",", " ");

            String[] numStr = str.split(" ");
            Deque<Integer> q = new LinkedList<>();

            for (int j = 0; j < length; j++) {
                q.add(Integer.parseInt(numStr[j]));
            }

            boolean left = true;
            int error = 0;

            for (int k = 0; k < func.length(); k++) {
                if (func.charAt(k) == 'R') {
                    left = !left;
                } else {
                    if(q.isEmpty()){
                        error = 1;
                        break;
                    }
                    if (left) {
                         q.pollFirst();
                    } else {
                        q.pollLast();
                    }
                }
            }
            if (error == 1) {
                System.out.println("error");
            } else {
                int size = q.size();
                System.out.print("[");

                if (left) {
                    for (int index = 0; index < size; index++) {
                        if (index == size - 1) {
                            System.out.print(q.pollFirst());
                            break;
                        }
                        System.out.print(q.pollFirst() + ",");
                    }
                } else {
                    for (int index = 0; index < size; index++) {
                        if (index == size - 1) {
                            System.out.print(q.pollLast());
                            break;
                        }
                        System.out.print(q.pollLast() + ",");
                    }
                }

                System.out.println("]");
            }
        }
    }

}