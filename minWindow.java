public class minWindow {
    public static String minWindow(String s, String t) {
        if (t.length() > s.length()) return "";
        int[] tCurr = new int[256];
        int start = 0, total = t.length(), min = Integer.MAX_VALUE;
        for (char c : t.toCharArray()){
            tCurr[c]++;
        }
        for (int i = 0, j = 0; i < s.length(); i++){
            if (tCurr[s.charAt(i)]-- > 0) total--;

            while (total == 0){
              if (i - j + 1 < min){
                  min = i - j + 1;
                  start = j;
              }
              if (++tCurr[s.charAt(j++)] > 0) total++;
            }
        }
        return (min == Integer.MAX_VALUE)? "" : s.substring(start, start + min);
    }

    public static void main(String[] args){
        String s1 = "ADOBECODEBANC";
        String s2 = "ABC";

        System.out.println(minWindow(s1, s2));

    }

}
