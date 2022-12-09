public class Fibonacci {
        public static long fib(long n) {
            if ((n == 0) || (n == 1))
                return n;
            else
                return fib(n - 1) + fib(n - 2);
        }
        public static void main(String[] args) {
            System.out.println("The 3th fibonacci number is: " + fib(3));
            System.out.println("The 9th fibonacci number is: " + fib(9));
            System.out.println("The 20th fibonacci number is: " + fib(20));
        }
    }

