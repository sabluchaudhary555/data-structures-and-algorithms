import java.util.ArrayList;

class Solution {
    static ArrayList<Float> divisionWithPrecision(float a, float b) {
        // Calculate the exact division
        float exactResult = a / b;
        
        // Format to 3 decimal places
        // We convert the float to a String with 3 decimal precision, then back to a Float
        String formattedStr = String.format("%.3f", exactResult);
        float roundedResult = Float.parseFloat(formattedStr);
        
        // Create the ArrayList to return both values
        ArrayList<Float> resultList = new ArrayList<>();
        resultList.add(exactResult);
        resultList.add(roundedResult);
        
        return resultList;
    }
}