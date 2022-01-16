package core.programs;

public class Moverload {

	public static void main(String[] args) 
	{
	   calculate (10,20);
	   calculate (3.14f, 2);
	   calculate (3.14,3);
	}
	public static void calculate (int a, int b)
	{
		System.out.println(a+b);
	}
	public static void calculate(float f,int r)
	{
		System.out.println("Area of circle is " +f*r*r);
	}
	public static void calculate(double l,int w)
	{
		System.out.println("Area of rectangle is " +l*w);
	}

}
