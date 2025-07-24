package basics;

import java.util.Stack;

public class Stack_javaInBuildMethods {

	public static void main(String[] args) {
		
		Stack<Integer> newStack = new Stack<>();
		
		//Same as Push Operation
		//Part of List interface
		newStack.add(10);
		System.out.println("Stack after add(element) operation "+newStack);
		
		//Adding element at specified index
		newStack.add(0, 20);
		System.out.println("Stack after add(index,element) operation "+newStack);
		
		//Adding a collection at the end of the stack
		newStack.addAll(newStack);
		System.out.println("Stack after addAll(collections) operations "+newStack);
		
		//Adding a collection at specified index of the stack
		newStack.addAll(1, newStack);
		System.out.println("Stack after addAll(index, collections) operations "+newStack);
		
		//Similar to add or push operation
		newStack.addElement(1);
		System.out.println("Stack after addElement(element) operations "+newStack);
		
		//Always returning 10
		//System.out.println("Current Stack length with capacity() method "+newStack.capacity());
		
		//Clear stack content
		newStack.clear();
		System.out.println("Stack after executing clear() operation "+newStack);
		
		//check if Stack contains specific element
		System.out.println("Check if stack contains specific element "+newStack.contains(10));

		
	}

}
