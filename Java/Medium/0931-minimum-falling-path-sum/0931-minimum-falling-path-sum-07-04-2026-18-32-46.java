class Solution {
    int[][] dp;
    boolean[][] vis;

    public int minFallingPathSum(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;

        dp = new int[n][m];
        vis = new boolean[n][m];

        int ans = Integer.MAX_VALUE;

        // Start from every column in the first row
        for (int j = 0; j < m; j++) {
            ans = Math.min(ans, solve(0, j, mat, n, m));
        }

        return ans;
    }

    private int solve(int i, int j, int[][] mat, int n, int m) {

        // Out of bounds
        if (i >= n || j < 0 || j >= m) {
            return Integer.MAX_VALUE;
        }

        // Last row
        if (i == n - 1) {
            return mat[i][j];
        }

        // Memoization
        if (vis[i][j]) {
            return dp[i][j];
        }

        int downLeft = solve(i + 1, j - 1, mat, n, m);
        int down = solve(i + 1, j, mat, n, m);
        int downRight = solve(i + 1, j + 1, mat, n, m);

        int best = Math.min(downLeft, Math.min(down, downRight));

        if (best == Integer.MAX_VALUE) {
            dp[i][j] = Integer.MAX_VALUE;
        } else {
            dp[i][j] = mat[i][j] + best;
        }

        vis[i][j] = true;
        return dp[i][j];
    }
}