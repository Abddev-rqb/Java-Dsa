class Solution {
    public int[] twoSum(int[] arr, int target) {
        int res[] = new int[2];
        int start = 0, end = arr.length-1;
        while(start < end){
            int sum = arr[start]+arr[end];
            if(sum == target){
                res[0] = start+1;
                res[1] = end+1;
                break;
            }else if (sum > target){
                end--;
            }else{
                start++;
            }
        }
        return res;
    }
}