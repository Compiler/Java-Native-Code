package com.natve.main;

public class Main {
	
	static{
		
		System.loadLibrary("CToJava");
		
	}
	
	private native String helloC(String filePath);

	public static void main(String [] args){
		
		Main comun = new Main();
		System.out.println(comun.helloC("Java: Hello from Java"));
		
	}
}
