package com.example.javadesignpatterns.decorator;

class MilkDecorator extends CoffeeDecorator {

    public MilkDecorator(CoffeeDecorator decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.5;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", with Milk";
    }
}
