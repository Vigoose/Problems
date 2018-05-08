class SlidingWindowMax {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0) return new int[0];
        int[] res = new int[nums.length + 1 - k];
        Deque<Integer> dq = new LinkedList<>();
        for (int i = 0; i < nums.length; i++){
            if (!dq.isEmpty() && dq.peekFirst() == i - k){
                dq.poll();
            }
            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[i]){
                dq.removeLast();
            }
            dq.offerLast(i);
            if ((i + 1) >= k){
                res[i + 1 - k] = nums[dq.peek()];
            }
        }
        return res;
    }
}
