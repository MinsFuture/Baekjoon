import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Member[] members = new Member[n];
        
        for (int i = 0; i < n; i++) {
            members[i] = new Member();
            members[i].age = scanner.nextInt();
            members[i].name = scanner.next();
        }

        Arrays.sort(members, new Comparator<Member>() {
            @Override
            public int compare(Member o1, Member o2) {
                return o1.age - o2.age;
            }
        });
        
        for (int i = 0; i < n; i++) {
            System.out.println(members[i].age + " " + members[i].name);
        }

    }

    static class Member {
        int age;
        String name;
    }
}
