/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;
import java.io.*;
import java.util.*;

/**
 *
 * @author mooks
 */

abstract class Shape {
    private double volume;
    
    abstract void calcVolume();
    abstract void printMeasurements();
    
    void setVolume(double vol) {
        volume = vol;
    }
    
    double getVolume() {
        return volume;
    }
}

class Prism extends Shape {
    private double length;
    private double width;
    private double height;
    
    void calcVolume() {
        setVolume(getLength() * getWidth() * getHeight());
    }
    
    void setLength(double l) {
        length = l;
    }
    
    void setWidth(double w) {
        length = w;
    }
    
    void setHeight(double h) {
        length = h;
    }
    
    double getLength() {
        return length;
    }
    
    double getWidth() {
        return width;
    }
    
    double getHeight() {
        return height;
    }
    
    void printMeasurements() {
        System.out.println("Length: " + getLength() +
                "\nWidth: " + getWidth() + 
                "\nHeight: " + getHeight());
    }
}

/*class Cone extends Shape {
    double radius;
    double height;
    double areaCircle;
    double volume;
}*/
 
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to the Volume Calculator.\nWhat shape's "
                + "volume would you like to calculate?\n"
                + "a) Prism"
                + "b) Cone"
                + "c) Sphere");
        String shape = in.nextLine();
        //System.out.println("You are going to calculate the volume of a " + shape);
        
        if (shape.equals("a")) {
            Prism prism = new Prism();
            System.out.println("To calculate the volume of a prism, you need the "
                    + "length, width, and height\n"
                    + "What is the length:");
            prism.setLength(in.nextDouble());
            System.out.println("What is the width");
            prism.setWidth(in.nextDouble());
            System.out.println("What is the height");
            prism.setHeight(in.nextDouble());
            
            prism.calcVolume();
            System.out.println("Volume: " + prism.getVolume());
        }
        
        if (shape.equals("")) {
            Cone cone = new Cone();
        }
        
        
    }
}
