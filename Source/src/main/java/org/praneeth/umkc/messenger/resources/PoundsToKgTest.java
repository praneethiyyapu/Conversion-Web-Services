package org.praneeth.umkc.messenger.resources;

import static org.junit.Assert.*;

import java.text.DecimalFormat;

import org.junit.Test;

public class PoundsToKgTest {
	
	TestPoundsToKg p = new TestPoundsToKg();
	Double KG = p.convertPtoK(5.0);
	DecimalFormat f = new DecimalFormat("##.00");
	String sKG = f.format(KG);
	Double DKG = Double.parseDouble(sKG);
	Double testPoundsToKgConversion = 7.0;

	@Test
	public void test() {
		System.out.println("Unit testconversion: " + DKG + " = " + testPoundsToKgConversion);
		assertEquals(testPoundsToKgConversion, DKG);
	}

}
