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
public class geometricObject {
    private String color="white";
    private boolean filled;
    


    
    geometricObject(String color,boolean filled){
        this.color=color;
        this.filled=filled;
    }
    public String getColor(){
        return color;
    }
    public boolean isFilled(){
        return filled;
    }
    public void setColor(String color){
        this.color=color;
    }
    public void setFilled(boolean filled){
        this.filled=filled;
    }

    @Override
    public String toString(){
        return ("/n color:"+color+"/n filled"+filled);
    }
}
