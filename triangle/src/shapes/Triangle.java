/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;
/**
 *
 * @author revanth
 */
public class Triangle extends geometricObject {
    private double side1;
    private double side2;
    private double side3;
  Triangle(String color,boolean filled){
      super(color,filled);
      side1=side2=side3=0.1;
  }
    Triangle(String color,boolean filled,double side1,double side2,double side3){
        super(color,filled);
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
        
    }
    public double getSide1(){
        return side1;
    }
    public double getSide2(){
        return side2;
    }
    public double getSide3(){
        return side3;
    }

    /**
     *
     * @return
     */
    public double getArea(){
        double s =(side1+side3+side3)/2;
        return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
    }
    public double getPerimeter(){
        return (side1+side2+side3);
    }
    @Override
    public String toString(){
        return ("side1 :"+side1+"/n side2 :"+side2+"/n side3 :"+side3);
    }
    
    
}
