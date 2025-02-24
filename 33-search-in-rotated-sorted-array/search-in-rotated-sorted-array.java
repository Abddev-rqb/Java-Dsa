class Solution {
    public int search(int[] nums, int target) {
        int peak = peakE(nums);
        if (peak == -1){
            return binS(nums, target, 0, nums.length-1);
        }
        if(nums[peak]== target){
            return peak;
        }
        if (target >= nums[0]){
            return binS(nums, target, 0, peak-1);
        }
        return binS(nums, target, peak+1, nums.length-1);
    }

    public int binS(int[] nums, int target, int start, int end){
        while(start <= end){
            int mid = start + (end - start)/2;
            if (nums[mid] == target){
                return mid;
            }
            if (nums[mid] > target){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return -1;
    }

    
    public int peakE(int[] nums){
        int start = 0, end = nums.length-1;
        while(start < end) {
            int mid = start + (end - start)/2;
            if (mid < end && nums[mid] > nums[mid+1]){
                return mid;
            }
            if (start < mid && nums[mid-1] > nums[mid]){
                return mid-1;
            }
            if (nums[start] <= nums[mid]){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
}