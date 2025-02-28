class Solution {
    public int singleNonDuplicate(int[] arr) {
        int start = 0, end = arr.length-1;
        if (arr.length-1 == 0){
            return arr[arr.length-1];
        }
        while(start <= end){
            if (end == 0 || arr[end] != arr[end-1]){
                return arr[end];
            }
            if (start < arr.length-1 && arr[start] == arr[start+1]){
                start += 2;
            }else{
                return arr[start];
            }
        }
        return -1;
    }
}