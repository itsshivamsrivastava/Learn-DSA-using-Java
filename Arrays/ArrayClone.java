public class ArrayClone {

    static void arrayClone(){

        // Original array
        int [] arr = {1,2,3,4,5};
        System.out.println("Original Array: ");
        
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + "  ");
        }
        System.out.println();

        // Clone the array 
        // Deep Copy is created for one dimensional arrayby clone() method.
        int [] cloneArr = arr.clone();
        System.out.println(arr == cloneArr);

        System.out.println("Cloned Array: ");

        for (int i = 0; i < cloneArr.length; i++) {
            System.out.print(cloneArr[i] + "  ");
        }
    }
    public static void main(String[] args) {
        arrayClone();
    }
}
