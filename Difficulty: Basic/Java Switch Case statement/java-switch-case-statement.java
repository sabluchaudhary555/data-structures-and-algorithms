import java.util.List;

class Solution {
    static double switchCase(int choice, List<Double> arr) {
        // Switch between different geometric calculations
        switch (choice) {
            case 1:
                // Choice 1: Area of Circle = PI * R * R
                double radius = arr.get(0);
                return Math.PI * radius * radius;
                
            case 2:
                // Choice 2: Area of Rectangle = L * B
                double length = arr.get(0);
                double breadth = arr.get(1);
                return length * breadth;
                
            default:
                // Return 0 if choice is invalid
                return 0.0;
        }
    }
}