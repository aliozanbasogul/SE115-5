public class Bonus {
    public static int fibonacci(int n){
        //Base case
        if(n == 1) return 1;
        if (n == 0 ) return 0;
        // Recursive step
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
