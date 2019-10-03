package org.cvtc.shapes;

/**
 * @author Caleb Kruger
 *
 */
public abstract class Shape {

	// Abstract Methods
	
	//public abstract float surfaceArea();
	//public abstract float volume();
	//public abstract void render();
	
	private Dialog messageBox;

	protected Dialog getMessageBox() {
		return messageBox;
	}
	
	private void setMessageBox(Dialog messageBox) {
		this.messageBox = messageBox;
	}
	
	public Shape(Dialog messageBox) {
		this.messageBox = messageBox;
	}
	
	
	abstract public float surfaceArea();
	abstract public float volume();
}
