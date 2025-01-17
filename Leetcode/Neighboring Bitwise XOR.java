//=============================== // Approach 1 // ==================== //
// first take 0 then 1 , loop check condn ori[i+1] = ori[i] ^ derived[i] and 2nd condn ori[n-1] ^ ori[0] == derived[n-1]
//TC: O(N) loop run form i - n-1 i.e. n iternation
// SC: O(N)
class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int n = derived.length; 
        int ori [] = new int[n];
        //first trying using 0
        ori[0] = 0;
        for(int i = 0; i<n-1; i++){
            ori[i+1] = ori[i] ^ derived[i];
        }
        if((ori[n-1] ^ ori[0]) == derived[n-1]){
            return true;
        }
         //second trying using 1
        ori[0] = 1;
        for(int i = 0; i<n-1; i++){
            ori[i+1] = ori[i] ^ derived[i];
        }
        if((ori[n-1] ^ ori[0]) == derived[n-1]){
            return true;
        }
        return false;
    }
}
//Approach-2 (Simple observation of XOR property)
//T.C : O(n)
//S.C : O(1)
class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int XOR = 0;

        for(int x : derived) {
            XOR = (XOR ^ x);
        }

        return XOR == 0;
    }
}
