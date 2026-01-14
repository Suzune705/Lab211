
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author hieuchu
 */
public class Validate {
    public int input() {
        Scanner sc = new Scanner(System.in);
        String size ;
        while (true) {
            try {
                size = sc.nextLine();  
                isNumber(size);
                int convert = Integer.valueOf(size);                
                return convert;
            } catch (InputMismatchException ine) {
                ine.printStackTrace();
                System.out.println("Please try again ");                
            } 
        }       
    }
    /**
     * 
     * @param size
     * @throws InputMismatchException 
     */
    public void isNumber(String size) throws InputMismatchException{
        // check whether size is a number that belong to range negavetive and positive number 
         if (!size.matches("^\\d+$")) {
            throw new InputMismatchException("you must have to enter a number ");
        }
    }
}
