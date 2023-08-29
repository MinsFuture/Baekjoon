import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> answerList = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(today, ".");
        int year = Integer.parseInt(st.nextToken());
        int month = Integer.parseInt(st.nextToken());
        int date = Integer.parseInt(st.nextToken());
        int todaySum = year * (28 * 12) + month * 28 + date;

        HashMap<String, Integer> termsMap = new HashMap<>();
        for (int i = 0; i < terms.length; i++) {
            st = new StringTokenizer(terms[i]);
            String type = st.nextToken();
            int period = Integer.parseInt(st.nextToken());
            termsMap.put(type, period);
        }

        for (int i = 0; i < privacies.length; i++) {
            st = new StringTokenizer(privacies[i], ". ");
            year = Integer.parseInt(st.nextToken());
            month = Integer.parseInt(st.nextToken());
            date = Integer.parseInt(st.nextToken());
            int privaciesSum = year * (28 * 12) + month * 28 + date;

            String type = st.nextToken();
            int criteria = termsMap.get(type) * 28;

            if (todaySum - privaciesSum >= criteria) {
                answerList.add(i+1);
            }
        }

        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }

        return answer;
    }
}