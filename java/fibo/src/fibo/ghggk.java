package fibo;

public class ghggk {

	public static double binetFormula(int n) {
        // Constants
        double phi = (1 + Math.sqrt(5)) / 2;  // Golden ratio (Φ)
        double psi = (1 - Math.sqrt(5)) / 2;  // Conjugate of the golden ratio (ψ)
        
        // Binet's Formula: F(n) = (Φ^n - ψ^n) / √5
        double fibonacciNumber = (Math.pow(phi, n) - Math.pow(psi, n)) / Math.sqrt(5);
        
        // Return the rounded result to the nearest integer
        return Math.round(fibonacciNumber);
    }

    public static void main(String[] args) {
        // Example: calculate the 10th Fibonacci number
        int n = 10;
        
        // Calculate the n-th Fibonacci number
        double result = binetFormula(n);
        
        // Print the result
        System.out.println("The " + n + "-th Fibonacci number is: " + (int)result);
    }

}
