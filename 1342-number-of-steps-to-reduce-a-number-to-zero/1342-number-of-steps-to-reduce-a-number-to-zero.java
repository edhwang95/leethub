class Solution {

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public int numberOfSteps(int num) {
        int result = 0;
        int now = num;

        while (now>0) {
            if (isEven(now)) {
                now=now/2;
            } else {
                now--;
            }
            result += 1;
        }
        return result;
    }
}