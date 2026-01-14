/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *  Controller to user enter data , generate array , sort array and display array 
 * @author hieuchu
 */
public class Main {
    public static void main(String[] args) {
        // Declare SlectionSort Object 
        SelectionSort selection = new SelectionSort();
        // Declare Ultility Object 
        Ultility ultility = new Ultility();
        // Step 1 : Enter the size of array 
        System.out.println("Enter number of array:");
        int size = ultility.input();
        // Step 2 : Generate array 
        selection.generateArray(size);
        // Step 3 : display unsort array 
        System.out.print("Unsorted array:");
        selection.displayArray();       
        System.out.println("");
        // Step 4 : sort array 
        System.out.print("Sorted array:");      
        selection.sortArray();
        // Step 5 : display array after sorting 
        selection.displayArray();
    }
}
