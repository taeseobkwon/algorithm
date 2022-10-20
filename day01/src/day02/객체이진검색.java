package day02;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
public class 객체이진검색 {
	public static void main(String[] args) {
	   //1. Student 클래스를 객체화하여서 배열에 담아 둔다
		Student[] sArr = { new Student("강민하", 162, 0.3),
						   new Student("이수연", 172, 0.5),
						   new Student("황지인", 156, 1.0),
						   new Student("김찬우", 173, 1.2) };
		
		//2. 검색해줄 키값을 입력을 받는다.
         Scanner sc = new Scanner(System.in);
         System.out.println("찾고 싶은 키를 입력해 주세요");
         int key = sc.nextInt();
        // int idx = Arrays.binarySearch(sArr, key); error why 주소를 찾는게 아니라 객체의 필드인 키를 찾아야 함
         int idx = Arrays.binarySearch(sArr, new Student("", key, 0.0), Student.HEIGHT_ORDER);
         if(idx < 0) System.out.println(key + "키는 없습니다");
         else {
        	 System.out.println("그값은 " + idx + "에 있습니다.");
        	 System.out.println("찾는 데이터는 " + sArr[idx] + " 입니다");
         }
	}
}
class Student{
	String name;//이름
	int height;//키
	double vision;//시력
	
	public Student(String name, int height, double vision) {
		this.name = name;
		this.height = height;
		this.vision = vision;
	}
	//최상위 클래스인 Object 클래스의 메소드인 toString()를 재정의해서
	//자식 클래스에서 참조변수를 출력해줄 때 넣고 싶은 것을 코드 구현할 수 있다.
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + " " + height + " " + vision;
	}
		
	//상수처리
	public static final Comparator<Student>  HEIGHT_ORDER = new HeightComparator();
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public double getVision() {
		return vision;
	}
	public void setVision(double vision) {
		this.vision = vision;
	}
	
	
	
	
}
class HeightComparator implements Comparator<Student>{
	// o1은 이미 들어간 자료 o2는 새로 들어올 자료
	@Override
	public int compare(Student o1, Student o2) {
		System.out.println("이곳은 키를 정렬하기 위한 기준을 셋팅하는 부분임 ~~ ");
		return  (o1.height > o2.height) ? 1 :  (o1.height ==  o2.height)  ? 0 : -1 ;
		// 또는 return (o1.height - o2.height);
	}
}
