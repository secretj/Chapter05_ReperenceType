package training;

public class ArrayMinMaxExample {

	public static void main(String[] args) {
		// int�� 1���� �迭�� �Ű������� ���޹޾Ƽ� �迭�� �����
		// �ִ�, �ּڰ��� ã�Ƽ� ��ȯ�ϴ� �޼��带 ���� ������ 
		// ���·� �����Ͻÿ�
		
		
		
		int[] arr= {1,2,3,4,5,6,7,8,9};
		System.out.println(minValue(arr));
		System.out.println(maxValue(arr));
		
	}

	public static int minValue(int[] abc) {
		
		int min =abc[0];
		for(int i=0; i<abc.length; i++) {
			if(i>=1&&abc[i]<abc[i-1]) {
				min=abc[i];}
			
			}
		return min;
			
		}
		
		
	
	public static int maxValue(int[] abc) {
		
		int max=abc[0];
		for(int i=0; i<abc.length; i++) {
/*			if(i>=1&&abc[i]>abc[i-1]) {
				max=abc[i];}
					
	}                                      */
			if(abc[i]>max) {
				max=abc[i];
			}
		}
		return max;
	}
}
	



	

