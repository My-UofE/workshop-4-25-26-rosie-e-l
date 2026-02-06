//A circle class
public class Circle(){
    private double radius;
    private double originX;
    private double originY;

    //getters and setters
    public double getRadius(){
        return radius;
    }
    public double getOriginX(){
        return originX;
    }
    public double getOriginY(){
        return originY;
    }

    public void setRadius(double radius){
        if radius > 0{
            this.radius = radius;
        }
    }
    public void setOriginX(double originX){
        this.originX = originX;
    }
    public void setOriginY(double originY){
        this.originY = originY;
    }

    //other methods:
    public double getArea(){
        return 3.14 * radius * radius;
    }

    public double getCircumference(){
        return 2 * 3.14 * radius;
    }

    public void move(double dx, double dy){
        originX += dx;
        originY += dy;
    }

    public String toString(){
        return "Circle[x="+originX+",y="+originY+",radius="+radius+"]";
  }

    public boolean isOverlappedWith(Circle c){
        if (this.originX == c.originX) && (this.originY == c.originY){
            return true;
        }else
            return false;
    }

    public boolean isEnclosedBy(Circle c){
        if (this.radius > c.radius) && (this.isOverlappedWith(Circle c) == true){
            return true
        }else{
            return false
        }
    }

}