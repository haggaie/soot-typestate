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
		// example where the stack is allocated locally.
		Stack<Integer> s = new Stack<Integer>();
		s.push(1);
		s.clear();
		s.pop();
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
	}
}
