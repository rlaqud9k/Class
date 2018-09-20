import java.util.Properties;

public class Exam05 {

	public static void main(String[] args) {
		//Properties pro=System.getProperties();
		//pro.list(System.out);
		String osname = System.getProperty("os.name");//개발환경 구축할때 이걸 불러와서 사용함
		System.out.println(osname);
	}

}
