import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketTest {

	/**
	 * Test method for {@link java.net.Socket#Socket()}.
	 * @throws IOException 
	 */
	public void testSocketFail() throws IOException {
		Socket s = new Socket();
		s.getInputStream(); // ERROR
	}

	/**
	 * Test method for {@link java.net.Socket#Socket(java.net.InetAddress, int)}.
	 * @throws IOException 
	 * @throws UnknownHostException 
	 */
	public void testSocketStringIntPass() throws UnknownHostException, IOException {
		Socket s = new Socket("www.google.com", 80);
		s.getInputStream();
	}

	/**
	 * Test method for {@link java.net.Socket#connect(java.net.SocketAddress)}.
	 * @throws IOException 
	 */
	public void testConnectSocketAddressPass() throws IOException {
		Socket s = new Socket();
		s.connect(new InetSocketAddress("www.google.com", 80));
		s.getInputStream();
	}
	
	public void testCloseFail() throws UnknownHostException, IOException	{
		Socket s = new Socket("www.google.com", 80);
		s.close();
		s.getInputStream(); // ERROR
	}

	public static void main(String args[]) throws Exception
	{
		SocketTest t = new SocketTest();
		t.testCloseFail();
		t.testConnectSocketAddressPass();
		t.testSocketFail();
		t.testSocketStringIntPass();
	}
}
