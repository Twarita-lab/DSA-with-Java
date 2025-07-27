package basics;

import java.util.Stack;

public class Stack_AlgorithmsForComplexOperations {

	public Stack<Integer> reverseStackValue(Stack<Integer> S) {
		Stack<Integer> S2 = new Stack<>();

		while (!S.isEmpty()) {

			S2.push(S.peek());
			S.pop();

		}

		return S2;
	}

	public static void main(String[] args) {
		Stack<Integer> S1 = new Stack<>();
		S1.push(4);
		S1.push(6);
		S1.push(1);
		S1.push(9);
		System.out.println("Orginal S1 is " + S1);

		Stack_AlgorithmsForComplexOperations sa = new Stack_AlgorithmsForComplexOperations();

		// Reverse Stack
		S1 = sa.reverseStackValue(sa.reverseStackValue((sa.reverseStackValue(S1))));

		System.out.println("Reversed S1 is " + S1);

		// Push a new value at given index
		int value = 10;
		int index = 0;

		S1 = sa.pushValueIntheMiddleBasedOnGivenIndex(S1, value, index);
		System.out.println("S1 after pushing value at given index " + S1);

		System.out.println("Minimum element of staack S1 is " + sa.minValue(S1));

		System.out.println("Stack " + S1 + " after sorting is " + sa.sort(S1));

		String s = "[2+{2*3}]+(2+3)";

		System.out.println("String s " + s + " is " + sa.isBalanced(s));

	}

	public boolean isBalanced(String s) {
		Stack<Character> temp = new Stack<>();
		
		for (char c : s.toCharArray()) {
			System.out.println(c);
			if (c == '[' || c == '{' || c == '(') {
				temp.push(c);
			} else if ((c == ']' || c == '}' || c == ')') && temp.isEmpty())
				return false;
			else if (c == ']' || c == '}' || c == ')') {
				char top = temp.pop();
				if ((c == ']' && top != '[') || (c == '}' && top != '{') || (c == ')' && top != '('))
					return false;
			}

		}

		return temp.isEmpty();
	}

	public Stack<Integer> sort(Stack<Integer> s) {
		Stack<Integer> temp = new Stack<>();

		int x;

		while (!s.isEmpty()) {

			x = s.pop();
			while (!temp.isEmpty() && temp.peek() > x) {

				s.push(temp.peek());
				temp.pop();

			}
			temp.push(x);

		}
		;

		return temp;
	}

	public int minValue(Stack<Integer> s1) {
		// TODO Auto-generated method stub
		int min = 246774484;
		Stack<Integer> temp = new Stack<>();
		while (!s1.isEmpty()) {
			if (min > s1.peek())
				min = s1.peek();
			temp.push(s1.peek());
			s1.pop();
		}
		;

		while (!temp.isEmpty()) {

			s1.push(temp.peek());
			temp.pop();
		}

		return min;
	}

	public Stack<Integer> pushValueIntheMiddleBasedOnGivenIndex(Stack<Integer> s1, int value, int index) {
		// TODO Auto-generated method stub
		Stack<Integer> s2 = new Stack<Integer>();
		int count = s1.size() - index;
		for (int i = 0; i < count; i++) {
			s2.push(s1.peek());
			s1.pop();
		}
		s1.push(value);
		while (!s2.isEmpty()) {
			s1.push(s2.peek());
			s2.pop();
		}

		return s1;
	}

}
