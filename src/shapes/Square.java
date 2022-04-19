package shapes;

public class Square extends Rectangle {


    public Square(int side) {

        //invoke constructor
//        since extended we can use super

        super(side, side);

    }

//    In the Square class, override the getArea and getPerimeter methods with
//    the following definitions for a square
//
//    perimeter = 4 x side
//    area = side ^ 2

    @Override
    public int getPerimeter() {
        System.out.println("square");
        return this.length * 4;

    }

//    @Override
//    public int getArea() {
//
//
//    }

    @Override
    public String toString() {
        return "Square{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }




}
