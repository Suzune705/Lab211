
import java.util.InputMismatchException;
import java.util.Scanner;
import javax.print.attribute.standard.Finishings;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Utility class for input validation 
 * @author hieuchu
 */
public class Ultility {    
    Scanner sc = new Scanner(System.in);    
    /**
     *  receive data from user and validate it until user enter valid data 
     * @return a positive integer 
     */
    public int input(){
        String size; 
        int converted ;
        while(true){
            try{
            size = sc.nextLine();
            isValidData(size);           
            converted = Integer.valueOf(size);
            return converted ;
            } catch(InputMismatchException ime){
             ime.printStackTrace();
             System.out.println("please try again !!! ");
           }
        }               
    }
   /**
    * check data in the range 0 - 9 digit 
    * @param size
    * @throws InputMismatchException 
    */
    public void isValidData(String size ) throws InputMismatchException{        
        if(!size.matches("^\\d+$")){
            throw new InputMismatchException("you have to enter a positive number");
        }
    }
}
