package org.praneeth.umkc.messenger.resources;

import static org.junit.Assert.*;

import java.text.DecimalFormat;

import org.junit.Test;

public class FeetToCmTest {

	TestFeetToCm ft = new TestFeetToCm();
	Double dft = ft.convertFtoC(5.0);
	DecimalFormat f = new DecimalFormat("##.00");
	String sft = f.format(dft);
	Double Dft = Double.parseDouble(sft);
	Double testFeetToCmConversion = 140.0;

	@Test
	public void test() {
		System.out.println("Unit testconversion: " + Dft + " = " + testFeetToCmConversion);
		assertEquals(testFeetToCmConversion, Dft);
	}

}
