
import java.util.InputMismatchException;
import java.util.Scanner;
import javax.print.attribute.standard.Finishings;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hieuchu
 */
public class Ultility {
    
    Scanner sc = new Scanner(System.in);
    
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
    
    public void isValidData(String size ) throws InputMismatchException{
        if(!size.matches("^\\d+$")){
            throw new InputMismatchException("you have to enter a positive number");
        }
    }
}
