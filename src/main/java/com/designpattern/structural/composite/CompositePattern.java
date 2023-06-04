package com.designpattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class CompositePattern {
    public static void main(String args[]) {
        Shape triangle = new Triangle();
        Shape circle = new Circle();
        Shape square = new Square();

        Drawing drawing = new Drawing();
        drawing.add(triangle);
        drawing.add(circle);
        drawing.add(square);

        drawing.draw("빨간색");

        List<Shape> shapes = new ArrayList<>();
        shapes.add(drawing);
        shapes.add(new Triangle());
        shapes.add(new Circle());

        for(Shape shape : shapes) {
            shape.draw("초록색");
        }
    }
}
