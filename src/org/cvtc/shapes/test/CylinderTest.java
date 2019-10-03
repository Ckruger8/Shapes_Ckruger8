package org.cvtc.shapes.test;

import static org.junit.Assert.*;

import org.cvtc.shapes.Cylinder;
import org.cvtc.shapes.Dialog;
import org.cvtc.shapes.MessageBoxSub;
import org.junit.Test;



public class CylinderTest {

	Dialog messageBox = new MessageBoxSub();
	
	Cylinder cylinder1 = new Cylinder(messageBox, -1, 0);
	Cylinder cylinder2 = new Cylinder(messageBox, 10, 5);
	Cylinder cylinder3 = new Cylinder(messageBox, 11, 5.5f);
	
	@Test
	public void testConstructer() {

		assertTrue(cylinder1 instanceof Cylinder);
	
	}
	
	@Test
	public void testGetHeight() {

		assertEquals(1, cylinder1.getHeight(), 0.0);
	
	}

	@Test
	public void testGetRadius() {

		assertEquals(1, cylinder1.getRadius(), 0.0);
	
	}
	
	@Test
	public void testGetSurfaceArea1() {

		assertEquals(12.566370964050293, cylinder1.surfaceArea(), 0.0);
	
	}


	@Test
	public void testGetSurfaceArea2() {

		assertEquals(942.48, cylinder2.surfaceArea(), 0.01f);
	
	}


	@Test
	public void testGetSurfaceArea3() {

		assertEquals(1140.4, cylinder3.surfaceArea(), 0.1f);
	
	}

	@Test
	public void testGetVolume1() {

		assertEquals(3.1415927410125732, cylinder1.volume(), 0.0);
	
	}

	@Test
	public void testGetVolume2() {

		assertEquals(1570.8, cylinder2.volume(), 0.1f);
	
	}

	@Test
	public void testGetVolume3() {

		assertEquals(2090.73, cylinder3.volume(), 0.01f);
	
	}

}
