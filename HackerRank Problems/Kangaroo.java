class Result {
    /*
     * Complete the 'kangaroo' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER x1
     *  2. INTEGER v1
     *  3. INTEGER x2
     *  4. INTEGER v2
     */

    public static String kangaroo(int x1, int v1, int x2, int v2) {
        // Write your code here
        if(v2 > v1){
            return("NO");
        }
        else{
            int r = 1;
            for(int i = 0; i < (x2 - x1); i++){
                if(x1 + (v1*r) == x2 + (v2*r)){
                    return("YES");
                }
                r++;
            }
            return("NO");
        }
    }
}

public class Kangaroo{
    public static void main(String[] args) {
        int x1 = 0;
        int v1 = 3;
        int x2 = 4;
        int v2 = 2;
        String result = Result.kangaroo(x1, v1, x2, v2);
        // String result = Result.kangaroo(14,4,98,2);
        // String result = Result.kangaroo(2, 5, 8, 23);
        System.out.println(result);
    }
}