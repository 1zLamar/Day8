// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Rectangle r1= new Rectangle("Orange",true,10.0,20.0);
        System.out.println(r1.toString());
        System.out.println();

        Circle c1 = new Circle("red",true,5);
        System.out.println(c1.toString());
        System.out.println();

        Square s1=new Square("yellow",false,2.4);
        System.out.println(s1.toString());

    }
}