package model;


import util.Utility;
import model.Shape;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hieuchu
 */
public class Rectangle extends Shape {

    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle() {
     
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getPerimeter() {
        return (length + width) * 2  ;
    }

    @Override
    public double getArea() {
        return length * width ;
    }

    @Override
    public void printResult() {
        System.out.println("-----Rectangle-----");
        System.out.println("Width : " + width);
        System.out.println("Length: " + length );
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());
    }
    
    @Override
    public void inputData(){
        Utility utility = new Utility();   
        System.out.println("Please input side width of Rectangle:");
        this.width = utility.inputData();
        System.out.println("Please input length of Rectangle:");
        this.length = utility.inputData();        
    }
}
