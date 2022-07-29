package Searching;

public class EvenNumbers {
    public static int findNumbers(int[] nums) {
        int count = 0;
        for(int num: nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }

    static boolean even(int num){
        int numberOfDigits = digits(num);
        return numberOfDigits % 2 == 0;
    }

    static int digits(int num){
        int count = 0;
        if(num < 0){
            num = num * -1;
        }
        if(num == 0){
            return 1;
        }
        while(num > 0){
            count++;
            num = num / 10;
        }
        return count;
    }
    static int digits2(int num){
        if(num < 0){
            num = num * -1;
        }
        if(num == 0){
            return 1;
        }
        return (int )(Math.log10(num) + 1);
    }

    public static void main(String[] args) {
        int nums[] = {12, 345, 2, 6, 7896};
        int ans = findNumbers(nums);
        System.out.println(ans);
        // System.out.println(digits(0));
        System.out.println(digits2(-345678));
    }
}
