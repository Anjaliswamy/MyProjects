package oopsconcepts;

public class ConstEx {
	public ConstEx(int a, int b){
		int c=a*b;
		System.out.println("multiplication of given values is:"+c);
		}
		public ConstEx(String x, String y){
			String z=x+y;
			System.out.println(z);
		}
	public static void main(String[] args) {
		ConstEx ce=new ConstEx(5,6);
		ConstEx ceX=new ConstEx("mindq","systems");

	}

}
