/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hieuchu
 */
public class Main {

    public static void main(String[] args) {
        // Declare SlectionSort Object 
        SelectionSort selection = new SelectionSort();
        // Declare Ultility Object 
        Ultility ultility = new Ultility();
        System.out.println("Enter number of array:");
        int size = ultility.input();

        selection.generateArray(size);

        System.out.print("Unsorted array:");

        selection.displayArray();
        
        System.out.println("");
        
        System.out.print("Sorted array:");
        
        selection.sortArray();
        
        selection.displayArray();
    }
}
