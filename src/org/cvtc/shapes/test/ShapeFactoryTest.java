package org.cvtc.shapes.test;

import static org.junit.Assert.*;

import org.cvtc.shapes.Cuboid;
import org.cvtc.shapes.Cylinder;
import org.cvtc.shapes.Dialog;
import org.cvtc.shapes.MessageBoxSub;
import org.cvtc.shapes.Shape;
import org.cvtc.shapes.ShapeFactory;
import org.cvtc.shapes.ShapeType;
import org.cvtc.shapes.Sphere;
import org.junit.Test;

public class ShapeFactoryTest {

	Dialog messageBox = new MessageBoxSub();
	ShapeFactory shapeFactory = new ShapeFactory(messageBox);
	
	
	@Test
	public void testMakeCube() {

		Shape cube = shapeFactory.make(ShapeType.Cuboid);
		
		assertTrue(cube instanceof Cuboid);
		
	}	
	
	@Test
	public void testMakeCylinder() {

		Shape cylinder = shapeFactory.make(ShapeType.Cylinder);
		
		assertTrue(cylinder instanceof Cylinder);
		
	}
	
	@Test
	public void testMakeSphere() {

		Shape sphere = shapeFactory.make(ShapeType.Sphere);
		
		assertTrue(sphere instanceof Sphere);
		
	}
}
