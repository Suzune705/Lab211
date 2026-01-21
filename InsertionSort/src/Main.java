/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * class allow user enter data and use sort, display array method
 *
 * @author hieuchu
 * @version 1.0.0
 * @since 20/1/2026
 */
public class Main {

    public static void main(String[] args) {

        // Declare Utility Object 
        Utility utility = new Utility();

        // Step 1 : Enter the size of array 
        System.out.println("Enter number of array:");
        int size = utility.input();

        // Declare InsertionSort Object 
        InsertionSort insertionSort = new InsertionSort(size);

        // Step 2 : Generate array 
        insertionSort.generateArray();

        // Step 3 : display unsort array 
        System.out.print("Unsorted array:");
        insertionSort.displayArray();
        System.out.println("");

        // Step 4 : sort array 
        System.out.print("Sorted array:");
        insertionSort.sortArray();

        // Step 5 : display array after sorting 
        insertionSort.displayArray();
    }
}
