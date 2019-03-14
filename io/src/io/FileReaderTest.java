package io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
	public static void main(String[] args) throws IOException {
		FileReader fileReader= null;
		try {
			//创建路径
			String path = "src/io/FileReaderTest.java";
			//创建字符输入流
			fileReader = new FileReader(path);
			//创建一个长度为32的竹筒
			char [] cbuf = new char [1024];
			//用于保存字符读取数
			int hasRead = 0;
			//使用循环重复取水过程
			while((hasRead= fileReader.read(cbuf))>0){
				System.out.println(new String(cbuf,0,hasRead));
			}
			
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			fileReader.close();
		}
		
		
	}
}
