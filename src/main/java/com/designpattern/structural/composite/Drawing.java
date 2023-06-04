package com.designpattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Drawing implements Shape {
    private List<Shape> shapes = new ArrayList<>();

    @Override
    public void draw(String paintColor) {
        for(Shape shape : shapes) {
            shape.draw(paintColor);
        }
    }

    public void add(Shape s) {
        this.shapes.add(s);
    }

    public void remove(Shape s) {
        this.shapes.remove(s);
    }

    public void clear() {
        System.out.println("모든 도형을 제거합니다.");
        this.shapes.clear();
    }
}
