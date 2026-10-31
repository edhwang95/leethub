import java.util.List;
import java.util.ArrayList;

class Solution {
    public static List<Integer> extractDigit(int n) {
        int now = n;
        List<Integer> digits = new ArrayList<>();

        while (now > 0) {
            digits.add(now%10);
            now = now/10;
        }

        return digits;

    }

    public static int sumDigit(List<Integer> digits) {
        int result = 0;
        for (int digit: digits) {
            result += digit;
        }
        return result;
    }

    public static int productDigit(List<Integer> digits){
        int result = 1;
        for (int digit: digits) {
            result *= digit;
        }
        return result;
    }

    public int subtractProductAndSum(int n) {
        List<Integer> digits = extractDigit(n);
        return productDigit(digits) - sumDigit(digits);
    }
}