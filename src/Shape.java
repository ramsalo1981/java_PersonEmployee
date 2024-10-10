public class Shape {
    /*private double Width;
    private double Length;*/
    // use protected for allowing another class that inherits from super class
    protected double Width;
    protected double Length;


    public Shape() {
    }

    public Shape(double width, double length) {
        Width = width;
        Length = length;
    }

    public void setWidth(double width) {
        Width = width;
    }

    public void setLength(double length) {
        Length = length;
    }

    public double getWidth() {
        return Width;
    }

    public double getLength() {
        return Length;
    }
}
