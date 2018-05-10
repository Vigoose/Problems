class CountSmallerNumbeAfter {
    public List<Integer> countSmaller(int[] nums) {
        Integer[] res = new Integer[nums.length];
        List<Integer> list = new ArrayList<>();
        for (int i = nums.length - 1; i >= 0; i--){
            int index = findIndex(list, nums[i]);
            res[i] = index;
            list.add(index, nums[i]);
        }
        return Arrays.asList(res);
    }
    
    private int findIndex(List<Integer> list, int num){
        if (list.size() == 0) return 0;
        int start = 0, end = list.size() - 1;
        if ( list.get(end) <  num) return end + 1;
        if (list.get(start) >= num) return start;
        
        while (start + 1 < end){
            int mid = (end - start) / 2 + start;
            if (list.get(mid) < num){
                start = mid + 1;
            }else{
                end = mid;
            }
        }
        if (list.get(start) >= num) return start;
        return end;
        
    }
}
