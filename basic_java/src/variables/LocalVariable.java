package variables;

public class LocalVariable {
	
//	A variable declared inside the body of the method or constructor or block is called local variable.
//	Local variable can be used only inside that method/function in which it is declared.
//	A local variable can be a static variable.

	public void add()
	{
		int a=10;
		int b=25;
		int c=a+b;
		System.out.println("calling non static method "+c);
	}
	public static void sum()
	{
		int a=12;
		int b=25;
		int c=a+b;
		System.out.println("calling static method "+c);
	}
	
	
	public static void main(String[] args)
	{
		LocalVariable obj= new LocalVariable();
		
		obj.add();
		sum();
	}
}
