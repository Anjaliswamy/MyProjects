package oopsconcepts;

public class CalculationEx2 {
	//to perform addition
	public int addition (int a, int b){
		int c=a+b;
		return(c);
		}
	public static void main(String[] args) {
	//create object
		CalculationEx2 ce=new CalculationEx2();
		int x=ce.addition(10, 20);
		System.out.println("sum of given values is:"+x);
		

	}

}
