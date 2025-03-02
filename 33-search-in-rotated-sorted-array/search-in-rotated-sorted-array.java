class Solution {
    public int search(int[] arr, int target) {
       int peak  = pivot(arr);
       if (peak == -1){ return binS(arr, 0, arr.length-1, target);}
       if (arr[peak] == target){return peak;}
       if (arr[0] <= target){return binS(arr, 0, peak-1, target);}
       return binS(arr, peak+1, arr.length-1, target);
    }
    public int binS(int[] arr, int start, int end, int target){
        while (start <= end){
            int mid = start + (end - start)/2;
            if (arr[mid] == target){
                return mid;
            }else if (arr[mid] < target){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
    public int pivot(int[] arr){
        int start =0, end = arr.length-1;
        while (start < end){
            int mid = start + (end - start)/2;
            if (end > mid && arr[mid] > arr[mid+1]){return mid;}
            if (start < mid && arr[mid] < arr[mid-1]){ end = mid-1;}
            if (arr[start] <= arr[mid]){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return start;
    }
}
