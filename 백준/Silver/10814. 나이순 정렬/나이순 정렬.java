import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Member> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            Member member = new Member();
            member.age = scanner.nextInt();
            member.name = scanner.next();
            list.add(member);
        }

        Collections.sort(list, new Comparator<Member>() {
            @Override
            public int compare(Member o1, Member o2) {
                return o1.age - o2.age;
            }
        });

        for (int i = 0; i < list.size(); i++) {
            Member member = list.get(i);
            System.out.println(member.age + " " + member.name);
        }

    }

    static class Member {
        int age;
        String name;
    }
}
