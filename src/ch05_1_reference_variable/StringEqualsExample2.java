package ch05_1_reference_variable;

public class StringEqualsExample2 {

	public static void main(String[] args) {
		String str1="박진형";
		String str2="박진형";
		
		if(str1 == str2) {
			System.out.println("str1과 str2는 참조가 같음");
		}else {
			System.out.println("str1과 str2는 참조가 다름");
		}
		
		String str3 = new String("박진형");
		String str4 = new String("박진형");
		
		if(str3 == str4) {
			System.out.println("str3과 str4는 참조가 같음");
		}else {
			System.out.println("str3과 str4는 참조가 다름");
		}
		
		if(str3.equals(str4)) {													//문자열 비교
			System.out.println(("str3와 str4는 문자열이 같음."));
		}
		}
		
	}

