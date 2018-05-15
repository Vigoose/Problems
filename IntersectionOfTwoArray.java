class Solution {
    public int[] intersect1(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> ret = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++){
            if (map.containsKey(nums1[i])){
                map.put(nums1[i], map.get(nums1[i]) + 1);
            }else{
            map.put(nums1[i], 1);}
        }
        for  (int i = 0; i < nums2.length; i++){
            if (map.containsKey(nums2[i])){
                if (map.get(nums2[i]) > 0)
                ret.add(nums2[i]);
                map.put(nums2[i], map.get(nums2[i]) - 1);
            }
        }
        
        int[] res = new int[ret.size()];
        int k = 0;
        for (Integer num: ret){
            res[k++] = num;
        }
        return res;
    }
    
     public int[] intersect1(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> ret = new ArrayList<>();
        int i = 0, j = 0;
        while (i < nums1.length && j < nums2.length){
            if (nums1[i] < nums2[j]){
                i++;
            }else if (nums1[i] > nums2[j]){
                j++;
            }else {
                ret.add(nums1[i]);
                i++;
                j++;
            }
        }
        int[] res = new int[ret.size()];
        int k = 0;
        for (Integer num: ret){
            res[k++] = num;
        }
        return res;
    }
}
