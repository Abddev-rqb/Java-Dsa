class Solution {
    public int search(ArrayReader reader, int target) {
        int f = 0, s = 1;
        while (reader.get(s) < target){
            f = s;
            s *=2;
        }
        while (f <= s) {
            int mid = f + (s - f) / 2;
            int midV = reader.get(mid);
            if (arr[midV] == target) {
                return mid;
            }
            if (arr[midV] < target) {
                s = mid + 1;
            } else {
                s = mid - 1;
            }
        }
    return -1;
    }
}