import java.util.Arrays;

public class Ex07 {

	public static void main(String[] args) {
		//Ŭ���� Array-�迭����,����,�˻� 1�����϶���� 2������ ����� �ٸ�
		//1���� �迭�� ���̵����� 2�����迭�� 1������ �ּҰ� ���°���
		
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
