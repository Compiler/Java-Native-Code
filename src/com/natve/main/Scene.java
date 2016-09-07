package com.natve.main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import javax.swing.JPanel;

import com.natve.entity.Circle;
import com.natve.entity.Square;
import com.natve.helpers.CollisionInfo;

public class Scene extends JPanel {
	
	private BufferedImage screen;
	private Graphics2D g;
	
	private Square sqo, sqt;
	
	public static int spacer = 50;
	
	private ArrayList<Circle> circles = new ArrayList<Circle>();
	
	public Scene(){
		setOpaque(true);
		setBackground(Color.black);
		screen = new BufferedImage(Main.width, Main.height, BufferedImage.TYPE_4BYTE_ABGR);
		
		sqo = new Square(5, 10);
		sqt = new Square(Main.width - spacer * 2 - 50 - 5, 10);
		
		circles.add(new Circle(100, 100));
		circles.add(new Circle(10, 200));
		circles.add(new Circle(200, 50));
	}
	
	public void update(){
		CollisionInfo.circleTouch(0, 0, 0, 0, 0, 0);
		
		for(int i = 0; i < circles.size(); i++){
			circles.get(i).update();
		}
		if(CollisionInfo.distanceFrom(sqo.getX() + Square.size, sqo.getY(), sqt.getX(), sqt.getY()) > 1)
			sqo.move(true, 7);
	}
	@Override
	public void paint(Graphics graphics) {
		
		super.paint(graphics);
		
		
		/*for(int i = 0; i < circles.size() - 1; i++){
			if(CollisionInfo.intersectsWithCircle(circles.get(i).getX(), circles.get(i).getY(), circles.get(i).getRadius(),
					circles.get(i + 1).getX(), circles.get(i + 1).getY(), circles.get(i + 1).getRadius())){
				circles.get(i).hit();
				circles.get(i + 1).hit();
			}
		}*/
		
			
		
		g = screen.createGraphics();
		g.clearRect(0, 0, Main.width, Main.height);
		
		
		
		
		g.drawRect(spacer, spacer, Main.width - spacer * 2, Main.height - spacer * 2);
		g.setColor(Color.green);
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_PURE);
		g.clipRect(spacer, spacer, Main.width - spacer * 2, Main.height - spacer * 2);
		for(int i = 0; i < circles.size(); i++){
			circles.get(i).draw(g);
		}
		sqo.draw(g);
		sqt.draw(g);
		
		graphics.drawImage(screen, 0, 0, this);
		
	}

}
