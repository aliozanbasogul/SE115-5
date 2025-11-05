public class Scenario0 {
    public static int factorial (int n){
        //Base case
        if (n == 1){
            return 1;
        }
        // Recursive case
        return n * factorial(n-1);
    }
}
