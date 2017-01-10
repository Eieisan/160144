public class Aloha{
	public static void main(String[] args) {
		Alohaman am= new Alohaman();
		am.sayAloha();

	}	
	}
class Alohaman{
	private String msg;
	private String msg2;
	
public Alohaman(){
	this.msg="ALOHA!";
	this.msg2="あおき！";
	}
	public void sayAloha(int n){
		System.out.println(this.msg);
	}
}
