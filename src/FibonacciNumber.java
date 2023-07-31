public class FibonacciNumber {

    // leetcode 509
    // https://leetcode.com/problems/fibonacci-number/
    public int get(int n) {
        if(n<=1){
            return n;
        }
        return get(n-1) + get(n-2);
    }
}
