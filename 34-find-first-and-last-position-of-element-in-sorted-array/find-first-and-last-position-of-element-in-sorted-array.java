class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = searchF(nums, target);
        int last  = searchL(nums, target);
        return new int[]{first, last};
}
    public int searchF(int[] nums, int target){
        int start = 0, end = nums.length-1,first=-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(nums[mid]==target){
                first = mid;
                end = mid-1;
            }else if(nums[mid]>=target){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return first;
    }
        public int searchL(int[] nums, int target){
        int start = 0, end = nums.length-1,last=-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(nums[mid]==target){
                last = mid;
                start = mid+1;
            }else if(nums[mid]>=target){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return last;
    }
}