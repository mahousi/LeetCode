class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int count = m>n?n:m;
        for(int i = 0;i<m;i++){
            int x = matrix[i][0];
            for(int j = 0;j<count;j++){
                if(i+j<m){
                    if(x != matrix[i+j][j]) return false;
                }
                else break;
            }
        }
        for(int i = 0;i<n;i++){
            int x = matrix[0][i];
            for(int j = 0;j<count;j++){
                if(i+j<n){
                    if(x != matrix[j][j+i]) return false;
                }
                else break;
            }
        }
        return true;
    }
}
