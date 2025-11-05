public class Scenario1 {
    public static int sumDigit(int n){
        // Base case
        if (n < 10){
            return n;
        }
        // Recursive step
        return (n % 10) + sumDigit(n/10);
    }
}
