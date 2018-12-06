class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int m = nums.length;
        int n = nums[0].length;
        int row = 0,column = 0;
        int res[][] = new int[r][c];
        if(r*c != m*n)  return nums;
        for(int i = 0;i<r;i++){
            for(int j = 0;j<c;j++){
                if(column < n){
                    res[i][j] = nums[row][column];
                    column++;
                }
                else{
                    row++;
                    j--;
                    column=0;
                }
            }
        }
        return res;
    }
}

class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int m = nums.length;
        int n = nums[0].length;
        int row = 0,column = 0;
        int res[][] = new int[r][c];
        int count = 0;
        if(r*c != m*n)  return nums;
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                res[count/c][count%c] = nums[i][j];
                count++;
            }
        }
        return res;
    }
}
