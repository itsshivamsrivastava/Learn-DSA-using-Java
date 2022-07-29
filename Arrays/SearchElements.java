import java.util.Scanner;

public class SearchElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int [size];

        System.out.println("Enter the elements: ");
        for(int i=0; i<numbers.length; i++){
            numbers[i] = sc.nextInt();
        }
        
        System.out.print("Enter the number you want to search: ");
        int search = sc.nextInt();

        // This is called as linear serach ---> Linear Search means searching in linear fashion.
        for(int i=0; i<numbers.length; i++){
            if(numbers[i] == search){
                System.out.println(search + " is found at index " + i);
            }
        }
        sc.close();
    }
}
