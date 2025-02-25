class Solution {
    public int peakE(int[] nums) {
        int start = 0, end = nums.length()-1;
        while(start < end){
            int mid = start + (end - start)/2;
            if (end > mid && nums[mid] > nums[mid+1]){return mid;}
            if (start < mid && nums[mid] < nums[mid-1]){return mid-1;}
            nums[start] <= nums[mid] ? start = mid+1 : end = mid-1;
        }
        return -1;
    }
    public int peakC(int[] nums){
        int pivot = peakE(nums);
        return (pivot+1) % nums.length;
    }
}