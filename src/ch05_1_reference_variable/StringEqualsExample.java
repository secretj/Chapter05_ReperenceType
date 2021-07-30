package ch05_1_reference_variable;

public class StringEqualsExample {

	public static void main(String[] args) {
		String str1 = "java";
		String str2 = "java";
		
		String str3 =new String("java");  //new하면 새로운 주소를 지정함
		String str4 =new String("java");  // 마찬가지로 새 주소할당.
		
		System.out.println(str1==str2);
		System.out.println(str1==str3);
		System.out.println(str3==str4);
		
	}

}
