// A Rectangle class
public class Rectangle {
  
  // 4 instance attributes
  private double width;
  private double height;
  private double originX = 0.0;
  private double originY = 0.0;

  // 1 static attributes
  public static final int NUMBER_OF_SIDES = 4;

  //getters and setters:
  public double getWidth(){
    return width;
  }
  public double getHeight(){
    return height;
  }
  public double getOriginX(){
    return originX;
  }
  public double getOriginY(){
    return originY;
  }

  public void setWidth(double width){
    if width < 0{
      //pass
    } else{
        this.width = width;
    }
  }
  public void setHeight(double height){
    if height < 0{
      //pass
    } else{
        this.height = height;
    }  
  }
  public void setOriginX(double originX){
    this.originX = originX;
  }
  public void setOriginY(double originY){
    this.originY = originY;
  }




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

  // Return a description of a rectangle in the form of
  // Rectangle[x=*,y=*,w=*,h=*]
  public String toString(){
    return "Rectangle[x="+originX+",y="+originY+",w="+width+",h="+height+"]";
  }
  
}
