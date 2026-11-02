class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;

        for (int[] account: accounts) {
            int sumWealth = 0;
            for (int wealth: account) {
                sumWealth += wealth;
            }
            maxWealth = Math.max(maxWealth, sumWealth);
        }

        return maxWealth;
    }
}