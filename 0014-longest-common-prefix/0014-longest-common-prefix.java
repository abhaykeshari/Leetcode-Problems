class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 1){
            return strs[0];
        }
        Arrays.sort(strs);
        char c1[] = strs[0].toCharArray();
        char c2[] = strs[strs.length-1].toCharArray();
        String result="";
        for(int i = 0 ;i < c1.length; i++){
            if(c1[i]==c2[i]){
                result += c1[i];
            }
            else{
                break;
            }
        }
        return result;
    }
}