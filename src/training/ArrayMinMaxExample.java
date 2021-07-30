package training;

public class ArrayMinMaxExample {

	public static void main(String[] args) {
		// int형 1차원 배열을 매개변수로 전달받아서 배열에 저장된
		// 최댓값, 최솟값을 찾아서 반환하는 메서드를 각각 다음의 
		// 형태로 구현하시오
		
		
		
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
	



	

