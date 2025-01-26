// Brute force 
class Solution {
    public int countPartitions(int[] nums) {
        // partition = 0 - i - n-1 , split arr into two non empty subarrays
        // i.e. left subarray contain [0,i]
        // right subarray contain [i+1, n-1]
        // Return no. of partitions = (left + ele - right + ele)

        int n = nums.length;
        int right = 0, left = 0;
        int diff =0;
        int count =0;
        for(int i =0; i<n; i++){
            for(int j = i+1; j<n;j++){
                right = nums[i];
                left += nums[j];
                diff = right - left;
                if(diff %2 == 0){
                    count++;
                }
            }
        }
        return count++;
    }
}
// Optimized 
class Solution {
    public int countPartitions(int[] nums) {
        // partition = 0 - i - n-1 , split arr into two non empty subarrays
        // i.e. left subarray contain [0,i]
        // right subarray contain [i+1, n-1]
        // Return no. of partitions = (left + ele - right + ele)
        int n = nums.length; 
        if(n<2){
            return 0;// can't split arr
        }
        int totalSum = 0;
        for(int num : nums){
            totalSum += num;// total sum of arr
        }
        int left = 0;
        int count = 0;
        // iterate over all index except last pointer
        for(int i= 0; i<n-1; i++)
        {
            int right = totalSum - left;
            if((right - left) %2 == 0){
                count++;
            }
           
        } 
         return count;
    }
}©leetcode
  
