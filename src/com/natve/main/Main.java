package com.natve.main;

import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Main {
	
	static{
		
		System.loadLibrary("CToJava");
		
	}
	
	public static final int width = (int) (Toolkit.getDefaultToolkit().getScreenSize().width / 1.5);
	public static final int height = (int) (Toolkit.getDefaultToolkit().getScreenSize().height / 1.5);
	public static final float aspect = width / height;
	public static void main(String [] args){
		JFrame frame = new JFrame();
		Scene scene = new Scene();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(scene);
		int x = (int) (width - width / 1.5);
		int y = (int) (height - height / 1.5);
		frame.setBounds((int)(x / 1.5), y / 2, width, height);
		frame.setVisible(true);
		
		
			
		SwingUtilities.invokeLater(new Runnable() {
	        public void run() {
	        	scene.update();
	        	scene.repaint();
	        }
	    });
		
		
	}
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
