class 4SumII {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        if (A == null || A.length == 0) {
            return 0;
        }
        HashMap<Integer, Integer> mapAB = new HashMap<>();
        int n = A.length;
        int res = 0;
        for (int a : A){
            for (int b : B){
                mapAB.put(a+b, mapAB.getOrDefault(a+b, 0) + 1);
            }
        }
        for (int c : C){
            for(int d : D){
                int part2 = - (c + d);
                res += mapAB.getOrDefault(part2, 0);  
            }
        }
        return res;
        
    }
}
