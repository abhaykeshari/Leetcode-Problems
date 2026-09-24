class Solution {
    public int maxScore(String s) {
        int ones = 0;

        // Count total 1s
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                ones++;
            }
        }

        int zeros = 0;
        int max = 0;

        // Don't include last character
        for (int i = 0; i < s.length() - 1; i++) {

            if (s.charAt(i) == '0') {
                zeros++;
            } else {
                ones--;
            }

            max = Math.max(max, zeros + ones);
        }

        return max;
    }
}