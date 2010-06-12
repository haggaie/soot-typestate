import static org.junit.Assert.*;

import java.util.EmptyStackException;
import java.util.Stack;

import org.junit.Before;
import org.junit.Test;

public class StackTest {

	Stack<Integer> stack;
	
	@Before
	public void setUp() throws Exception {
		stack = new Stack<Integer>();
	}

	@Test
	public void testPush() {
		stack.push(1);
		stack.pop();
	}

	@Test(expected = EmptyStackException.class)
	public void testPop() {
		stack.pop();
	}

	@Test
	public void testEmpty() {
		assertTrue(stack.empty());
		stack.push(1);
		stack.clear();
		assertTrue(stack.empty());
	}

	@Test(expected = EmptyStackException.class)
	public void testClear() {
		// Creating a new stack to have a simpler
		// example wnew AShere the stack is allocated locally.
		Stack<Integer> s = new Stack<Integer>();
		s.push(1);
		s.clear();
		s.pop();
	}
	
	@Test
	public void testCollectionMethods() {
		Stack<Integer> s = new Stack<Integer>();
		s.add(1);
		s.addAll(s);
		s.pop();
		s.pop();
	}
	
	@Test
	public void testLoop() {
		for (int i = 0; i < 100; ++i)
		{
			Stack<String> s = new Stack<String>();
			s.push("TEST");
			s.pop();
			s.clear();
		}
	}
	
	@Test 
	public void testBranch() {
		Stack<String> s;
		if (stack.empty())
		{
			s = new Stack<String>();
			s.push("Empty");
		}
		else
			s = new Stack<String>();
		s.pop();
	}
	
	@Test(expected = EmptyStackException.class)
	public void testBranchLocal() {
		Stack<String> stack = new Stack<String>();
		stack.add("1");
		stack.add("2");
		while (!stack.empty())
			stack.pop();
		stack.pop();
	}

	public static void main(String[] args) throws Exception
	{
		StackTest test = new StackTest();
		test.setUp();
		test.testPush();
		test.setUp();
		try {
			test.testPop();
		}
		catch (EmptyStackException e) {
		}
		test.setUp();
		test.testEmpty();
		test.setUp();
		try {
			test.testClear();
		}
		catch (EmptyStackException e) {
		}
		test.testCollectionMethods();
		test.testLoop();
		test.testBranchLocal();
	}
}
