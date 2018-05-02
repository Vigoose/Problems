class HappyNumber {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        int squearSum, remain;
        while (set.add(n)){
            squearSum = 0;
            while (n > 0){
                remain = n % 10;
                squearSum += remain * remain;
                n /= 10;
            }
            if (squearSum == 1){
                return true;
            }else{
                n = squearSum; 
            }
        }
        return false;
    }
}
