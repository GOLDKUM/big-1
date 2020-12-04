// java Hello 홍길동 설현
public class Hello {
	public static void main(String[] args) {
		System.out.println("Hello ");
		for(String name : args) {
			System.out.println(name+".");
		}
	}
}
