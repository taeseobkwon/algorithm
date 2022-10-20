package day01;

public class Q11 {

	public static void main(String[] args) {
		System.out.printf("%3s", "     |");
		for (int i = 1; i < 10; i++)
			System.out.printf("%3s", i);
		System.out.println();
		System.out.println("-----+----------------------------");
		for (int i = 1; i < 10; i++) {
			System.out.printf("%3d", i);
			System.out.printf("%3s", "|");
			for(int j = 1; j < 10; j++) {
				System.out.printf("%3d", i * j);
			}
			System.out.println();
		}

	}

}
