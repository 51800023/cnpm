public class Employee
{
	private int id;
	private String firstName;
	private String lastName;
	private int salary;
	public Employee(int id , String firstName , String lastName , int salary)
	{
		this.id = id;
		this.firstName =new String (firstName);
		this.lastName =new String (lastName);
		this.salary = salary;
	}
	public int getID()
	{
		return id;
	}
	public String getFirstName()
	{
		return firstName;
	}
	public String getLastName()
	{
		return lastName;
	}
	public String getName()
	{
		return "firstName lastName";
	}
	public int getSalary()
	{
		return salary;
	}
	public void setSalary(int salary)
	{
		this.salary = salary;
	}
	public int getAnnualSalary()
	{
		return salary*12;
	}
	public int raiseSalary(int percent)
	{
		return salary + salary * percent;
	}
	public String toString()
	{
		return "Employee[id="+id+" firstName="+firstName+" lastName="+lastName+" salary="+salary+"]";
	}
	public void print()
	{
		System.out.format("id= %d firstName= %s lastName= %s salary= %d",id,firstName,lastName,salary);
	}
}