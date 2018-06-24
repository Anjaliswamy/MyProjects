package oopsconcepts;

public class ArithmaticEx01 {
	//declaration of variable in class level
	static int result;
	//method to perform addition
	public static void addition(){
		int a=10;
		int b=20;
		result=a+b;
		System.out.println("addition of values is:"+result);
	}
	//method to perform multiplication
	public static void multiplication(){
		int x=5;
		int y=6;
		result=x*y;
		System.out.println("multiplication of values is:"+result);
	}
	public static void main(String[] args){
		//calling static methods
		addition();
		multiplication();
		
		

	}

}
