package com.designpattern.structural.decorator;

public class MilkDecorator extends Decorator {
    public MilkDecorator(Component coffeeComponent) {
        super(coffeeComponent);
    }

    @Override
    public String add() {
        // TODO Auto-generated method stub
        return super.add() + " + 우유";
    }
}
