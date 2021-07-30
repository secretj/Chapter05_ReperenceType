package ch05_Test;

public class test01 {

	public static void main(String[] args) {
		int[][] arr=new int[5][5];
		for(int i=0; i<arr.length; i++) {
			for(int k=0; k<arr[i].length; k++) {
				arr[i][k]=10*k*i;
				if(i==0) {
					arr[i][k]=10*k;
					System.out.println("("+arr[i][k]+")");
				}else {
				System.out.println("("+arr[i][k]+")");
			}
			}	
		}
	}

}
