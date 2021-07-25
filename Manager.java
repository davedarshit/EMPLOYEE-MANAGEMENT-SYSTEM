package Project;

//*****************************************************

//The purpose of this class is to act as a subclass for
//the Employee class and a superclass for the Executive
//class. It represents a blueprint for employees who
//are managers and has a constructor as well as a toString
//method for returning manager name, salary, and department
//******************************************************

/** A class representing a manager with a name, salary, and department. */
public class Manager extends Employee{
	/**Instance variables*/
	private String department; //department manager works in, type String
	private double salary;   
	
	/**
	 * constructor which creates Manager objects with name, age, salary, dept.
	 */
	public Manager(String name, int age, String department, double salary){
		super(name, age); //call parent constructor with arguments name, age
		this.department = department; //set object department to argument
		this.salary = salary; // set object salary to argument
	}
	
	public void work() {
		System.out.println("Manager is working...");
	}
	/**
	 * method calls parent toString() method and appends manager department name and his salary
	 *returns manager name, manager age, manager salary, manager department
	 *using overriding 
	 */
	public String toString(){
		return super.toString() + " and department is " + this.department + " and salary is " + this.salary;
	}
}
