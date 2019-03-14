package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest{
	public static void main(String[] args) throws IOException {
		File file = new File("src/io/FileInputStreamTest.java");
		//创建字节输入流
		FileInputStream fileInputStream = new FileInputStream("src/io/FileInputStreamTest.java");
		//创建竹筒
		byte [] buff = new byte[2];
		//保存实际读取字节数
		int hasRead =0;
		//使用循环重复打水
		while((hasRead = fileInputStream.read(buff))>0){
			System.out.println(new String (buff,0,hasRead));
		}
		fileInputStream.close();
	}
}
