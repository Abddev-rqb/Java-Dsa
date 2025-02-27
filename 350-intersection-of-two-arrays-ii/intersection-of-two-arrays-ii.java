class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int index = 0;
        boolean[] exist= new boolean[nums2.length];
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (!exist[j] && nums1[i] == nums2[j]){
                    nums1[index++] = nums1[i];
                    exist[j] = true;
                    break;
                }
            }
        }
        int[] res = new int[index];
        for (int i = 0; i < index; i++) {
            res[i] = nums1[i];
        }
        return res;
    }
}