package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    private List<Shape> shapes = new ArrayList<>();

    public void addFigure(Shape shape) {
        shapes.add(shape);
    }

    public void removeFigure(Shape shape) {
        shapes.remove(shape);
    }

    public Shape getFigure(int n) {
        if (n >= 0 && n < shapes.size()) {
            return shapes.get(n);
        }else{
            System.out.println("Figure not found");
            return null;
        }
    }

    public String showFigures() {
        if (shapes.isEmpty()) {
            System.out.println("List is empty");
            return "";
        }

        String result = "";

        for (Shape shape : shapes) {
            result += shape.getShapeName() + ", ";
        }

        return result.substring(0, result.length() - 2);
    }
}
