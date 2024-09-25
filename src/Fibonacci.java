public class Fibonacci {

    // Recursive method to find the nth Fibonacci number
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n; // Base cases: fib(0) = 0, fib(1) = 1
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2); // Recursive case
        }
    }

    public static void main(String[] args) {
        int number = 10; // Example number
        int result = fibonacci(number);
        System.out.println("Fibonacci number at position " + number + " is " + result);
    }
}

