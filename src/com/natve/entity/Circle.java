package com.natve.entity;

import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import com.natve.main.Main;
import com.natve.main.Scene;

public class Circle {

	protected float x, y;
	public static float size = Square.size / 2;

	private Ellipse2D circle;
	
	private float velx = 5, vely = 5;
	public Circle(float x, float y) {
		this.x = x + Scene.spacer;
		this.y = y + Scene.spacer;

		circle = new Ellipse2D.Float(this.x, this.y, size, size);
	}

	public void update(){
		
		if(this.x < Scene.spacer){
			this.velx = -velx;
			System.out.println("true right");
		}
		if(this.x > Main.width - Scene.spacer){
			this.velx = -velx;
			System.out.println("true left");
		}
		
		if(this.y > Main.height - Scene.spacer - Scene.spacer / 2){
			this.vely = -vely;
			System.out.println("true up");
		}
		if(this.y < Scene.spacer){
			this.vely = -vely;
			System.out.println("true down");
		}
		
		this.x += velx;
		this.y += vely;
		circle.setFrame(x, y, size, size);
		
	}
	public void hit() {
		this.velx = -velx;
		this.vely = -vely;
	}

	public void draw(Graphics2D graphics) {
		graphics.draw(circle);
	}

	public float getX() {
		return x;
	}

	public float getY() {
		return y;
	}
	
	public float getRadius(){ return size; }

}
