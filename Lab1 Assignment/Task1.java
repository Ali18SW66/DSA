class Employee
{	
        //instance Variables
	int noOfHours;
	double salary;
        //Method for getting Information i.e salary and no of hours
	public void getInfo(double salary,int noOfHours)
	{
		this.noOfHours=noOfHours;
		this.salary=salary;
	}
        //Method that would check salary and increment it according to condition
	public void addSal()
	{
		if(salary<500)
		{
			salary+=10;
		}
	}
        //Method that would add in salary according to no Of Hours
	public void addWork()
	{
		if(noOfHours>6)
		{
			salary+=5;
		}
	}
        //Method that would print salary
	public void printSalary()
	{
		System.out.println("Final Salary is "+salary);
	}
        //Main Method
	public static void main(String args[])
	{
		Employee emp1=new Employee();
		emp1.getInfo(400,4);
		emp1.addSal();
		emp1.addWork();
		emp1.printSalary();
	}

}
