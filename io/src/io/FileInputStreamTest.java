package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest{
	public static void main(String[] args) throws IOException {
		File file = new File("src/io/FileInputStreamTest.java");
		//�����ֽ�������
		FileInputStream fileInputStream = new FileInputStream("src/io/FileInputStreamTest.java");
		//������Ͳ
		byte [] buff = new byte[2];
		//����ʵ�ʶ�ȡ�ֽ���
		int hasRead =0;
		//ʹ��ѭ���ظ���ˮ
		while((hasRead = fileInputStream.read(buff))>0){
			System.out.println(new String (buff,0,hasRead));
		}
		fileInputStream.close();
	}
}
