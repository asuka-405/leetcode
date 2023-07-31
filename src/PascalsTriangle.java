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
            res *= (n-i);
            res /= i;
            sol.add(res);
        }
        return sol;
    }
}
