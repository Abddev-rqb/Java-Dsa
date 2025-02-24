/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak = peakElement(mountainArr);
        int firstTry = binS(mountainArr, target, 0, peak, true);
        if (firstTry != -1){
            return firstTry;
        }
        return binS(mountainArr, target, peak,mountainArr.length()-1, false);
    }
    public int peakElement(MountainArray mountainArr){
        int start = 0, end = mountainArr.length()-1;
        while(start < end){
            int mid = start + (end - start)/2;
            if (mountainArr.get(mid) > mountainArr.get(mid+1)){
                end = mid;
            }else{
                start = mid+1;
            }
        }
        return start;
    }
    public int binS(MountainArray mountainArr, int target, int start, int end, boolean isAsc){
        while(start<=end){
            int mid = start + (end - start)/2;
            int midV = mountainArr.get(mid);
            if (midV == target){
                return mid;
            }
            if (isAsc){
                if(midV < target){
                    start = mid+1;
                }else{
                    end = mid-1;
                }
            }else{
                if(midV > target){
                    start = mid+1;
                }else{
                    end = mid-1;
                }
            }
        }
        return -1;
    }
}