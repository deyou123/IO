package io;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

public class StringNodeTest {
	public static void main(String[] args) {
		String src="今天是3月8号\n"+
				"我要学习IO\n";
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
		// 创建StringWriter
		
		
		try (StringWriter sw = new StringWriter()){
			sw.write("有一个美丽的地方，\n");
			sw.write("他在远方等我，\n");
			System.out.println("下面输出sw字符串节点里的内容");
			System.out.println(sw.toString());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
