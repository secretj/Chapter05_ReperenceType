package ch05_2_array;

public class ArrayCreateByValueListExample2 {

	public static void main(String[] args) {
		int[] score= {82,90,10};
		score = new int[] {83, 90, 87, 10};  		//배열의 수를 늘릴 수도있음 
		
		int sum1 =0;
		for(int i=0; i<=3; i++) {
			sum1+=score[i];
		}
		System.out.println("총합:"+ sum1);
		
		int sum2=add(new int[]{1,2,3,4,5,6,7,8,9,10});    //메소드안에 배열수랑 무조건 같아야함
		System.out.println("총합 :"+sum2);
		System.out.println();
	

	}

	private static int add(int[] abc) {
		
		int sum=0;
		for(int i=0; i<10; i++) {
			sum+=abc[i];
		}
		
		return sum; 				//반환한다 ? 왜 ?
	}

}
