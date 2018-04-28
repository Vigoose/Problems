class HouseRobber {
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int prevNo = 0;
        int prevYes = 0;
        for (int num : nums){
            int temp = prevNo;
            prevNo = Math.max(prevYes, prevNo);
            prevYes = temp + num; 
        }
        return Math.max(prevYes, prevNo);
        
    }
}
