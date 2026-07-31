class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int sum = 0 ;
        for(int a : arr){
            sum += a;
        }
        if(sum %3 != 0){
            return false;
        }
        
        int target = sum /3;
        int current = 0;
        int count=0;
        for(int a : arr){
            current += a;
            if(current == target){
                count++;
                current = 0;
            }
        }
        return count >=3;
    }
}