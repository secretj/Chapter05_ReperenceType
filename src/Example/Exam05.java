package Example;

public class Exam05 {

	public static void main(String[] args) {
		int[][] array= {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}		
		};
		
		int sum= 0;
		double avg =0.0;
		
		int x=0;
		for(int i=0; i<array.length; i++) {
			for(int k=0; k<array[i].length; k++) {
				sum+=array[i][k];
				x++;         //다차원배열 총갯수 코딩하는법
			}
		
		avg=(double)sum/x;
		}
		
	
		System.out.println(sum);
		System.out.println(avg);
		
		

	}

}
