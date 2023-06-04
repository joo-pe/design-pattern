package com.designpattern.structural.composite;

public class Circle implements Shape {
    public void draw(String paintColor) {
        System.out.println("동그라미가 다음 색상으로 색칠되었습니다. : " + paintColor);
    }
}
