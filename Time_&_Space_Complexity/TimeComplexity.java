public class TimeComplexity {

    static void timeComplexity(){
        // k1 times
        int i;
        int j;
        int n = 3;

        System.out.println("i      j0   j1   j2");
        for(i = 0; i < n; i++) {    // Running n times
            System.out.print(i + " =>   ");
            for(j = 0; j < n; j++) {    // Running n times
                System.out.print(j + "    ");   // k2 times
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        timeComplexity();
        /* 
        Explanation of time complexity of above code:
            i = 0   1   2 ...... n-1
                n + n + n + .... + n
              n(1 + 1 + 1 + .... + n)
              n x n = n^2
            Tn = k1 + k2(n^2)
            Tn = k(n^2)     {k1 is non dominant term. So, it is removed.}
            Tn = O(n^2)     {k2 is constant term. So, Constants are removed.}
            Time Complexity is O(n^2)   {n is the input parameter.}

            Space Complexity is O(1)    {No extra space is used.}
        */
    }
}
