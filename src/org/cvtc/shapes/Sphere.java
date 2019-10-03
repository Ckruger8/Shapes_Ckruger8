package org.cvtc.shapes;

import javax.swing.JOptionPane;

/**
 * @author Caleb Kruger
 *
 */
public class Sphere extends Shape implements Renderer{
	
	//Attribute
	private float radius;

	
	//Constructors
	
	public Sphere(Dialog messageBox, float radius) {
		super(messageBox);
		this.radius = (radius > 0) ? radius : 1 ;
	}
	
	
	//Setter and Getter
	
	public float getRadius() {
		return radius;
	}

	private void setRadius(float radius) {
		
		if (radius <= 0) {
			throw new IllegalArgumentException();
		} else {
			this.radius = radius;
		}
	}

	
	
	
	@Override
	public float surfaceArea() {
		return  (float) (4 * Math.PI * (radius * radius));
	}

	@Override
	public float volume() {
		return (float) ((4 * (Math.PI * (radius * radius * radius))) / 3);
	}

	@Override
	public void render() {

		String message = "Radius: " + radius + "\n" + 
				 			"Surface Area: " + surfaceArea() + "\n" +
				 			"Volume: " + volume() + "\n";

		String title = "Sphere";
		getMessageBox().show(message, title);
	}
	
	
	
	
}