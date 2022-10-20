package day02;

public class IdTester119 {

	public static void main(String[] args) {
	Id.getCounter(); // 정적 메서드 호출 방법은 클래스명.메서드명()
	
	Id a = new Id();	
	Id b = new Id();	
	a.getId(); // 인스턴스 메서드 호출 방법은 참조변수, 메서드명()
	b.getId();

	}

}

class Id{
	private static int counter=0; // 정적 변수 선언 컴파일하자 바로 메모리 올라감
	private int id; // 인스턴스(객체)변수 new로 인스턴스한 후에 힙 메모리에 올라감(할당됨)
	static{
		System.out.println("이곳은 정적 불록");
	}
	{
		System.out.println("블록 부분임");
	}
	public Id() {
		id = ++counter;
		System.out.println("생성자 부분임");
	}
	public static int getCounter() {return counter;} // 정적 메서드
	public int getId() {return id;};
}