package Project;

//*****************************************************
//The purpose of this class is to act as a superclass for
//the Manager and Executive classes. It features a 
//constructor and method which prints name and age
//******************************************************

/** An abstract class representing an employee with a name and age. */
abstract class Employee {
	/**Instance variables*/
	private String name; //name of employee type String
	private int age; //salary of employee type double

	/**
	 * Constructor for Employee objects which sets name and age
		 */
	public Employee(String name, int age){
		this.name=name; //set object name to argument
		this.age=age; //set object salary to argument
	}
	
	
	
	/**
	 * method which prints class name, employee name, and salary
	 * returns class name, employee name, and his/her age
	 */
	public String toString(){
		return getClass().getName() +" "+  name + "'s " + "age is " + age  ;
	}
}
