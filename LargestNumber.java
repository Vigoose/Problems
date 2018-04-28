class LargestNumber {
    public String largestNumber(int[] nums) {
        if (nums == null || nums.length == 0) return "";
        
        String[] str = new String[nums.length];
        
        for (int i = 0; i < nums.length; i++){
            str[i] = String.valueOf(nums[i]);
        }
        
        Arrays.sort(str, new Comparator<String>(){
           @Override
            public int compare(String str1, String str2){
                String s1 = str1 + str2;
                String s2 = str2 + str1;
                return s2.compareTo(s1);
            }
        });
        
        if (str[0].charAt(0) == '0') return "0";
        StringBuilder sb = new StringBuilder();
        for (String s : str){
            sb.append(s);
        }
        return sb.toString();
        
    }
}
