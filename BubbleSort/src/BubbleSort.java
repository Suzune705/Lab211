
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
public class BubbleSort {
    
    Scanner sc = new Scanner(System.in);
    private int[] array ;

    public BubbleSort() {
    }
    
   public int EnterSize(){
      int size = sc.nextInt();
      return size ;
   }
   
   public void GenerateArray(int size ){
       int[] tmpArray = new int[size];
       Random r = new Random();
       for(int i = 0 ; i < tmpArray.length ; i++){
           tmpArray[i] = r.nextInt(size);
       }
       this.array = tmpArray ;
       System.out.print("[");
       int count = 0 ;
       for(int x : array){ 
           if(count > 0 && count < 10  ){
               System.out.print(",");             
           }
            System.out.print(x);   
           count++;            
       }
       
       System.out.print("]");

   }
   
}
