class Solution {
    public int specialArray(int[] arr) {
        int c =1, count=0;
        for (int i=0; i<arr.length; i++){
            count = 0;
            for (int x: arr){
                if ( c <= x){
                    count +=1;
                }
            }
            if (count == c){
                return c;
            }
            c++;
        }
        return -1;
    }
}