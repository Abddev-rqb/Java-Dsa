class Solution {
    public int[] fairCandySwap(int[] nums1, int[] nums2) {
        if (nums1.length == 0 || nums2.length == 0) {
            return new int[]{0, 0};
        }
        int sum1=0,sum2=0;
        for (int num1 : nums1){ sum1 += num1;}
        for (int num2 : nums2){ sum2 += num2;}
        
        int diff= (sum1-sum2)/2; 
        Arrays.sort(nums2);     
        for(int x: nums1){
            int target = x-diff;
            if (binS(nums2, target)){
                return new int[]{x, target};
            }
        }
        return new int[]{-1,-1};
    }
    public boolean binS(int[] arr, int target){
        int start=0, end= arr.length-1;
        while(start <= end){
            int mid = start+ (end-start)/2;
            if (arr[mid]==target){
                return true;
            }else if(arr[mid] < target){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return false;
    }
}
