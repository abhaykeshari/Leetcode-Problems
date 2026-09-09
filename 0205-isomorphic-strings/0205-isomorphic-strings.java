class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!= t.length()){
            return false;
        }
        int arr[]=new int [256];
        int arr1[]= new int[256];
        Arrays.fill(arr,-1);
        Arrays.fill(arr1,-1);
        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if (arr[c1] == -1) {
                arr[c1] = c2;
            } else if (arr[c1] != c2) {
                return false;
            }

            if (arr1[c2] == -1) {
                arr1[c2] = c1;
            } else if (arr1[c2] != c1) {
                return false;
            }
        }
        return true;
    }
}