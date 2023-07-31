import java.util.Arrays;

public class ReverseString {

    // leetcode 344
    // https://leetcode.com/problems/reverse-string/

    public void reverseString(char[] s) {
        int left = 0, right = s.length-1;
        while(left <right){
            char cur = s[left];
            s[left++] = s[right];
            s[right--] = cur;
        }
        System.out.println(Arrays.toString(s));
    }
}
