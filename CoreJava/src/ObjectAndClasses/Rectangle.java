package ObjectAndClasses;

public class Rectangle {
	public double length;
    public double breadth;
    public Rectangle(double length, double breadth) {
    		this.length = length;
    		this.breadth = breadth;
	}

  public double getArea()
    {
        return length * breadth;
    }

   public double getPerimeter()
    {
        return 2 * (length + breadth);
    }
}

