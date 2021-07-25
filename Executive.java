package Project;

//*****************************************************
//The purpose of this class is to act as a subclass for
//the Employee class and Manager class;  In its constructor it calls
//the Manager superclass constructor
//******************************************************

/** A class representing an executive with a name, salary, and department. */
public class Executive extends Manager{
	
	/**
	 * constructor which creates Executive objects with name, age, salary, department
	 */
	public Executive(String name, int age, String department, double salary){
		/** call superclass constructor with parameters from argument
		 * of Executive constructor */
		super(name, age, department, salary);
	}
	
	//overloading 
	public void work(double salary) {
		System.out.println("Executive is working for Rs." + salary);
	}
}

//Concepts used in this project 
//Abstraction- Classes.
//Scope and Lifetime of variables.
//Declaring objects.
//Instance Variables of different data types.
//Constructors/Methods.
//'this' keyword.
//Inheritance.
//Overloading (Constructors/Methods)
//Overriding.
//Objects as parameters.
//Access control mechanism.
//Use of 'super'.
//Packages
