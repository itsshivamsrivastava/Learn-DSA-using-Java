public class SpaceComplexity {
    static void sum(){
        int a = 5;
        int b = 5;
        int c;
        c = a + b;
        System.out.println(c);
    }
    public static void main(String[] args) {
        sum();

        /*
        Explanation of space complexity of above code:
            integer datatype = 4 bytes
            Total Variables = 3

            int a --> 4 bytes
            int b --> 4 bytes
            int c --> 4 bytes
            a,b,c --> 3 variables x 4 bytes = 12 bytes
            Total space occupied by these three variables = 12 bytes
            Space Complexity = O(1) which is constant space complexity.
            Because, this program does not contain any loop, recursive function or call to any other functions.
         */
    }
}
