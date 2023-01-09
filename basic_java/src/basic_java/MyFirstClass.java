package basic_java;

public class MyFirstClass {

	public static void main(String[] args) {
		
		sum();
		substract();
		multiply();
		division();
		MySecondClass.sum();
		MySecondClass.substract();
		MySecondClass.multiply();
		MySecondClass.division();
	}
	
	public static void sum() {
		
		int a=5;
		int b=10;
		int c= a+b; // 15
		
		System.out.println("sum of a and b is: "+c);
	}

	public static void substract() {
		
		int a=5;
		int b=10;
		int c= b-a; //5
		
		System.out.println("substraction of a and b is: "+c);
	}

	public static void multiply() {

		int a=5;
		int b=10;
		int c= b*a; // 50

		System.out.println("multiplication of a and b is: "+c);
	}

	public static void division() {

		int a=5;
		int b=10;
		int c= b/a; // 2

		System.out.println("division of b and a is: "+c);
	}
}
