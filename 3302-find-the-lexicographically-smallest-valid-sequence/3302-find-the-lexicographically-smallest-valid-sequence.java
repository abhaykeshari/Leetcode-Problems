class Solution {
    public int[] validSequence(String word1, String word2) {

        int n = word1.length();
        int m = word2.length();

        int[] ans = new int[m];

        // last[j] = position in word1 that can match word2[j]
        // when matching from right to left
        int[] last = new int[m];

        int i = n - 1;
        int j = m - 1;

        while (i >= 0 && j >= 0) {

            if (word1.charAt(i) == word2.charAt(j)) {
                last[j] = i;
                j--;
            }

            i--;
        }

        // If word2 itself cannot be matched as a subsequence
        if (j >= 0) {
            // We might still be able to solve using one mismatch,
            // so don't immediately return.
        }

        boolean mismatchUsed = false;

        i = 0;
        j = 0;

        while (i < n && j < m) {

            // Exact match
            if (word1.charAt(i) == word2.charAt(j)) {

                ans[j] = i;
                j++;

            }
            // Use our one allowed mismatch
            else if (!mismatchUsed) {

                // If this is the last character of word2,
                // we can always use the mismatch.
                //
                // Otherwise, make sure word2[j+1...] can
                // still be matched after index i.
                if (j == m - 1 || i < last[j + 1]) {

                    ans[j] = i;
                    j++;
                    mismatchUsed = true;
                }
            }

            i++;
        }

        // Couldn't match all characters
        if (j < m) {
            return new int[0];
        }

        return ans;
    }
}