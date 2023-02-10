package org.abstraction;

// we use abstraction to hide away implementation details, abstract class cannot be instantiated, but be subclassed
// abstract class can have both abstract methods and concrete methods
// java does not support multiple inheritance, due to the problem of DDD(Deadly Diamond of Death) but we can use interface for multiple inheritance
public abstract class GraphicObject {
    int x, y;

    void moveTo(int newX, int newY) {
        System.out.println("Move to x: " + x + " and y: " + y);
    }

    abstract void draw();

    abstract void resize();

    public static void main(String[] args) {
        GraphicObject circle = new Circle();
        circle.draw();
        circle.resize();

        GraphicObject rectangle1 = new Rectangle();
        rectangle1.draw();
        rectangle1.resize();

        Rectangle rectangle2 = new Rectangle();
        rectangle2.draw();
        rectangle2.resize();

        rectangle1 = new Circle();
        rectangle1.draw();
        rectangle1.resize();

//        rectangle2 = new Circle(); // error
    }
}
