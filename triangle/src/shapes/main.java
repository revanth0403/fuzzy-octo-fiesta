/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;
import java.util.Scanner;
/**
 *
 * @author revanth
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
            System.out.println("enter three sides of a triangle");
            double side1=input.nextDouble();
            double side2=input.nextDouble();
            double side3=input.nextDouble();
            
            System.out.println("enter the color :");
            String color=input.next();
            System.out.println("print wheater the color is filled or not(y/n) :");
            boolean filled=input.nextBoolean();
            Triangle triangle=new Triangle(color,filled,side1,side2,side3);
            triangle.setColor(color);
            triangle.setFilled(filled);
            
            System.out.println(triangle.toString());
            System.out.println("Area :"+triangle.getArea());
            System.out.println("perimeter :"+triangle.getPerimeter());
            System.out.println("color :"+triangle.getColor());
            System.out.println("the triangle is "+(triangle.isFilled() ? "" : " not ")+"filled ");
        // TODO code application logic here
    }
    
}
