class Solution {
    public boolean checkIfExist(int[] arr) {
        for (int i=0; i<arr.length; i++){
            int v = arr[i]*2;
            for (int j=0; j<arr.length; j++){
                if (i!=j&&arr[j] == v){
                    return true;
                }
            }
        }
        return false;
    }
}