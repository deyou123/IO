package io;

import java.io.File;
import java.io.IOException;


public class FileTest {
	
	public static void main(String[] args) throws IOException{
		File file = new File(".");
		System.out.println(file.isDirectory());
		System.out.println(file.getName());
		System.out.println(file.getParent());
		
	
		System.out.println(file.getAbsoluteFile());
		System.out.println(file.getAbsoluteFile().getParent());
	
		File tmpFile  = File.createTempFile("aaa", ".txt", file);
		tmpFile.deleteOnExit();
		
		File newFile = new File(System.currentTimeMillis()+"");
		System.out.println("newFile�����Ƿ����"+newFile.exists());
		System.out.println(newFile.createNewFile());
	
		System.out.println("newFile�����Ƿ����"+newFile.exists());
		newFile.mkdir();
		String fileList[] = file.list();
		System.out.println("��ǰ·�����������ļ���·������+++++++++++++");
		for (String fileName:fileList) {
			System.out.println(fileName);
		}
		
		File [] roots = File.listRoots();
		System.out.println("ϵͳ���и�·��+++++++++++++++");
		for (File root : roots) {
			System.out.println(root);
		}
		System.out.println("ϵͳ���и�·��+++++++++++++++");
		for (File root : roots) {
			System.out.println(root);
		}
		
	}
}