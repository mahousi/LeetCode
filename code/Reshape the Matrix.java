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

public int[][] matrixReshape(int[][] nums, int r, int c) {
    int n = nums.length, m = nums[0].length;
    if (r*c != n*m) return nums;
    int[][] res = new int[r][c];
    for (int i=0;i<r*c;i++) 
        res[i/c][i%c] = nums[i/m][i%m];
    return res;
}
