package ch05_2_array;

public class ArrayCopyExample {
//문자열 배열복사
	public static void main(String[] args) {
		
		String[] oldStrArray= {"인정이","더키","덕복이"};
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
