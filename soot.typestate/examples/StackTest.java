import java.util.Stack;

public class StackTest {
	public void testFailPop() {
		Stack<?> s = new Stack<Object>();
		s.pop(); // ERROR
	}
	
	public void testFailMethodCall() {
		Stack<?> s = new Stack<Object>();
		System.out.println(s); // ERROR (for soundness)
	}
	
	public void testPassMethodCall() {
		@SuppressWarnings("unused")
		Stack<?> s = new Stack<Object>();
		System.out.println("Hello world");
	}

	public void testFailBranch() {
		Stack<Object> s = new Stack<Object>();
		boolean x = System.currentTimeMillis() > 2012;
		if (x)
			s.push(new Object());
		if (x)
			s.pop(); // ERROR (for soundness)
	}
	
	public void testPassBranch() {
		Stack<Object> s = new Stack<Object>();
		while (!s.empty())
			s.pop();
	}
	
	public void testFailMultipleObjects() {
		Stack<Integer> s;
		boolean x = System.currentTimeMillis() > 2012;
		if (x)
			s = new Stack<Integer>();
		else 
			s = new Stack<Integer>();
		s.push(1);
		s.pop(); // ERROR (for soundness)
	}
	
	public void testFailLoop() {
		for (int i = 0; i < 100; ++i)
		{
			Stack<String> s = new Stack<String>();
			s.push("TEST");
			s.pop(); // ERROR (for soundness)
		}
	}
	
	public void testPassUnique() {
		Stack<Integer> s = new Stack<Integer>();
		s.push(1);
		s.pop();
	}
	
	public static void main(String[] args) throws Exception
	{
		StackTest test = new StackTest();
		test.testFailBranch();
		test.testFailLoop();
		test.testFailMethodCall();
		test.testFailMultipleObjects();
		test.testFailPop();
		test.testPassBranch();
		test.testPassMethodCall();
		test.testPassUnique();
	}
}
