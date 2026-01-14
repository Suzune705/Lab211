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

        BubbleSort bubbleSort = new BubbleSort();
        
        Validate validate = new Validate();
        
        System.out.println("Enter number of array: ");

        int size = validate.input();

        bubbleSort.generateArray(size);
        System.out.print("Unsorted array:");
        
        bubbleSort.displayArray();
        System.out.println("");
       
        System.out.print("Sorted array:");
        bubbleSort.sortArray();
        bubbleSort.displayArray();
    }
}
