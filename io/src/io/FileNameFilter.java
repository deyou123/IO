package io;

import java.io.File;

public class FileNameFilter {
	public static void main(String[] args) {
		File file = new File(".");
		String [] namelist = file .list((dir,name)->name.endsWith(".java")
				||new File(name).isFile()||new File(name).isDirectory()
				);
		for (String name : namelist) {
			System.out.println(name);
		}
	}
}
