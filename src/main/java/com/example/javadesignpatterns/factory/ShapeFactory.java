package com.example.javadesignpatterns.factory;

class ShapeFactory {

    public Shape createShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("circle")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        }
        return null; // Return null for unsupported shape types
    }
}
