package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KeyinTest {
	public static void main(String[] args) {
		//��System.in����ת����Reader����
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(reader);
		String line =null;
		try {
			while((line = br.readLine())!= null){
				if(line.equalsIgnoreCase("exit")){
					System.exit(1);
				}
				//��ӡ�����ȡ������
				System.out.println("���� ����Ϊ��"+ line);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
