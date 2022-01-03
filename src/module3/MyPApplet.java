package module3;

import processing.core.*;

public class MyPApplet extends PApplet { 
	private String URL = "https://images.unsplash.com/photo-1483631224226-a219224bb76e?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=2052&q=80";
	private PImage backgroundImg;
	
	public void setup() {
		size(720, 720);
		backgroundImg = loadImage(URL, "jpg");
	}
	
	public void draw() {
		backgroundImg.resize(0, height);
		image(backgroundImg, 0,0);
		fill(255, 209, 0);
		ellipse(width/5, height/5, width/5, height/5);
	}
}