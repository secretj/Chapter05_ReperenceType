package ch05_1_reference_variable;

public class StringEqualsExample {

	public static void main(String[] args) {
		String str1 = "java";
		String str2 = "java";
		
		String str3 =new String("java");  //new�ϸ� ���ο� �ּҸ� ������
		String str4 =new String("java");  // ���������� �� �ּ��Ҵ�.
		
		System.out.println(str1==str2);
		System.out.println(str1==str3);
		System.out.println(str3==str4);
		
	}

}
