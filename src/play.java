import java.util.Scanner;

class Hw{
	private int bun;
	private String name;
	private String ID;
	private String PW;
	private String email;
	
	Hw(){}
	Hw(String n, String ID,String Pw,String email){
		this.bun=play.cnt;
		name=n;
		this.ID=ID;
		this.PW=PW;
		this.email=email;
	}
	
	
	public void print() {
		System.out.println(bun+"\t"+name+"\t"+ID+"\t"+email);
	}
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getPW() {
		return PW;
	}
	public void setPW(String pW) {
		PW = pW;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
public class play {
	static int cnt=0;
	static Hw hw[]=new Hw[10];
	public static void main(String[] args) {
		System.out.println("정보를 입력하세요");
		System.out.println("이름\tID\t비밀번호\t이메일");
		Scanner scn =new Scanner(System.in);
		while(true) {
			Hw ohw=new Hw();
			String a=scn.next();
			if(a.toUpperCase().equals("END")||a==null){
				System.out.println("출력합니다");
				break;
			}
			String[] jung=a.split(",");//비워뒀을때 에러남
				hw[cnt]=new Hw(jung[0],jung[1],jung[2],jung[3]);
				if(hw[cnt].getID().equals(hw[cnt-1].getID())) {
					System.out.println("이미 존재하는 아이디입니다");
				}
				cnt++;
				
		}
		for(int x=0;x<cnt;x++) {
			hw[x].print();
		}
	//검색은 패턴참조함
//검색한후 결과없으면 해당정보없음 출력		
	
		}
		
		
	}


