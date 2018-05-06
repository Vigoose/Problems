class KthLargestElementQuickSelection {
    public int findKthLargest(int[] nums, int k) {
        if (nums == null || nums.length == 0) return 0;
        int left = 0;
        int right = nums.length - 1;
        
        while (true){
            int pos = partition(nums, left, right);
            if (pos + 1 == k){
                return nums[pos];
            }else if (pos + 1 < k){
                left = pos + 1;
            }else{
                right = pos - 1;
            }
        }
    }
    
    private int partition(int[] nums, int left, int right){
        int pivot = nums[left];
        int l = left + 1;
        int r = right;
        while (l <= r){
            if (nums[l] < pivot && nums[r] > pivot){
                swap(nums, l++, r--);
            }
            if (nums[l] >= pivot) l++;
            if (nums[r] <= pivot) r--;
        }
        swap(nums,left, r);
        return r;
    }
    
    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
