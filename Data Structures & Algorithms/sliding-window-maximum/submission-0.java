class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;

        ArrayDeque<Integer> q = new ArrayDeque<>();
        int[] res = new int[n - k + 1];

        int i = 0, j = 0, ptr = 0;

        while (j < n) {

            // Remove smaller elements from the back
            while (!q.isEmpty() && q.peekLast() < nums[j]) {
                q.pollLast();
            }

            q.add(nums[j]);

            // Window size is less than k
            if (j - i + 1 < k) {
                j++;
            }

            // Window size is exactly k
            else if (j - i + 1 == k) {

                // Front contains maximum
                res[ptr] = q.peek();
                ptr++;

                // Remove outgoing element if it is the maximum
                if (nums[i] == q.peek()) {
                    q.pollFirst();
                }

                i++;
                j++;
            }
        }

        return res;
    }
}