package org.cvtc.shapes.test;

import static org.junit.Assert.*;

import org.cvtc.shapes.Dialog;
import org.cvtc.shapes.MessageBoxSub;
import org.cvtc.shapes.Sphere;
import org.junit.Test;

public class SphereTest {

	Dialog messageBox = new MessageBoxSub();
	
	Sphere sphere1 = new Sphere(messageBox, -1);
	Sphere sphere2 = new Sphere(messageBox, 50);
	Sphere sphere3 = new Sphere(messageBox, 25.5f);
	
	@Test
	public void testConstructer() {

		assertTrue(sphere1 instanceof Sphere);
	
	} 

	@Test
	public void testGetRadius() {

		assertEquals(1, sphere1.getRadius(), 0.0);
		assertEquals(50, sphere2.getRadius(), 0.0);
		assertEquals(25.5f, sphere3.getRadius(), 0.0);
	
	}

	@Test
	public void testGetSurfaceArea1() {

		assertEquals(12.57, sphere1.surfaceArea(), 0.01f);
	
	}

	@Test
	public void testGetSurfaceArea2() {

		assertEquals(31415.93, sphere2.surfaceArea(), 0.01f);
	
	}

	@Test
	public void testGetSurfaceArea3() {

		assertEquals(8171.28, sphere3.surfaceArea(), 0.01f);
	
	}

	@Test
	public void testGetVolume1() {

		assertEquals(4.19, sphere1.volume(), 0.01f);
	
	}


	@Test
	public void testGetVolume2() {

		assertEquals(523599, sphere2.volume(), 1f);
	
	}

 
	@Test
	public void testGetVolume3() {

		assertEquals(69455.90, sphere3.volume(), 0.01f);
	
	}

}
