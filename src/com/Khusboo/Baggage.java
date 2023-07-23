package com.Khusboo;

import javax.swing.ImageIcon;
import java.awt.Image;

public class Baggage extends Actor{
	
	public Baggage(int x, int y) {
		super(x,y);
		initBaggage();
	}

	private void initBaggage() {
		ImageIcon icon = new ImageIcon("src/resources/baggage.png");
		Image image = icon.getImage();
		setImage(image);
		
	}
	
	public void move(int x,int y) {
		int dx = x() + x;
		int dy = y() + y;
		
		setX(dx);
		setY(dy);
	}
	

}
