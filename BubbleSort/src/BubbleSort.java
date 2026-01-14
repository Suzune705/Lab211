
import java.util.Random;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author hieuchu
 */
/*
@param value 
*/
public class BubbleSort {

    private int[] array;

    public BubbleSort() {
    }

    public void generateArray(int size) {
        int[] tmpArray = new int[size];
        Random r = new Random();
        for (int i = 0; i < tmpArray.length; i++) {
            tmpArray[i] = r.nextInt(size);
        }
        this.array = tmpArray;
    }

    public void displayArray() {
        System.out.print("[");
        int count = 0;
        for (int x : array) {
            if (count > 0 && count < 10) {
                System.out.print(",");
            }
            System.out.print(x);
            count++;
        }
        System.out.print("]");
    }

    public void swapElement(int a, int b, int[] array2) {
        int tmp = array2[a];
        array2[a] = array2[b];
        array2[b] = tmp;
    }

    public void sortArray() {
        // traverse to size of array - 1 
        for (int i = 0; i < array.length ; i++) {
            /*
                compare current element with the after element if the current element < after element 
                then swap them 
            */
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    swapElement(j, j + 1, array);
                }
            }
        }
    }


}
