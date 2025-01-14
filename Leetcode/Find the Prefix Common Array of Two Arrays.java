class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
                int[] result = new int[A.length];

       HashSet<Integer> seen = new HashSet<>();
       int commonCnt = 0;
       for(int i =0; i<A.length; i++){
            if(seen.contains(A[i])){
                commonCnt++;
            }else{
                seen.add(A[i]);
            }
            if(seen.contains(B[i])){
                commonCnt++;
            }else{
                seen.add(B[i]);
            }
            result[i] = commonCnt;
       }
       return result;
    }
}
