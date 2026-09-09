class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        // Make nums1 the smaller array
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }

        int n1 = nums1.length;
        int n2 = nums2.length;

        int N = n1 + n2;

        int start = 0;
        int end = n1;

        while (start <= end) {

            // Partition in nums1
            int cut1 = start + (end - start) / 2;

            // Partition in nums2
            int cut2 = N / 2 - cut1;

            // Left side of nums1
            int l1 = (cut1 == 0)
                    ? Integer.MIN_VALUE
                    : nums1[cut1 - 1];

            // Left side of nums2
            int l2 = (cut2 == 0)
                    ? Integer.MIN_VALUE
                    : nums2[cut2 - 1];

            // Right side of nums1
            int r1 = (cut1 == n1)
                    ? Integer.MAX_VALUE
                    : nums1[cut1];

            // Right side of nums2
            int r2 = (cut2 == n2)
                    ? Integer.MAX_VALUE
                    : nums2[cut2];


            // Correct partition
            if (l1 <= r2 && l2 <= r1) {

                // Odd number of elements
                if (N % 2 != 0) {
                    return (double) Math.min(r1, r2);
                }
                else {
                    return (Math.max(l1, l2)
                            + Math.min(r1, r2)) / 2.0;
                }
            }

            // nums1 partition is too far right
            else if (l1 > r2) {
                end = cut1 - 1;
            }

            // nums1 partition is too far left
            else {
                start = cut1 + 1;
            }
        }

        return 0.0;
    }
}
