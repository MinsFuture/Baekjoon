class Solution {
    public String solution(int[] numLog) {
        StringBuffer stringBuffer = new StringBuffer();

        for (int i = 0; i < numLog.length -1; i++) {
            switch (numLog[i + 1] - numLog[i]) {
                case 1: stringBuffer.append("w"); break;
                case -1: stringBuffer.append("s"); break;
                case 10 : stringBuffer.append("d"); break;
                case -10: stringBuffer.append("a"); break;
                default:
            }
        }

        return stringBuffer.toString();
    }
}