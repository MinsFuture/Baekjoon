import java.math.BigInteger;

class Solution {
    public int solution(int balls, int share) {
        BigInteger a = BigInteger.ONE;
        BigInteger b = BigInteger.ONE;

        for (int i = 0; i < share; i++) {
            a = a.multiply(BigInteger.valueOf(balls - i));
        }

        for (int i = 1; i <= share; i++) {
            b = b.multiply(BigInteger.valueOf(i));
        }

        return a.divide(b).intValue();
    }
}
