// ======================= // Brute Force // ================= //
//TC: O(n×m), where n is the length of nums1 and m is the length of nums2.
// SC: O(1)
class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int res = 0;
        for(int i = 0; i<nums1.length;i++){
            for(int j = 0; j<nums2.length; j++){
                res ^= (nums1[i] ^ nums2[j]);
            }
        }
        return res;
    }
}
// ======================= // Approach 1 // ================= //





