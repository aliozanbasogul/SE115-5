public class Scenario2 {
    public static long power(int base, int exp){
        // Base case
        if (exp == 0){
            return 1L;
        }
        // Recursive step
        return base * power(base, exp-1);
    }
}
