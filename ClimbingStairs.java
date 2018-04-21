class ClimbingStairs {
    public int climbStairs(int n) {
        if (n <= 1){
            return 1;
        }
        int oneStep = 1, twoStep = 1, res =0;
        for (int i = 2; i <= n; i++){
            res = oneStep + twoStep;
            twoStep = oneStep;
            oneStep = res;
        }
        return res;
    }
}
