public class Circle extends Shape{

    double radius=1.0;

    public Circle() {
    }

    public Circle(String color, boolean filled,double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return radius*3.14;
    }

    public double getPerimeter(){
        return 2*Math.PI*radius;
    }

    @Override
    public String toString() {
        return "A Circle with radius= " +radius+
                " Area= "+getArea()+
                " and Perimeter= "+getPerimeter();

    }

}
