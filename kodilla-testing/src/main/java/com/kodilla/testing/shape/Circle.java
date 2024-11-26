package com.kodilla.testing.shape;

public class Circle implements Shape {

    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public String getShapeName(){
        return "Circle";
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }
}