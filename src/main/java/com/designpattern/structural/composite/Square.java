package com.designpattern.structural.composite;

public class Square implements Shape {
    public void draw(String paintColor) {
        System.out.println("사각형이 다음 색상으로 색칠되었습니다. : " + paintColor);
    }
}
