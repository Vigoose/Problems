class longestIncreasingPath {
    public int longestIncreasingPath1(int[][] matrix) {
        if (matrix == null || matrix.length == 0) return 0;
        int m = matrix.length, n = matrix[0].length;
        int res = 0;
        int[][] cache = new int[m][n];
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                int max = dfs(matrix, Integer.MIN_VALUE, m, n, i, j, cache);
                res = Math.max(res, max);
            }
        }
        return res;
    }
    
    private int dfs (int[][] matrix, int min, int m, int n, int i, int j, int[][] cache){
        if (i >= m || j >= n || i < 0 || j < 0|| matrix[i][j] <= min) return 0;
        if (cache[i][j] != 0) return cache[i][j];
        min = matrix[i][j];
        int a = dfs(matrix, min, m, n, i + 1, j, cache) + 1;
        int b = dfs(matrix, min, m, n, i - 1, j, cache) + 1;
        int c = dfs(matrix, min, m, n, i, j + 1, cache) + 1;
        int d = dfs(matrix, min, m, n, i, j - 1, cache) + 1;
        int max = Math.max(a,Math.max(b,Math.max(c,d)));
        cache[i][j] = max;
        return max;
    }
}
