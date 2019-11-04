//Importing Pacakge
import java.util.Scanner;
class Area
{	
        //Instance Variable
        int area;
        //Class Variable
	static Scanner sc=new Scanner(System.in);
	//Parametrized Constructor that would take length and breath as its perameter and calculate area
	public Area(int len,int bth)
	{
		area=len*bth;
	}
        //Method that would return area
	public double getArea()
	{
		return area;
	}
        //Main Method
	public static void main(String[] args)
	{
		int length,breadth;
		System.out.println("Enter Length");
		length=sc.nextInt();
		System.out.println("Enter Breadth");
		breadth=sc.nextInt();
		Area area=new Area(length,breadth);
		System.out.println("Area of Rectangle is "+area.getArea());
	}

}
