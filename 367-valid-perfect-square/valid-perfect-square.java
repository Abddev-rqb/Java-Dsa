class Solution {
    public boolean isPerfectSquare(int num) {
        if (num == 1){
            return true;
        }
        int start = 0, end = num/2;
        while(start <= end){
            int mid = start + (end-start)/2;
            long sq = (long)mid*mid;
            if (sq == num){
                return true;
            }else if (sq > num){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return false;
    }
}