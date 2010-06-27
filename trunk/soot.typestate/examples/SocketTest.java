import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;

import org.junit.Test;

/**
 * 
 */

/**
 * @author haggai
 *
 */
public class SocketTest {

	/**
	 * Test method for {@link java.net.Socket#Socket()}.
	 * @throws IOException 
	 */
	@Test(expected = SocketException.class)
	public void testSocket() throws IOException {
		Socket s = new Socket();
		s.getInputStream(); // ERROR
	}

	/**
	 * Test method for {@link java.net.Socket#Socket(java.net.InetAddress, int)}.
	 * @throws IOException 
	 * @throws UnknownHostException 
	 */
	@Test
	public void testSocketStringInt() throws UnknownHostException, IOException {
		Socket s = new Socket("www.google.com", 80);
		s.getInputStream();
	}

	/**
	 * Test method for {@link java.net.Socket#connect(java.net.SocketAddress)}.
	 * @throws IOException 
	 */
	@Test
	public void testConnectSocketAddress() throws IOException {
		Socket s = new Socket();
		s.connect(new InetSocketAddress("www.google.com", 80));
		s.getInputStream();
	}
	
	@Test(expected = SocketException.class)
	public void testClose() throws UnknownHostException, IOException	{
		Socket s = new Socket("www.google.com", 80);
		s.close();
		s.getInputStream(); // ERROR
	}

	public static void main(String args[]) throws Exception
	{
		SocketTest t = new SocketTest();
		t.testClose();
		t.testConnectSocketAddress();
		t.testSocket();
		t.testSocketStringInt();
	}
}
