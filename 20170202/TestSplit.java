


public class TestSplit {
	public static void main(String[] args) {
		TestSplit fman=new TestSplit();


		String[] data = new String[3];
		data[0] = "いぬ？,犬";
		data[1] = "ねこ？,猫";
		data[2] = "さる？,猿";

		fman.writeFile(data);
	}
}



class TestSplit{
	
	public void writeFile(String[] data){
		System.out.println(data[0]);
		System.out.println(data[1]);
		System.out.println(data[2]);
	}
}