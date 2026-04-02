import java.util.Arrays;

class Solution {
    public String minSum(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        
        StringBuilder num1 = new StringBuilder();
        StringBuilder num2 = new StringBuilder();
        
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                if (arr[i] != 0 || num1.length() > 0) {
                    num1.append(arr[i]);
                }
            } else {
                if (arr[i] != 0 || num2.length() > 0) {
                    num2.append(arr[i]);
                }
            }
        }
        
        if (num1.length() == 0) num1.append('0');
        if (num2.length() == 0) num2.append('0');
        
        String s1 = num1.toString();
        String s2 = num2.toString();
        
        int i = s1.length() - 1, j = s2.length() - 1;
        int carry = 0;
        StringBuilder result = new StringBuilder();
        
        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;
            if (i >= 0) sum += s1.charAt(i--) - '0';
            if (j >= 0) sum += s2.charAt(j--) - '0';
            result.append(sum % 10);
            carry = sum / 10;
        }
        
        return result.reverse().toString();
    }
}