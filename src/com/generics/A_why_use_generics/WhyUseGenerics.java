package com.generics.A_why_use_generics;
import java.util.ArrayList;
import java.util.List;

public class WhyUseGenerics {
	/**
	 * 1. generics enable types(classes and interfaces) to be parameters when defining classes, interfaces and methods.
	 * 2. like the `formal parameters` used in method declarations, `type parameters` provide a way to reuse same code with different inputs.
	 * 3. the inputs to formal parameters are values, while input to type parameters are types.
	 * 
	 * */
	
	public static void main(String[] args) {
		/**
		 * code that uses generics has many benefits over non generic code
		 *  
		 * */
		// 1. Stronger type checking at compile time. A Java compiler applies strong type checking to generic code and issues error if the code violates type safety
		// 2. Elimination of casts. The following code snippet without generics require casting : 
		List list = new ArrayList();
		list.add("hello");
		String string = (String)list.get(0);
		
		// when re-written o use generics, the code does not require casting:
		List<String> list1 = new ArrayList<>();
		list1.add("hello");
		String s = list1.get(0); // no cast
		
		// 3. By using generics programmers can implement generic algorithms that work on collections of different types, can be customized, and are type safe and easier to read
		
	}
	
}
