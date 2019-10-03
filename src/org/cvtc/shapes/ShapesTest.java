package org.cvtc.shapes;

import javax.swing.JOptionPane;

public class ShapesTest {
	
	public static void main(String[] args) {
		
//		Dialog messageBox = new MessageBox();
//		
//		try {
//			
//			Shape cylinder = new Cylinder(messageBox, 6f, 4f);
//			Shape cuboid = new Cuboid(messageBox, 2f, 2f, 2f);
//			Shape sphere = new Sphere(messageBox, 9.6f);
//			
//			cuboid.render();
//			cylinder.render();
//			sphere.render();
//			
//			
//		} catch (Exception e) {
//			
//			JOptionPane.showMessageDialog(null, "Please enter valid information. The number must be greater than 0.");
//		
//		}
		
		
		
		
//		Dialog messageBox = new MessageBox();
////		Renderer render = new Sphere(messageBox, 6);
////		render.render();
//
//		Cuboid cube = new Cuboid(messageBox, 1, 2, 3);
//		
//		cube.render();
//		
//		Cylinder cylinder = new Cylinder(messageBox, 5, 10);
//		
//		cylinder.render();
//		
//		Sphere sphere = new Sphere(messageBox, 6);
//		
//		sphere.render();
		
		
	try {
			
			Dialog messageBox = new MessageBox();
			
			ShapeFactory shapeFactory = new ShapeFactory(messageBox);
			
			// Create an object for each shape
			Cuboid cuboid = (Cuboid) shapeFactory.make(ShapeType.Cuboid);
			Cylinder cylinder = (Cylinder) shapeFactory.make(ShapeType.Cylinder);
			Sphere sphere = (Sphere) shapeFactory.make(ShapeType.Sphere);
			
			// Output each shape's data
			cuboid.render();
			cylinder.render();
			sphere.render();
			
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
			
			// Display error dialog box with error message
			String errorText = e.getMessage();
			JOptionPane.showMessageDialog(null, errorText, "ERROR!", JOptionPane.ERROR_MESSAGE);
		}
		
	}
	
}