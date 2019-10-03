package org.cvtc.shapes;


/**
 * @author Caleb Kruger
 *
 */
public class Cylinder extends Shape implements Renderer{
	
	//Attributes
	private float radius = 0.0f;
	private float height = 0.0f;

	
	// Constructors
	
	public Cylinder(Dialog messageBox, float radius, float height) {
		super(messageBox);
		this.radius = (radius > 0) ? radius : 1 ;
		this.height = (height > 0) ? height : 1 ;
	}

	// Setters and Getters
	public float getRadius() {
		return radius;
	}

	private void setRadius(float radius) {
		
		if ( radius <= 0) {
			throw new IllegalArgumentException();
		} else {
			this.radius = radius;
		}
		
	}

	
	
	public float getHeight() {
		return height;
	}

	private void setHeight(float height) {
		
		if ( height <= 0 ){
			throw new IllegalArgumentException();
		} else {
			this.height = height;
		}
	}

	
	
	
	@Override
	public float surfaceArea() {
		return (float) (2 * Math.PI * (radius * radius) + 2 * Math.PI * radius * height);
	}

	@Override
	public float volume() {
		return (float) (Math.PI * (radius * radius) * height);
	}

	@Override
	public void render() {
		
		String message = "Radius: " + radius + "\n" + 
				 			"Height: " + height + "\n" +
				 			"Surface Area: " + surfaceArea() + "\n" +
				 			"Volume: " + volume() + "\n";
		String title = "Cylinder";
		getMessageBox().show(message, title);

		
	}
	
	
	
	
}