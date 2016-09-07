package com.natve.helpers;

public class CollisionInfo {

	public static native float distanceFrom(float x1, float y1, float x2, float y2);
	public static native float angleInRadians(float x1, float y1, float x2, float y2);
	public static native float angleInDegrees(float x1, float y1, float x2, float y2);
	public static native boolean intersectsWithSquare(float size, float x1, float y1, float x2, float y2);
	public static native boolean intersectsWithCircle(float x1, float y1, float radius1, float x2, float y2, float radius2);
	
	public static float distanceFrom(Vector2f first, Vector2f second){
		return distanceFrom(first.x, first.y, second.x, second.y);
	}
	public static boolean circleTouch(float x1, float y1, float radius1, float x2, float y2, float radius2){
		return intersectsWithCircle(x1, y1, radius1, x2, y2, radius2);
	}
}
