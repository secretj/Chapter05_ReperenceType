package ch05_2_array;

public class ArrayCopyExample {
//���ڿ� �迭����
	public static void main(String[] args) {
		
		String[] oldStrArray= {"������","��Ű","������"};
		String[] newStrArray= new String[6];
		
		//System.arraycopy(oldStrArray,0,newStrArray,2,oldStrArray.length);
	
	
	for(int i=0; i<oldStrArray.length; i++ ) {
		
		newStrArray[i]=oldStrArray[i];
		
		
	}
	for(int i=0; i<newStrArray.length; i++) {
	System.out.println(newStrArray[i]);

}
}
}
