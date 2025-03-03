class Solution {
    public int findMin(int[] arr) {
        int start = 0, end = arr.length-1;
        while(start < end){
            int mid = start + (end - start)/2;
            if (arr[end] < arr[mid]){
                start = mid+1;
            }else{
                end = mid;
            }
        }
        return arr[start];
    }
}