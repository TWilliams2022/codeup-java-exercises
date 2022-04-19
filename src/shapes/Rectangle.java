package shapes;

public class Rectangle {

    //    Protected properties for both length and width.
    //PROPERTIES
    protected int length;
    protected int width;

    //    Rectangle should define a constructor that accepts two numbers for
    //    length andwidth,
    // CONSTRUCTOR
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }
//########################################################

    //get & set length

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
//########################################################

    //get & set width

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
//########################################################

   /*Create two methods on the Rectangle class, getArea and getPerimeter
    that return the respective values.*/

    public int getArea() {
        int area = this.length * this.width;
        return area;
    }

    public int getPerimeter() {
        int perimeter = (2 * this.length) + (this.width * 2);
        return perimeter;
    }
//########################################################

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }




}
