// A Rectangle class
public class Rectangle {
  
  // 4 instance attributes
  public double width;
  public double height;
  public double originX = 0.0;
  public double originY = 0.0;

  // 1 static attributes
  public static final int NUMBER_OF_SIDES = 4;

  // main constructor
  public Rectangle(double width, double height, double originX, double originY) {
    this.width = width;
    this.height = height;
    this.originX = originX;
    this.originY = originY;
  }

  // second constructor: 
  //allows us to instantiate a rectangle without providing all four arguements
  public Rectangle(double width, double height) {
    this(width, height, 0, 0);
  }

  //third constructor:
  //without providing any arguments
  public Rectangle(){
    width = 1;
    height = 1;
    originX = 0;
    originY = 0;
  }

  // method: move the rectangle
  public void move(double dx, double dy) {
	   originX += dx;
	   originY += dy;
  }

  // method: compute the area of the rectangle
  public double getArea() {
    return width * height;
  }
  
  // method: compute the area of the rectangle
  public double getPerimeter() {
    return 2 * (width + height);
  }

  public void scale(double scaleX, double scaleY){
    width = width * scaleX;
    height = height * scaleY;
  }

  public void scale(double scaleBoth){
    width = width * scaleBoth;
    height = height * scaleBoth;
  }

  public boolean isOverlapped(Rectangle r){
    if (this.originX == r.originX) && (this.originY == r.originY){
      return true;
    }else
      return false;
  }

  public static boolean areOverlapping(Rectangle r1, Rectangle r2){
    return r1.isOverlapped(r2);
  }

  public double calcRatio(Rectangle r){
    return this.width / this.height;
  }

  public double isSquare(Rectangle r){
    if (this.height == this.width){
      return true;
    }
  }
  
}
