
public class Factorial {

    static int factorial(int x)
    {

        if (x == 0 || x == 1)
            return 1;

        return x * factorial(x - 1);
    }

    public static void main(String[] args)
    {

        int ans = factorial(5);

        System.out.println("Factorial of 5 is :" + ans);
    }
}
