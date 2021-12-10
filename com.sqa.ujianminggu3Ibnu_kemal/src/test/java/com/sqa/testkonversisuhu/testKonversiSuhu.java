package com.sqa.testkonversisuhu;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

import org.junit.runner.RunWith;

import com.sqa.hitung.function.KonversiSuhu;

@RunWith(JUnitParamsRunner.class)

public class testKonversiSuhu {

	KonversiSuhu suhu;
	@Before
	public void setUp() throws Exception {
		suhu = new KonversiSuhu();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	@FileParameters("src/test/resources/skenario_f_ke_c.csv")
	public final void testHitungKonversiFkeC(double fahrenheit, double celcius) {
		assertEquals(celcius, suhu.hitungKonversiFkeC(fahrenheit),0.0009);
	}
	
	@Test
	public final void testBukanAngka() {
		assertEquals(5.0, suhu.hitungKonversiFkeC("abcde"));
	}
	
	@Test
	public final void testAngkaNegatif() {
		assertEquals(-19.4444, suhu.hitungKonversiFkeC(-3.0),0.0009);
	}
	
	@Test
	public final void testTidakMasukAngka() {
		assertEquals(0.0, suhu.hitungKonversiFkeC(),0.0);
	}
	
	

}
