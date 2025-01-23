// ************************************************** Java **************************************************
// Approach - 1 (Brute Force)
// T.C : O((m*n) * (m+n))
// S.C : O(1)
class Solution {
    public int countServers(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int resServers = 0;

        //Traverse through the grid
        for(int row = 0; row<m;++row){
            for(int col = 0; col<n; ++col){
                if(grid[row][col] == 1){
                    boolean canCom = false;

                    //check for communication in the same row
                    for(int otherCol = 0; otherCol < n; ++otherCol){
                        if(otherCol != col && grid[row][otherCol] == 1){
                            canCom = true;
                            break;
                        }
                    }
                    // if a server was found in the same row , increment resServers
                    if(canCom){
                        resServers++;
                    }else {
                        //check for same col
                        for(int otherRow = 0; otherRow < m; ++otherRow){
                            if(otherRow != row && grid[otherRow][col] == 1){
                                canCom = true;
                                break;
                            }
                        }
                        // if server found ++
                        if(canCom){
                            resServers++;
                        }
                    }
                }
            }
        }
        return resServers;
    }
}
