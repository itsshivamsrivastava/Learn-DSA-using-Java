public class TcsNinjaQuestion{
    public static void main(String [] args){
        int [] nums = {4,5,6,7};
        int even = 0;
        int odd = 0;

        for(int i = 0; i<nums.length; i++){
            if(i%2 == 0){
                even =  even + nums[i];
            }
            else{
                odd = odd + nums[i];
            }
        }
        int result = odd - even;
        System.out.println(result);
    }
}