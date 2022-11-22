/*
 * Write a Java program to reverse an array having five items of type int.
 */
public class QuestionTen {
    public static void main(String args[]){
        //initialize array
        int[] arr = new int[] { 1, 2, 3, 4, 5};
        System.out.println("Original array");
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i] + "");
        }
        System.out.println();
        System.out.println("array in reverse order:");
        //loop through the array in reverse oder
        for(int i = arr.length-1; i >= 0; i--){
            System.out.println(arr[i] + "");
        }
    }
}
