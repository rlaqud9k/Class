
public class Ex02 {

	public static void main(String[] args) {
		long time1=System.currentTimeMillis();///1000분의1초
		long time2=System.nanoTime();//100만분의 1초
		
		System.out.println(time1+" "+time2);
	}

}
