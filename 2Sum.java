class 2Sum {
    public int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length == 0){
            return nums;
        }
        int[] res = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            if (map.containsKey(target - nums[i])){
                res[0] = i;
                res[1] = map.get(target - nums[i]);
            }
            map.put(nums[i], i);
        }
        return res;
    }
}