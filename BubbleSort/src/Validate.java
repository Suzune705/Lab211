/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hieuchu
 */
public class Validate {
    
    public static void createException(int size ) throws InvalidNumberException{
        if(size < 0 ){
            throw new InvalidNumberException("size must be > 0") ;
        }        
    }
    
    public static void isPositiveNumber(int size ){
        try{
            createException(size);
        }catch(InvalidNumberException ine){
            System.out.println(ine.getMessage());
        }              
    }
}
