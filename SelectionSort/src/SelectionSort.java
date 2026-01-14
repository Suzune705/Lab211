
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *  
 * @author hieuchu
 */
public class SelectionSort {
    private int[] array;
    /**
     * the constructor of SelectionSort
     */
    public SelectionSort() {
    }
/**
 * generate randomly array 
 * @param size : the size of array 
 *  
 */
    public void generateArray(int size) {      
        int[] tmp = new int[size];
        Random random = new Random();
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = random.nextInt(size);
        }
        this.array = tmp;
    }
    /**
     * show array 
     */
    public void displayArray() {
        int count = 0;
        System.out.print("[");
        for (int x : array) {
            if (count >= 1 && count < 10) {
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
     * @param arr : temporary array 
     *  swap element in array by index 
     */    
    public void swap(int indexA , int indexB , int[] arr){
        int tmp = arr[indexA];
        arr[indexA] = arr[indexB];
        arr[indexB] = tmp ;
    }
    /**
     * sort array by the selection sort 
    */    
    public void sortArray(){
        // traverse first index until last index 
        for(int i = 0 ; i < array.length  ; i++){
            // assume the currend index is smallest element          
            int minElement = i ;
            // update the index of smallest element 
            for(int j = i + 1 ; j < array.length ; j++){
                if(array[j] < array[minElement]){
                   minElement = j ;
                }
            }
            // swap smallest element with the current element 
            swap(i , minElement , array);
        }        
    }
}
