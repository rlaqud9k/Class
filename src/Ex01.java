class EMP{
	public int eno;
	
	public EMP(int eno) {
		this.eno=eno;
		System.out.println("Employee("+eno+")가 메모리에 생성되었습니다.");
	}
	public void finalize() {
		System.out.println("Employee("+eno+")가 메모리에 제거되었습니다.");
	}
}

public class Ex01 {
	public static void main(String[] args) {
		EMP emp;
		emp =new EMP(1);
		emp=null;
		emp =new EMP(2);
		emp =new EMP(3);
		System.out.println("emp가 최종적으로 참조하는 사원번호");
		System.out.println(emp.eno);
		System.gc();
		
	}
}
