class LongestConsencutiveSeq {
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length ==0){
            return 0;
        }
        int res = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums){
            set.add(num);
        }
        for (int i = 0; i < nums.length; i++){
            int down = nums[i] - 1;
            while (set.contains(down)){
                set.remove(down);
                down--;
            }
            int upper = nums[i] + 1;
            while (set.contains(upper)){
                set.remove(upper);
                upper++;
            }
            res = Math.max(res, upper - down - 1);
        }
        return res;  
    }
}
