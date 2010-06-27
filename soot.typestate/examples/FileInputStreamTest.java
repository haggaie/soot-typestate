import java.io.FileInputStream;
import java.io.IOException;



public class FileInputStreamTest {
	
	public void test1() throws IOException
	{
		FileInputStream file = new FileInputStream("the_file_name");
		file.read();
		file.close();
	}
	
	public void test2() throws IOException
	{
		FileInputStream file = new FileInputStream("the_file_name");
		file.close();
		file.read(); // ERROR
	}
	
	public void test3() throws IOException
	{
		FileInputStream file1 = new FileInputStream("the_file_name");
		file1.read();
		file1.close();
		
		FileInputStream file2 = new FileInputStream("the_file_name");
		file2.read();
		file2.close();
	}
	
	public void test4() throws IOException
	{
		FileInputStream file = new FileInputStream("the_file_name");
		file.read();
		file.close();
		
		file = new FileInputStream("the_file_name");
		file.read();  // Not an error because of soot's compilation.
					  // The current file and the previous file are two 
					  // different locals.
		file.close();
	}
	
	public void test5() throws IOException
	{
		FileInputStream file = new FileInputStream("the_file_name");
		for(int c=0; c < 100; ++c)
			file.read();
		
		file.close();
	}
	
	public void test6() throws IOException
	{
		for(int c=0; c < 100; ++c)
		{
			FileInputStream file = new FileInputStream("the_file_name");
			file.read(); // ERROR (non unique)
			file.close();
		}
	}
	
	public static void main(String[] args) throws Exception
	{
		FileInputStreamTest test = new FileInputStreamTest();
		test.test1();
		test.test2();
		test.test3();
		test.test4();
		test.test5();
		test.test6();
	}
}

