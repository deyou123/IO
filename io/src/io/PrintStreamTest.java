package io;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
//������
public class PrintStreamTest {
	public static void main(String[] args) {
		try(
			FileOutputStream fos = new FileOutputStream("test.java");
			PrintStream ps = new PrintStream(fos)
			)
		{	//ʹ��PrintStream ִ�����
			ps.println("��ͨ�ַ�����");
			//ֱ��ʹ��Print�������
			ps.println(new PrintStreamTest().toString());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
