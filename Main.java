package Project;

//*****************************************************
//The purpose of this class is to test the constructors
//and methods of the Manager, and Executive
//classes by creating corresponding objects and calling
//the methods. We can input the salary of manager and executive from the user.
//******************************************************

import java.util.Scanner;
/** test the class constructors and methods for  Manager, Executive classes*/
public class Main  {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		
			
		System.out.println("Enter the details for manager");
		
		System.out.println("Enter the name of manager");
		String mname = sc.next();
		
		System.out.println("Enter the age of manager");
		int mage = sc.nextInt();
		
		System.out.println("Enter the name of manager's department");
		String mdept = sc.next();
		
		
		System.out.println("Enter the base salary for manager");
		double msalary = sc.nextDouble();
//		//sc.close();
		
		
		
		System.out.println("Enter the details for executive");
		
		System.out.println("Enter the name of executive");
		String ename = sc.next();
		
		System.out.println("Enter the age of executive");
		int eage = sc.nextInt();
		
		System.out.println("Enter the name of executive's department");
		String edept = sc.next();
		
		
		System.out.println("Enter the base salary for executive");
		double esalary = sc.nextDouble();
		
		sc.close();
		
		/** Create object of type Manager with arguments for name, age , department, salary*/
		Manager mang1 = new Manager(mname, mage, mdept, msalary);
		/** Create object of type Executive with arguments for name, age , department, salary*/
		Executive exec1 = new Executive(ename, eage, edept, esalary); 
		
		/** Call all toString() methods for Employee, Manager, and Executive classes*/
		//System.out.println(empl1.toString());
		System.out.println(mang1.toString());
		mang1.work();
		System.out.println(exec1.toString());
		exec1.work(esalary);
		
	}
}

