
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

    public SelectionSort() {
    }

    public void generateArray(int size) {
        int[] tmp = new int[size];
        Random random = new Random();
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = random.nextInt(size);
        }
        this.array = tmp;
    }

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
    public void swap(int indexA , int indexB , int[] arr){
        int tmp = arr[indexA];
        arr[indexA] = arr[indexB];
        arr[indexB] = tmp ;
    }
    public void sortArray(){

        for(int i = 0 ; i < array.length  ; i++){
            int minElement = i ;
            for(int j = i + 1 ; j < array.length ; j++){
                if(array[j] < array[minElement]){
                   minElement = j ;
                }
            }
            swap(i , minElement , array);
        }        
    }
}
