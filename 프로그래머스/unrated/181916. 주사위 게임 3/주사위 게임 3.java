class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        int[] nums = new int[4];
        nums[0] = a; nums[1] = b; nums[2] = c; nums[3] = d; // 1 3 4 6

        int[] frequency = new int[7]; // 0번쨰 인덱스는 비워놓음. frequency[1] = 1; frequency[2] = 1 .. frequency[6] = 0;
        for (int i = 0; i < 4; i++) {
            frequency[nums[i]]++;
        }

        int maxFrequency = 1;
        int min = Integer.MAX_VALUE;
        for (int i = 1; i <= 6; i++) {
            if (maxFrequency < frequency[i]) {
                maxFrequency = frequency[i];
            }
        }

        int p = 0, q = 0, r = 0;

        switch (maxFrequency) {
            case 1:
                for (int i = 0; i < 4; i++) {
                    if ((min > nums[i])) {
                        min = nums[i];
                    }
                }
                answer = min;
                break;

            case 2:
                boolean flag = false;
                for (int i = 1; i <= 6; i++) {
                    if (frequency[i] == 1) {
                        flag = true;
                    }
                }

                if (flag == false) { // 2개씩 같은 경우
                    for (int i = 1; i <= 6; i++) {
                        if ((frequency[i] == 2)) {
                            if (p == 0) {
                                p = i;
                            } else {
                                q = i;
                            }
                        }
                    }
                    answer = (p + q) * (int)(Math.abs(p - q));
                    break;
                } else { // 2 1 1 0 식인 경우
                    for (int i = 1; i <= 6; i++) {
                        if (frequency[i] == 1) {
                            if (q == 0) {
                                q = i;
                            } else {
                                r = i;
                            }
                        } else if (frequency[i] == 2) {
                            p = i;
                        }
                    }
                    answer = q * r;
                    break;
                }

            case 3:
                for (int i = 1; i <= 6; i++) {
                    if (frequency[i] == 1) {
                        q = i;
                    }
                    if (frequency[i] == 3) {
                        p = i;
                    }
                }
                answer = (10 * p + q) * (10 * p + q);
                break;

            case 4 :
                for (int i = 1; i <= 6; i++) {
                    if (frequency[i] == 4) {
                        p = i;
                    }
                }
                answer = 1111 * p;
                break;
            default:
        }
        return answer;
    }
}