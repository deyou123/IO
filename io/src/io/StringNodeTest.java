package io;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

public class StringNodeTest {
	public static void main(String[] args) {
		String src="������3��8��\n"+
				"��ҪѧϰIO\n";
		char[] buffer = new char[32];
		int hasread = 0;
	
		try (	StringReader sr = new StringReader(src))
		{
			while((hasread = sr.read(buffer))>0){
				System.out.println(new String(buffer, 0, hasread));
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// ����StringWriter
		
		
		try (StringWriter sw = new StringWriter()){
			sw.write("��һ�������ĵط���\n");
			sw.write("����Զ�����ң�\n");
			System.out.println("�������sw�ַ����ڵ��������");
			System.out.println(sw.toString());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
