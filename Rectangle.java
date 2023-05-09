public class Rectangle extends Shape{

    double width=1.0;
    double length=1.0;

    public Rectangle() {
    }

    public Rectangle(String color, boolean filled,double width, double length) {
        this.color=color;
        this.filled=filled;
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea(){
        return length*width;
    }

    public double getPerimeter(){
        return 2*(length+width);
    }

    @Override
    public String toString() {
        return "A Rectangle with " +
                "width= " + width +
                " and length= " + length
                +" color is "+color
                + " and Area= "+getArea()+
                " and Perimeter= "+getPerimeter();
    }
}
