package com.test.test;

import java.io.File;
import java.net.URL;

public class testingPath {
	
	public String testing() {
		File file = new File("src/main/java");
	///	File file = new File("test");
		String absolutePath = file.getAbsolutePath();
		return  absolutePath;
	}
	
	
	public String testingtarget() {
		File file = new File("target");
		String absolutePath = file.getAbsolutePath();
		return  absolutePath;
	}
	
	public String testingtargetclass() {
		File file = new File("target");
		String absolutePath = file.getAbsolutePath();
		return  absolutePath;
	}
	

}
