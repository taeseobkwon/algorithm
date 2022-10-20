package day03;

import java.util.Stack;

public class 컬렉션스택 {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(90);
		stack.push(91);
		stack.push(92);
		stack.push(90);

//		System.out.println(stack.pop()); // 가장 늦게 들어감
//		System.out.println(stack.pop()); // 두번째로 늦게 들어감
//		System.out.println(stack.pop()); // 두번째로 먼저 들어감
//		System.out.println(stack.pop()); // 가장 먼저 들어감

		while (!stack.isEmpty()) {
			System.out.println(stack.pop());
		}

	}

}
