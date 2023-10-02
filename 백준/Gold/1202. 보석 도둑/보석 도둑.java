import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Carrot[] carrots = new Carrot[n];
        int[] bag = new int[k];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int weight = Integer.parseInt(st.nextToken());
            int price = Integer.parseInt(st.nextToken());
            carrots[i] = new Carrot(weight, price);
        }

        Arrays.sort(carrots, new Comparator<Carrot>() {
            @Override
            public int compare(Carrot o1, Carrot o2) {
                if (o1.getWeight() == o2.getWeight()) {
                    return o2.getPrice() - o1.getPrice();
                } else {
                    return o1.getWeight() - o2.getWeight();
                }
            }
        });

        for (int i = 0; i < k; i++) {
            bag[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(bag);
        long sum = 0;

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());

        for (int i = 0, j = 0; i < k; i++) {
            while (j < n && carrots[j].getWeight() <= bag[i]) {
                priorityQueue.add(carrots[j++].getPrice());
            }
            if (!priorityQueue.isEmpty()) {
                sum += priorityQueue.poll();
            }
        }

        System.out.println(sum);
    }

    static class Carrot {
        private int weight;
        private int price;

        public Carrot(int weight, int price) {
            this.weight = weight;
            this.price = price;
        }

        public int getWeight() {
            return weight;
        }

        public int getPrice() {
            return price;
        }
    }
}
