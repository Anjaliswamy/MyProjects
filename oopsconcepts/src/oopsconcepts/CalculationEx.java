package oopsconcepts;

public class CalculationEx {
	int result;
	//to perform addition
	public void addition(){
		int a=10;
		int b=20;
		result=a+b;
		System.out.println(result);
	}
	//to perform multiplication
	public void multiplication(){
		int x=5;
		int y=9;
		result=x*y;
		System.out.println(result);
	}
	public static void main(String[] args) {
	//to create object
		CalculationEx ce=new CalculationEx();
		ce.addition();
		ce.multiplication();
		

	}

}
