public class MatrixDiagonalSum {

    // leetcode 1572
    // https://leetcode.com/problems/matrix-diagonal-sum/

    public int diagonalSum(int[][] mat) {
        int left = 0, right = mat.length-1;
        int curRow = 0;
        int sum = 0;
        while(curRow < mat.length){
            sum += mat[curRow][left++] + mat[curRow++][right--];
        }
        if(mat.length%2 == 1)
            sum -= mat[(mat.length-1)/2][(mat.length-1)/2];
        return sum;
    }

}
