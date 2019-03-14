package io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
	public static void main(String[] args) throws IOException {
		FileReader fileReader= null;
		try {
			//����·��
			String path = "src/io/FileReaderTest.java";
			//�����ַ�������
			fileReader = new FileReader(path);
			//����һ������Ϊ32����Ͳ
			char [] cbuf = new char [1024];
			//���ڱ����ַ���ȡ��
			int hasRead = 0;
			//ʹ��ѭ���ظ�ȡˮ����
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
