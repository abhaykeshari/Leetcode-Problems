class Solution {
    public int minimumPushes(String word) {
        
        int arr[] = new int [26];
        for(char c : word.toCharArray()){
            arr[c-'a']++;
        }
        Arrays.sort(arr);
        int sum = 0;
        int push = 1; 
        int count = 0;
        for(int i = 25 ; i >=0;i--){
            if(arr[i]==0){
                break;
            }
            sum += arr[i]*push;
            count++;
            if(count == 8){
                push++;
                count= 0;
            }

        }
        return sum;
    }
}