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
        System.out.println("Enter size : ");
        int size = bubbleSort.EnterSize();
        
        Validate.isPositiveNumber(size);
        
        bubbleSort.GenerateArray(size);              
    }
}
