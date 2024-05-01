package Recursion;

// Learn from Shardha Khapra (Apna College)
public class Recursion {

    // Recusive calls always in the form of stacks.
    public static void printNumbers5to1(int n) {
        if (n == 0) { // Base condition
            return;
        }
        /* Q1. Print numbers from 5 to 1 */
        System.out.println(n);
        printNumbers5to1(n - 1); // Recursive calling
    }

    // /*Q2. Print numbers from 1 to 5 */
    public static void printNumbers1to5(int n) {
        if(n == 6){
            return;
        }
        System.out.println(n);
        printNumbers1to5(n + 1); // Recursive calling
    }

    /* Q3. Print sum of first n natural numbers from 1 to 5 */
    public static void printSum(int i, int n, int sum) {
        if (i == n) {
            // sum += i;
            System.out.println(sum);
            return;
        }
        sum += i;
        printSum(i + 1, n, sum); // Recursive calling
        System.out.println(i);
    }
    // 
    /*Q4. Print factorial of a number. */
    public static int printFactorial(int n){
        if(n == 1 || n == 0){
            return 1;
        }
        int fact = n * printFactorial(n-1);
        return fact;
    }

    /* Q5. Print the fibonacci sequence till nth term. */
    public static void printFibonacci(int a, int b, int n){
        /*
            0 1 1 2 3 5 8.....
         */
        if(n==0){
            return;
        }
        int c = a + b;
        System.out.print(c + " ");  // Output will be => 0 1 1 2 3 5 8
        printFibonacci(b, c, n-1);  // Recursion...
    }

    /* Q6. Print x^n (stack height = n) 
           x^n = x*x*x*x*x*x*x*x*......n times
           1. x, n
           2. Kaam ==> x^n = x * x^(n-1) = x^(n-1+1) => x^n
           3. Base case ==> x^0 = 1 and x = 0
    */
    public static int calcPower(int x, int n){

        if(n == 0){
            return 1;
        }
        if(x == 0){
            return 0;
        }
        // int xPower_n_minus_1 = calcPower(x, n-1);
        // int xPown = x * xPower_n_minus_1;
        // return xPown;

        // if n is even
        if(n%2 == 0){
            return(calcPower(x, n/2) * calcPower(x, n/2));
        }
        // else n is odd
        else{
            return(calcPower(x, n/2) * calcPower(x, n/2) * x);
        }
    }

    
    public static void main(String[] args) {
        
        /* Q1. Print numbers from 5 to 1 */
        // printNumbers5to1(5); // m = 5
        
        /* Q2. Print numbers from 1 to 5 */
        // printNumbers1to5(1); // n = 1
        
        /* Q3. Print sum of first n natural numbers from 1 to 5 */
        // printSum(1, 5, 0);    // Calling function...

        /*Q4. Print factorial of a number. */
        // int ans = printFactorial(5);
        // System.out.println(ans);
        
        /* Q5. Print the fibonacci sequence till nth term. */
        // int a = 0, b = 1;
        // System.out.print(a + " ");
        // System.out.print(b + " ");
        // int n = 7;
        // printFibonacci(a, b, n-2);

        /* Q6. Print x^n (stack height = n) */
        int x=2, n=5;
        int ans = calcPower(x, n);
        System.out.println(ans);
    }
}
