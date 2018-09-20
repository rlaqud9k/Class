import java.util.Arrays;

public class Ex07 {

	public static void main(String[] args) {
		//클래스 Array-배열복사,정렬,검색 1차원일때사용 2차원은 방법이 다름
		//1차원 배열은 값이들어가지만 2차원배열은 1차원에 주소가 들어가는것임
		
		char arr[]= {'j','A','v','A','P','R','O','G','R','A','M'};
		//Object clone()
		char[]str1=arr.clone();//1
		for(char ch:str1)
			System.out.print(ch+"\t");
		System.out.println();
		//System.arraycopy()//2
		char[]str2 = new char[arr.length];
		for(char ch:str1)
			System.out.print(ch+"\t");
		System.out.println();
		System.arraycopy(arr, 0, str2, 0, arr.length);
		for(char ch:str2)
			System.out.print(ch+"\t");
		System.out.println();
		//Arrays.copyOfRange();
		char[]str3=Arrays.copyOf(arr, arr.length);
		for(char ch:str3)
			System.out.print(ch+"\t");
		System.out.println();
		char[]str4=Arrays.copyOfRange(arr, 0, 2);
		for(char ch:str4)
			System.out.print(ch+"\t");
		
		System.out.println();
		}

}
