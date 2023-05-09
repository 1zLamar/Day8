public class Square extends Rectangle{

    public Square() {
        super();
    }
    public Square(double side){

    }
    public Square(String color, boolean filled,double side){
        super(color,filled,side,side);
    }

    public double getSide(){
        return getWidth();
    }

    public void setSide(double side){
        setWidth(side);
        setLength(side);
    }

    @Override
    public String toString() {
        return "A Square with side= "+getSide()
                + " color is "+getColor()
                + " and Area= "+getArea()+
                " and Perimeter= "+getPerimeter();
    }
}
