class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        if (candidates == null || candidates.length == 0){
            return res;
        }
        helper(candidates, res, new ArrayList<>(), target, 0);
        return res;
    }
    private static void helper(int[] candidates, List<List<Integer>> res, List<Integer> lists, int target, int index){
        if (target < 0){
            return;
        }
        if (target == 0){
            res.add(new ArrayList(lists));
            return;
        }
        
        for (int i = index; i < candidates.length; i++){
            lists.add(candidates[i]);
            helper(candidates, res, lists, target - candidates[i], i);
            lists.remove(lists.size() - 1);
        }
        
    }
}
