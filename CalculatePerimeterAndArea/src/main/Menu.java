package main;


import model.Rectangle;
import model.Triangle;
import model.Circle;
import java.util.Scanner;
import model.Shape;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author hieuchu
 */
public class Menu {

    private final Rectangle rectangle = new Rectangle();
    private final Triangle triangle = new Triangle();
    private final Circle circle  = new Circle();

    public void dispayInputData() {
        System.out.println("=====Calculator Shape Program=====");
        rectangle.inputData();
        triangle.inputData();
        circle.inputData();         
    }

    public void performFunction() {
        rectangle.printResult();
        circle.printResult();
        triangle.printResult();
    }
}
