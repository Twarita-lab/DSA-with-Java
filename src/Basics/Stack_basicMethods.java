package basics;

import java.util.Stack;

public class Stack_basicMethods {

	public static void main(String[] args) {
		
		Stack<Integer> newStack = new Stack<Integer>();
		
		//If Stack has anything
		System.out.println(newStack.isEmpty());
		
		//If Stack is full
		//System.out.println(newStack.is);
		
		//Adding element to stack
		newStack.push(10);
		newStack.push(20);
		
		
		//Printing STcak
		System.out.println(newStack);
		
		//Checking last ement value of stack
		System.out.println(newStack.peek());
		
		//removing last element from stack
		newStack.pop();
		
		System.out.println(newStack);

	}

}
