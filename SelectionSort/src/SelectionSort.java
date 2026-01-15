
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 * Class include generate array , display array , sort array method
 *
 * @author hieuchu
 */
public class SelectionSort {

    /**
     * the array attribute
     */
    private int[] array;

    /**
     * the constructor of SelectionSort
     */
    public SelectionSort(int size) {
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
     * sort array by the selection sort
     */
    public void sortArray() {
        // traverse first index until last index 
        for (int i = 0; i < array.length; i++) {
            // assume the currend index is smallest element          
            int minElement = i;
            // update the index of smallest element 
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minElement]) {
                    minElement = j;
                }
            }
            // swap smallest element with the current element 
            swap(i, minElement);
        }
    }
}
