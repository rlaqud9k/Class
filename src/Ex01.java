class EMP{
	public int eno;
	
	public EMP(int eno) {
		this.eno=eno;
		System.out.println("Employee("+eno+")�� �޸𸮿� �����Ǿ����ϴ�.");
	}
	public void finalize() {
		System.out.println("Employee("+eno+")�� �޸𸮿� ���ŵǾ����ϴ�.");
	}
}

public class Ex01 {
	public static void main(String[] args) {
		EMP emp;
		emp =new EMP(1);
		emp=null;
		emp =new EMP(2);
		emp =new EMP(3);
		System.out.println("emp�� ���������� �����ϴ� �����ȣ");
		System.out.println(emp.eno);
		System.gc();
		
	}
}
