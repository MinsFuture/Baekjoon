import java.io.*;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        LinkedList<Character> list = new LinkedList<>();
        ListIterator<Character> iter = list.listIterator();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        char[] ch = br.readLine().toCharArray();
        int n = Integer.parseInt(br.readLine());

        for (char c : ch) {
            iter.add(c);
        }

        while (iter.hasNext()) {
            iter.next();
        }


        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            char run = st.nextToken().charAt(0);

            switch (run) {
                case 'L':
                    if (iter.hasPrevious()) {
                        iter.previous();
                    }
                    break;
                case 'D':
                    if (iter.hasNext()) {
                        iter.next();
                    }
                    break;
                case 'B':
                    if (iter.hasPrevious()) {
                        iter.previous();
                        iter.remove();
                    }
                    break;
                case 'P':
                    char input = st.nextToken().charAt(0);
                    iter.add(input);
                    break;
            }
        }

        for (Character character : list) {
            bw.write(character + "");
        }

        bw.flush();
        bw.close();
    }
}
