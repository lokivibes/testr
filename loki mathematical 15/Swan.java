package com.tentatcle.com.tentatcle.maven.eclipse;

//Executing Instance initializer blocks
//-----------------------------------------
//Code between braces is called a code block (some-time called "inside the braces"). 
// Anywhere you see braces is a code block
//sometime code blocks are inside a method. These run when the method is called. 
//Other times, code blocks appear outside a method. "These are called instance initializers"


// Reading and Writing member fields.
public class Swan {
	int numberEggs;	// instance variable
	
	
	
	// sometime code blocks are inside a method. These run when the method is called. 
	public static void main(String[] args) {
		Swan mother = new Swan();
		mother.numberEggs = 1; 	// set variable
		System.out.println(mother.numberEggs); // read variable
		
		// sometime code blocks are inside a method. These run when the method is called. 
		{
			System.out.println("code block inside a method");
		}
	}

	// Other times, code blocks appear outside a method. "These are called instance initializers"
	{
		System.out.println("code block outside a method");
	}
	
	/* There are four(4) code blocks
	 * 		- A class definition
	 * 		- A method declaration
	 * 		- An inner code block
	 * 		- An instance initializer 
	 * */ 	
	// problem statement: balanced parentheses problem - often comes up in job interview

}

//
//class Name {
//	String first = "Loki";
//	String last = "Kabelan";
//	String full = first + last;
//	
//	public static void main(String[] args) {
//		Name name = new Name();	
//		System.out.println(name.full); 	// read values of already initialized fields on a line initializing a new field.
//	}
//}


