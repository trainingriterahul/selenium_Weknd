package variables;

public class Static_Variables {
	
//	A variable which is declared with static keyword, inside a class but outside the body of the method or constructor or block is called static variable.
//	Static variable is stored in the static memory.
//	Static variables are created when the program starts and destroyed when the program stops.
//	Static variable can be called by class name directly.

	
	static String text= "Today is beatutiful day.";
	
	public static void main(String[] args)
	{
		System.out.println(Static_Variables.text);
	}
}
