package Searching;

public class MaxWealth {
    public static int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;

        for (int[] account : accounts) {
            int wealth = 0;
            for (int person : account) {
                wealth += person;
            }
            if (wealth > ans) {
                ans = wealth;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int accounts[][] = {{1,2,3}, {3,2,1}};
        int ans = maximumWealth(accounts);
        System.out.println(ans);
    }
}
