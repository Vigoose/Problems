class NumMatrix {
    private int[][] T;
    public NumMatrix(int[][] matrix) {
            int row = 0, col = 0;
            if (matrix.length != 0){
                row = matrix.length;
                col = matrix[0].length;
            }
        T = new int[row + 1][col + 1];
        
        for (int i = 1; i <= row; i++){
            for (int j = 1; j <= col; j++){
                T[i][j] = T[i - 1][j] + T[i][j - 1] + matrix[i-1][j-1] - T[i-1][j-1]; 
            }
        }
    }
        public int sumRegion(int row1, int col1, int row2, int col2) {
          row1++;
          col1++;
          row2++;
          col2++;
          return T[row2][col2] - T[row2][col1 - 1] - T[row1 - 1][col2] + T[row1 - 1][col1 -1];
        }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */
