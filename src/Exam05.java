import java.util.Properties;

public class Exam05 {

	public static void main(String[] args) {
		//Properties pro=System.getProperties();
		//pro.list(System.out);
		String osname = System.getProperty("os.name");//����ȯ�� �����Ҷ� �̰� �ҷ��ͼ� �����
		System.out.println(osname);
	}

}
