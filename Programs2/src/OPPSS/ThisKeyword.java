package OPPSS;

public class ThisKeyword {
	int ab=10;
	public static void main(String[] agrs) {
		@SuppressWarnings("unused")
		ThisKeyword q=new ThisKeyword();
		
	}

	public ThisKeyword() {
		// TODO Auto-generated constructor stub
		int ab=20;
		System.out.println(this.ab);
		System.out.println(ab);
	}
	

}
