import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] str = new String[n];

        for(int i = 0; i<n; i++){
            str[i] = sc.nextLine();
        }

        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i<26; i++){
            map.put((char)('A' + i), 0);
        }

        for(int i = 0; i<n; i++){
            for(int j = str[i].length() - 1; j>=0; j--){
                char ch = str[i].charAt(j);
                map.put(ch, map.get(ch) + (int)Math.pow(10, str[i].length() - 1 - j));
            }
        }

        List<Character> list = new ArrayList<>(map.keySet());
        list.sort(new Comparator<Character>(){
            @Override
            public int compare(Character a, Character b){
                return map.get(b).compareTo(map.get(a));
            }
        });

        int num = 9;
        for(int i = 0; i<10; i++){
            map.put(list.get(i), num--);
        }

        int answer = 0;

        for(int i = 0; i<n; i++){
            for(int j = 0; j<str[i].length(); j++){
                StringBuilder sb = new StringBuilder();
                sb.append(map.get(str[i].charAt(j)) * (int)Math.pow(10, str[i].length() - 1 - j));

                answer += Integer.parseInt(sb.toString());
            }
        }

        System.out.print(answer);
    }


}