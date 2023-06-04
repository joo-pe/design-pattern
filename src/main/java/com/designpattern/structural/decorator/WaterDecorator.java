package com.designpattern.structural.decorator;

public class WaterDecorator extends Decorator {
    public WaterDecorator(Component coffeeComponent) {
        super(coffeeComponent);
    }

    @Override
    public String add() {
        // TODO Auto-generated method stub
        return super.add() + " + 물";
    }
}