
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 * Class to design sort , swap , generate and display array method
 *
 * @author hieuchu
 * @version 1.0.0
 * @since 20-1-2026
 */
public class InsertionSort {

    /**
     * the array attribute
     */
    private int[] array;

    /**
     * the constructor of SelectionSort
     */
    public InsertionSort(int size) {
        array = new int[size];
    }

    /**
     * generate randomly array
     *
     */
    public void generateArray() {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(array.length);
        }
    }

    /**
     * show array
     */
    public void displayArray() {
        int count = 0;
        System.out.print("[");
        for (int x : array) {
            if (count >= 1 && count < array.length) {
                System.out.print(",");
            }
            System.out.print(x);
            count++;
        }
        System.out.print("]");
    }

    /**
     *
     * @param indexA : the first index
     * @param indexB : the second index
     *
     */
    private void swap(int indexA, int indexB) {
        int tmp = array[indexA];
        array[indexA] = array[indexB];
        array[indexB] = tmp;
    }

    /**
     * sort array by the insertion sort
     */
    public void sortArray() {

        // traverse the array starting from the second index 
        for (int i = 0; i < array.length; i++) {
            // store current element 
            int cuurentElement = array[i];
            // store index before current index ;            
            int index = i - 1;
            // loop when index > 0 and currentElement < the element before currentElement
            while (index >= 0 && cuurentElement < array[index]) {
                // if currentElement < the element before it,  shift that element to right
                array[index + 1] = array[index];
                // reduce index to compare the elements before currentElement
                --index;
            }
            // insert the currentElement at position 
            array[index + 1] = cuurentElement;
        }
    }

    public void sortArray2() {        
        for (int i = 1; i < array.length; i++) {
            int currentIndex = i ;
            int previousIndex = i - 1 ;
            while (previousIndex >= 0 && array[currentIndex] < array[previousIndex]) {
                swap(currentIndex, previousIndex);
                previousIndex--;    
                currentIndex-- ;
            }
            
        }
    }

}
