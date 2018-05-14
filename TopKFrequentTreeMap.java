class TopKFrequentTreeMap {
    public List<Integer> topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        TreeMap<Integer, List<Integer>> treeMap = new TreeMap<>();
        for (int num : map.keySet()){
            int freq = map.get(num);
            if (treeMap.containsKey(freq)){
                treeMap.get(freq).add(num);
            }else{
                treeMap.put(freq, new LinkedList<>());
                treeMap.get(freq).add(num);
            }
        }
        
        List<Integer> res = new ArrayList<>();
         
        while (res.size() < k){
            Map.Entry<Integer, List<Integer>> entry = treeMap.pollLastEntry();
            res.addAll(entry.getValue());
        }
        return res;
    }
}
