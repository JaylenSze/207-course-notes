public class Rectangle {
    private double width;
    private double height;

    public Rectangle(double w,double h){
        this.width=w;
        this.height=h;
    }

    /**
     * Returns the area of the rectangle
     * @return the area of the rectangle
     */
    public double area(){
        return this.width*this.height;
    }

    /**
     * scales the rectangle
     * @param factor: scales the height and width by factor
     */
    public void scale(double factor) {
      width = width * factor;
      height = height * factor;
    }

    /**
     * Returns whether this rectangle is larger than the other rectangle
     * @param other another rectangle
     * @return whether this rectangle is larger than the other rectangle
     */
    public boolean isLargerThan(Rectangle other){
        if(area() > other.area())
            return true;
        else
            return false;
    }
}
