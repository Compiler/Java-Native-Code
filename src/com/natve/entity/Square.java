package com.natve.entity;

import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

import com.natve.main.Scene;

public class Square {
	
	
	protected float x, y;
	public static float size = 50;
	
	private Rectangle2D rect;
	
	public Square(float x, float y){
		this.x = x + Scene.spacer;
		this.y = y + Scene.spacer;
		
		rect = new Rectangle2D.Float(this.x, this.y, size, size);
	}
	
	public void move(boolean right, float speed){
		if(right){
			x += speed;
		}else
			x -= speed;
		
		rect.setRect(x, y, size, size);
	}
	
	public void draw(Graphics2D graphics){
		graphics.draw(rect);
	}
	
	public float getX(){ return x; }
	public float getY(){ return y; }
	

}
