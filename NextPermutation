class Solution {
    public void nextPermutation(int[] nums) {
        if (nums == null || nums.length == 0){
            return;
        }
        int lastNum = -1;
        for (int i = nums.length - 2; i >= 0; i--){
            if (nums[i] < nums[i + 1]){
                lastNum = i;
                break;
            }
        }
        if (lastNum == -1){
            Arrays.sort(nums);
            return;
        }
        int larIndex = lastNum + 1;
        while (larIndex < nums.length && nums[lastNum] < nums[larIndex]){
            larIndex++;
        }
        int temp = nums[lastNum];
        nums[lastNum] = nums[larIndex - 1];
        nums[larIndex - 1] = temp;
        Arrays.sort(nums, lastNum + 1, nums.length);
    }
}
