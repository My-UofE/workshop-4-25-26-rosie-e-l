// An application to create and manipulate circles
public class CircleApp{
    public static void main(String [] args){
        System.out.println("Creating myCircle1");

        Circle c1;
        c1 = new Circle(0,0,4);

        System.out.println("\nMoving c1");
		c1.move(0,10);//the object's state is changed
		System.out.println("Origin is: "+c1.originX+","+c1.originY);

        System.out.println("Changing radius of c1");
		c1.radius = 16;//the object's state is changed
		System.out.println("Radius: "+c1.radius);

        //creating second circle
        c2 = new Circle(0,0,4);

        System.out.println( "c1 overlaps c2: " + c1.isOverlappedWith(c2) ) ;
        System.out.println(" c1 is enclosed by c2: " + c1.isEnclosedBy(c2));
        System.out.println(toString());





    }
}