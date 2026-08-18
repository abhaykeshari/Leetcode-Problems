import java.util.*;

class Solution {
    public int largestInteger(int[] nums, int k) {

        int n = nums.length;

        // Case 1: Only one subarray exists
        if (k == n) {
            int ans = 0;

            for (int num : nums) {
                ans = Math.max(ans, num);
            }

            return ans;
        }

        // Count frequency
        int[] freq = new int[51];

        for (int num : nums) {
            freq[num]++;
        }

        // Case 2: Every element is a subarray
        if (k == 1) {
            int ans = -1;

            for (int num : nums) {
                if (freq[num] == 1) {
                    ans = Math.max(ans, num);
                }
            }

            return ans;
        }

        // Case 3: 1 < k < n
        int ans = -1;

        if (freq[nums[0]] == 1) {
            ans = Math.max(ans, nums[0]);
        }

        if (freq[nums[n - 1]] == 1) {
            ans = Math.max(ans, nums[n - 1]);
        }

        return ans;
    }
}