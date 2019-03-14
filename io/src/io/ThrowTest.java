package io;

import java.io.FileInputStream;
import java.io.IOException;

public class ThrowTest {
	public static void main(String[] args) throws Exception  {
		
//		try {
//			throwChecked(-3);
//		} catch (Exception e) {
//			// TODO: handle exception
//			System.out.println(e.getMessage());
//		}
		
			throwRuntime(3);
		
	}

	public  static void throwChecked(int a ) throws Exception {
		// TODO Auto-generated method stub
		if(a>0){
			throw new Exception("a 的值大于0，不符合要求");
		}
	}
	public  static void throwRuntime(int a ) throws Exception {
		// TODO Auto-generated method stub
		if(a>0){
			throw new Exception("a 的值大于0，不符合要求");
		}
	}
}
