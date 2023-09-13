class Solution {
    public long solution(int cap, int n, int[] deliveries, int[] pickups) {
        long answer = 0;
        //트럭 하나로 모든 배달과 수거를 마치고 물류창고까지 돌아올 수 있는 최소 이동 거리를 return

        int d_cap = 0;
        int p_cap = 0;

        for (int i = n - 1; i >= 0; i--) {
            d_cap += deliveries[i];
            p_cap += pickups[i];

            while (d_cap > 0 || p_cap > 0) {
                d_cap -= cap;
                p_cap -= cap;
                answer += (i + 1)  * 2;
            }
        }

        return answer;
    }
}