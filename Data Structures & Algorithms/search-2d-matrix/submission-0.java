class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int totalrow = matrix.length;
        int  totalcol = matrix[0].length;
        int n=totalrow*totalcol-1;
        int l=0;
        int r=n;

        while(l<=r){
            int mid = l+(r-l)/2;
            int row = mid/totalcol;
            int c= mid%totalcol;
            if(matrix[row][c]==target){
                return true;
            }
            else if(target<matrix[row][c]){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return false;
    }
}
