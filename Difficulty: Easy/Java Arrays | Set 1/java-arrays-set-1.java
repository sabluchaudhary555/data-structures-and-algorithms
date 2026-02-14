class Solution {
    public String average(int arr[]) {
        double sum = 0;
        
        // 1. Saare numbers ko add karo
        for (int x : arr) {
            sum += x;
        }
        
        // 2. Average nikalo
        double avg = sum / arr.length;
        
        // 3. 2 decimal places tak round karke String mein return karo
        return String.format("%.2f", avg);
    }
}