import java.util.List;
import java.util.LinkedList;

public class PascalsTriangle {

    // leetcode 118
    // https://leetcode.com/problems/pascals-triangle/
    public List<List<Integer>> generate(int numRows) {

        int n = numRows;

        List<List<Integer>> pascalTriangle = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            pascalTriangle.add(getNthRow(i));
        }
        return pascalTriangle;
    }

    public static List<Integer> getNthRow(int n){
        List<Integer> sol = new LinkedList<>();
        sol.add(1);
        int res = 1;
        for (int i = 1; i < n; i++) {

            // if row is 6 and indexing is 0 based
            // 1st col is 5
            // col 1 -> col0 * (row-col)/col
            // col 2 -> col1 * (row-col)/col
            // col n -> col(n-1) * (row-col)/col
            // if row is nth
            // then run loop from 1 to n adding the first index
            // beforehand in the list to aid in calculation later

            res = res*(n-i)/i;
            sol.add(res);
        }
        return sol;
    }
}
