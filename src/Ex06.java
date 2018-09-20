//clone는 오브젝트소속 System.arraycopy();시스템소속 배열복사
public class Ex06 {

	public static void main(String[] args) {
		//System.arraycopy(src, srcPos, dest, destPos, length);
		char[]arr= {'가','나','다','라','마','바'};
		char[]str= {'a','b','c','d','e','f'};
		System.out.println("source array");
		for(char ch:arr)
			System.out.print(ch+"\t");
		System.out.println();
		for(char ch:str)
			System.out.print(ch+"\t");
		System.out.println();
		System.out.println("----------------------------------");

	}

}
