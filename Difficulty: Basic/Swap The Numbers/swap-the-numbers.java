class Solution {
    public void swap(int a, int b) {
        // Using third variable method
        int temp = a;
        a = b;
        b = temp;
        
        System.out.println(a + " " + b);
    }
}