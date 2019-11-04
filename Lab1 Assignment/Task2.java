//importing package
import java.util.Scanner;
class Area
{
        //Instance Variable
	int area;
        //Class Variable
	static Scanner sc=new Scanner(System.in);
	//Method that would set Dimensions i.e Take length and breadth and set value to area
        public void setDim(int length,int breadth)
	{
		area=length*breadth;
	}
        //Method that would return area calculated
	public double getArea()
	{
		return area;
	}
        //Main Method
	public static void main(String[] args)
	{
                //Local variables of type int
		int length,breadth;
		System.out.println("Enter Length");
                //Taking int as input from user
		length=sc.nextInt();
		System.out.println("Enter Breadth");
		breadth=sc.nextInt();
		Area area1=new Area();
		area1.setDim(length,breadth);
		System.out.println("Area of Rectangle is "+area1.getArea());
	}

}
