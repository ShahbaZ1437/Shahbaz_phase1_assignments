package core.programs;

public class CoverLoad 
{
	int i=3;
	int j=4;
	int k=(int)3.14;
	rhombus(2,4);
	
	CoverLoad()
	{
	    }
	CoverLoad(int i)
	{
		
	    }
	CoverLoad(int i, int j)
	{
		System.out.println("Area of rectangle is "+i*j);
	    }
	CoverLoad(float k,int i)
	{
		System.out.println("Area of Circle is " +k*i*i);
	    }
	public void rhombus(int a,int b)
	{
		System.out.println("Area of rhombus is "+a*b/2);
	}

	public void main(String[] args) {
		
	   CoverLoad c1= new CoverLoad(+i*i);
	   
	   c1.display();
	}

}
