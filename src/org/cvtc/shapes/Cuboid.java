package org.cvtc.shapes;

import javax.swing.JOptionPane;

/**
 * @author Caleb Kruger
 *
 */
public class Cuboid extends Shape implements Renderer{

	//Attributes
	private float width;
	private float height;
	private float depth;
	
	
	//Constructors
	
	public Cuboid(Dialog messageBox, float width, float height, float depth) {
		super(messageBox);
		setWidth(width);
		setHeight(height);
		setDepth(depth);
	}
	
	
	// Getters and Setters
	public float getWidth() {
		return width;
	}

	private void setWidth(float width) {
		
		if ( width <= 0) {
			throw new IllegalArgumentException();
		} else {
			this.width = width;
		}
		
	}

	
	

	public float getHeight() {
		return height;
	}

	private void setHeight(float height) {
		
		if ( height <= 0) {
			throw new IllegalArgumentException();
		} else {
			this.height = height;
		}
		
	}




	public float getDepth() {
		return depth;
	}

	private void setDepth(float depth) {

		if ( depth <= 0) {
			throw new IllegalArgumentException();
		} else {
			this.depth = depth;
		}
		
	}




	@Override
	public float surfaceArea() {
		return 2 * (width * depth + depth * height + height * width);
	}

	@Override
	public float volume() {
		// TODO Auto-generated method stub
		return width * depth * height;
	}

	@Override
	public void render() {
		// TODO Auto-generated method stub\
//		JOptionPane.showMessageDialog(null,
//									"Width: " + width +
//									"\nHeight: " + height +
//									"\nDepth: " + depth +
//									"\nSurface Area: " + surfaceArea() + 
//									"\nVolume: " + volume(),
//									"Cuboid",
//									JOptionPane.PLAIN_MESSAGE);
		String message = "Width: " + width + "\n" + 
						"Height: " + height + "\n" +
						"Depth: " + depth + "\n" +
						"Surface Area: " + surfaceArea() + "\n" +
						"Volume: " + volume() + "\n";

		String title = "Cuboid";
		getMessageBox().show(message, title);
	}


}
