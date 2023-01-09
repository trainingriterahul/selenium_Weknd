package variables;

public class Instance_Variable {
	
//	A variable which is declared inside a class but outside the body of the method or constructor or block is called instance variable.
//	Instance variable can be used anywhere in the program.

	int p=12;
	int d= 45;
	int q=p+d;
	
	public void sum()
	{
		System.out.println("sum of p and d is : "+q);
	}
	
//	public static void add()
//	{
//		
//		System.out.println("addition of p and d is : "+q);
//		Instance_Variable obj1=new Instance_Variable();
//		obj1.add();
//		System.out.println("add "+obj1);
//		
//		
//	}
	
	public static void main(String[] args)
	{
		Instance_Variable obj= new Instance_Variable();
		
		obj.sum();
		
		
	}
}
