package util;


import util.InvalidNumberException;
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
public class Utility {
    /**
     * receive data from user and validate it until user enter valid data
     *
     * @return a positive integer
     */
    public double inputData() {
        Scanner sc = new Scanner(System.in);
        String data ;
        double convertedData = 0;
        while (true) {
            try {
                data = sc.nextLine();
                isValidData(data);
                convertedData = Double.parseDouble(data);
                return convertedData;
            } catch (InvalidNumberException | InputMismatchException | NumberFormatException e) {
                System.out.println(e.getMessage());
                System.out.println("Please try again !!");
            }
        }
    }

    /**
     * check data in the range 0 - 9 digit
     *
     * @param size
     * @throws InputMismatchException
     */
    public void isValidData(String size) throws InputMismatchException, NumberFormatException, InvalidNumberException {
        if (!size.matches("^\\d+$")) {
            throw new InputMismatchException("you have to enter a positive number");
        }
        if (!size.matches("^\\d+$")) {
            throw new InputMismatchException("you have to enter a positive number");
        }
        int converted = Integer.valueOf(size);
        if (converted <= 0) {
            throw new InvalidNumberException(("you have to enter a positive number"));
        }
    }
    public boolean isTriangle(double a , double b , double c){
        if(a + b > c && a + c > b && b + c > a){
            return true ;
        }
        return false ;
    }
}
