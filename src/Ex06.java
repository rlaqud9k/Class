//clone�� ������Ʈ�Ҽ� System.arraycopy();�ý��ۼҼ� �迭����
public class Ex06 {

	public static void main(String[] args) {
		//System.arraycopy(src, srcPos, dest, destPos, length);
		char[]arr= {'��','��','��','��','��','��'};
		char[]str= {'a','b','c','d','e','f'};
		System.out.println("source array");
		for(char ch:arr)
			System.out.print(ch+"\t");
		System.out.println();
		for(char ch:str)
			System.out.print(ch+"\t");
		System.out.println();
		System.out.println("----------------------------------");
		
		System.arraycopy(arr, 0, str, 2, 4);//arr�� 0��°���� str�� 2��°���� 4����ŭ ������
		for(char ch:arr)
			System.out.print(ch+"\t");
		System.out.println();
		for(char ch:str)
			System.out.print(ch+"\t");
		System.out.println();

	}

}
