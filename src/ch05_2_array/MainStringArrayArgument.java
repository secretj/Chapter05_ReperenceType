package ch05_2_array;

public class MainStringArrayArgument {

	public static void main(String[] args) {
		if(args.length!=2) {
			System.out.println("값의 수가 부족합니다.");
			System.exit(0);
		
		}
		String str1=args[0];
		String str2=args[1];
		
		int n1=Integer.parseInt(str1);
		int n2=Integer.parseInt(str2);
		
		int result = n1 + n2;
		System.out.println(n1+ "+"+ n2 +"="+result);
		
		
	}

}
