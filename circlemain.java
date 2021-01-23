// Java program to create circle class for calculating area.

class Circle
{
	//private instance variables
	private double radius;
	private String color;

	Circle()
	{
		radius = 1.0;
		color = "red";
	}
	Circle(double radius)
	{
		this.radius = radius;
		color = "red";
	}
	Circle(double radius, String color)
	{
		this.radius = radius;
		this.color = color;
	}
	public double getRadius()
	{
		return radius;
	}
	public String getColor()
	{
		return color;
	}
	public void setRadius(double radius)
	{
		this.radius = radius;
	}
	public void setColor(String color)
	{
		this.color = color;
	}
	public double getArea()
	{
		return (Math.PI*radius*radius);
	}
	public String toString()
	{
		return "Circle[radius=" + radius + " color=" + color + "]";
	}
}

class circlemain
{
	public static void main(String[] args)
	{
		double r1;
		String clr1;
		Circle c1 = new Circle();	//default constructor invoked.
		Circle c2 = new Circle(2.5);	//parameterized constructor invoked.
		Circle c3 = new Circle(3.5,"blue");	//parameterized constructor invoked.
		r1 = c1.getRadius();	//getRadius() call
		clr1 = c1.getColor();	//getColor() call
		System.out.println("The radius of first circe is " + r1 + " and color of first circle is " + clr1);
		System.out.println("Area of the first circle is " + c1.getArea());
		System.out.println(c1.toString());
		System.out.println("---------------------------------------------------------------------------");
		System.out.println("The radius of second circe is " + c2.getRadius() + " and color of second circle is " + c2.getColor());
		System.out.println("Area of the second circle is " + c2.getArea());
		System.out.println(c2);
		System.out.println("---------------------------------------------------------------------");
		System.out.println("The radius of third circe is " + c3.getRadius() + " and color of third circle is " + c3.getColor());
		System.out.println("Area of the third circle is " + c3.getArea());
		System.out.println(c3);
		System.out.println("---------------------------------------------------------------------------");
		Circle c4 = new Circle();
		c4.setRadius(4.5);
		c4.setColor("Purple");
		System.out.println("The radius of fourth circe is " + c4.getRadius() + " and color of fourth circle is " + c4.getColor());
		System.out.println("Area of the fourth circle is " + c4.getArea());
		System.out.println(c4);
		System.out.println("---------------------------------------------------------------------------");
		Circle c5 = new Circle(5.5);
		System.out.println(c5.toString());   //explicit call to toString().
		Circle c6 = new Circle(6.5,"green");
		System.out.println(c6);             // println() calls toString() implicitly, same as above
		System.out.println("Operator '+' invokes toString() too: " + c6);  // '+' invokes toString() too
		System.out.println("----------------------------------------------------------------------------");
	}
}