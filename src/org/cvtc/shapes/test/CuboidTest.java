package org.cvtc.shapes.test;

import static org.junit.Assert.*;

import org.cvtc.shapes.Cuboid;
import org.cvtc.shapes.Dialog;
import org.cvtc.shapes.MessageBoxSub;
import org.cvtc.shapes.Shape;
import org.junit.Test;

public class CuboidTest {
	
	Dialog messageBox = new MessageBoxSub();
	
	Cuboid cube1 = new Cuboid(messageBox, 1.0f, 1.0f, 1.0f);
	Cuboid cube2 = new Cuboid(messageBox, 1.0f, 1.0f, 1.0f);
	Cuboid cube3 = new Cuboid(messageBox, 1.0f, 1.0f, 1.0f);

	@Test
	public void test() {
		Shape cube2 = new Cuboid(messageBox,1 ,1, 1);
		
		assertTrue(cube2 instanceof Cuboid);
	}
	
	// Getter and Setter Tests
	
	@Test
	public void testGetWidth() {
		assertEquals(1.0f, cube1.getWidth(), 1.0f);
	}
	
	@Test
	public void testGetHeight() {
		assertEquals(1.0f, cube1.getHeight(), 1.0f);
	}
	
	@Test
	public void testGetDepth() {
		assertEquals(1.0f, cube1.getDepth(), 1.0f);
	}
	
	// Method Tests
	
	@Test
	public void testGetSurfaceArea() {
		assertEquals(6.0f, cube1.surfaceArea(), 0.0f);
		assertEquals(6.0f, cube2.surfaceArea(), 0.0f);
		assertEquals(6.0f, cube3.surfaceArea(), 0.0f);
	}
	
	@Test
	public void testGetVolume() {
		assertEquals(1.0f, cube1.volume(), 0.0f);
		assertEquals(1.0f, cube2.volume(), 0.0f);
		assertEquals(1.0f, cube3.volume(), 0.0f);
	}
	

}
