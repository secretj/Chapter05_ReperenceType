package ch05_2_array;

public class ArrayInArrayExample {

	public static void main(String[] args) {
		int[][] mS=new int[2][3];
		for(int i=0; i<mS.length; i++) {
			for(int k=0; k<mS[i].length; k++) {
				System.out.println("mS["+i+"]["+k+"]="+mS[i][k]);
			}
		}
		System.out.println();
		
		
		int[][] eS=new int[2][];
		eS[0]=new int[2];
		eS[1]=new int[3];
		
		for(int i=0; i<eS.length; i++) {
			for(int k=0; k<eS[i].length; k++) {
				System.out.println("eS["+i+"]["+k+"]="+eS[i][k]);
				
			}	
		
		}
		System.out.println();
		
		int[][] javaS = {{95,80}, {92,96,80}};
		for(int i=0; i<javaS.length; i++) {
			for(int k=0; k<javaS[i].length; k++) {
				System.out.println("javaS["+i+"]["+k+"]="+javaS[i][k]);
			}
		
	
	}

	}
}
