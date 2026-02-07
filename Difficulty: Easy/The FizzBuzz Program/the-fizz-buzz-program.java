class Solution {
    public static void fizzBuzz(int number) {
        // Check divisibility by both 3 and 5 first (e.g., 15, 30)
        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("FizzBuzz");
        } 
        // Then check if divisible by 3 only
        else if (number % 3 == 0) {
            System.out.println("Fizz");
        } 
        // Then check if divisible by 5 only
        else if (number % 5 == 0) {
            System.out.println("Buzz");
        } 
        // If none of the above, print the number itself
        else {
            System.out.println(number);
        }
    }
}