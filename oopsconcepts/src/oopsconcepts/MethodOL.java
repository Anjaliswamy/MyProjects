package oopsconcepts;

public class MethodOL {
	public void demoOne(int a, int b){
		int c=a*b;
		System.out.println("multiplication of given values is:"+c);
	}
	public void demoOne(String x, String y){
		String z=x+y;
		System.out.println(z);
		}
	public static void main(String[] args) {
		MethodOL m1=new MethodOL();
		m1.demoOne(5, 9);
		m1.demoOne("InsightQ", "Technologies");

	}

}
