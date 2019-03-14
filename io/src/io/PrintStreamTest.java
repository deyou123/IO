package io;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
//处理流
public class PrintStreamTest {
	public static void main(String[] args) {
		try(
			FileOutputStream fos = new FileOutputStream("test.java");
			PrintStream ps = new PrintStream(fos)
			)
		{	//使用PrintStream 执行输出
			ps.println("普通字符串串");
			//直接使用Print输出对象
			ps.println(new PrintStreamTest().toString());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
