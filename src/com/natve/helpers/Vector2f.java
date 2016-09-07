package com.natve.helpers;

public class Vector2f {

	public float x, y;
	
	public Vector2f(float x, float y){
		
		this.x = x;
		this.y = y;
		
	}
	
	public Vector2f(){
		
	}
	
	@Override
	public String toString(){
		return "(" + x + ", " + y + ")";
	}
	
}
