package ch05_1_reference_variable;

public class StringEqualsExample2 {

	public static void main(String[] args) {
		String str1="������";
		String str2="������";
		
		if(str1 == str2) {
			System.out.println("str1�� str2�� ������ ����");
		}else {
			System.out.println("str1�� str2�� ������ �ٸ�");
		}
		
		String str3 = new String("������");
		String str4 = new String("������");
		
		if(str3 == str4) {
			System.out.println("str3�� str4�� ������ ����");
		}else {
			System.out.println("str3�� str4�� ������ �ٸ�");
		}
		
		if(str3.equals(str4)) {													//���ڿ� ��
			System.out.println(("str3�� str4�� ���ڿ��� ����."));
		}
		}
		
	}

