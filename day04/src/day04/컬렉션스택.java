package day04;

import java.util.Stack;

public class 컬렉션스택 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(90);
		stack.push(91);
		stack.push(92);
		stack.push(90);
		
		System.out.println( stack.pop());
		System.out.println( stack.pop());
		System.out.println( stack.pop());
		System.out.println( stack.pop());
		
		while ( !stack.isEmpty()) {
			System.out.println( stack.pop());
		}
	}

}
