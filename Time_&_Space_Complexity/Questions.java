import java.util.Random;

public class Questions {
    static int randomNum(int a){
        Random rand = new Random();
        int num = (rand.nextInt() % (a + 1));
        return num;
    }
    static int function(int n){
        int i;
        if(n <= 0){
            return 0;
        }
        else{
            i = randomNum(n-1);
            System.out.println("this");
            return function(i) + function(n - 1 - i);
        }
    }

    public static void main(String[] args) {
        function(6);
    }
}
