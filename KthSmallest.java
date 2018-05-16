class KthSmallest {
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int left = matrix[0][0];
        int right = matrix[n - 1][n - 1];
        while (left + 1 < right){
            int mid = (right - left) / 2 + left;
            int num = count(matrix, mid);
            if (num < k){
                left = mid;
            }else{
                right = mid;
            }
        }
        if (count(matrix, right) <= k - 1) return right;
        return left;
    }
    /**
    matrix = [
   [ 1,  5,  9],
   [10, 12, 13],
   [12, 13, 21]
],
k = 11
    */
    private int count(int[][] matrix, int target){
        int n = matrix.length;
        int res = 0;
        int i = n - 1, j = 0;
        while (i >= 0 && j < n){
            if (matrix[i][j] < target){
                res += i + 1;
                j++;
            }else{
                i--;
            }
        }
        return res;
    }
    
}
