public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle("Circle");
        Shape cube = new Cube("Cube");
        Shape pentagon = new Pentagon("Pentagon");
        Shape quad = new Quad("Quad");
        Shape rectangle = new Rectangle("Rectangle");
        Shape triangle = new Triangle("Triangle");

        PrintName.printName(circle);
        PrintName.printName(cube);
        PrintName.printName(pentagon);
        PrintName.printName(quad);
        PrintName.printName(rectangle);
        PrintName.printName(triangle);
    }
}