package com.sqa.testkolamair;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

import org.junit.runner.RunWith;

import com.sqa.hitung.function.KolamAir;

@RunWith(JUnitParamsRunner.class)

public class TestHitungKolamAir {
	
	KolamAir kolam;
	@Before
	public void setUp() throws Exception {
		kolam = new KolamAir();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	@FileParameters("src/test/resources/skenario_keliling_kolam.csv")
	public final void testHitungKelilingKolam(double panjang, double lebar, double tinggi, double keliling) {
		assertEquals(keliling, kolam.hitungKelilingKolam(panjang, lebar, tinggi),0.0009);
	}
	
	@Test
	public final void testBukanAngka1() {
		assertEquals(5.0, kolam.hitungKelilingKolam("abcde", 2.0, 3.0));
	}
	
	@Test
	public final void testAngkaNegatif1() {
		assertEquals(24.0, kolam.hitungKelilingKolam(3.0, -2.0, 5.0),0.0);
	}
	
	@Test
	public final void testTidakMasukAngka1() {
		assertEquals(0.0, kolam.hitungKelilingKolam(),0.0);
	}
	

	@Test
	@FileParameters("src/test/resources/skenario_volume_kolam.csv")
	public final void testHitungVolumeKolam(double panjang, double lebar, double tinggi, double volume) {
		assertEquals(volume, kolam.hitungVolumeKolam(panjang, lebar, tinggi),0.0009);
	}
	@Test
	public final void testBukanAngka2() {
		assertEquals(5.0, kolam.hitungVolumeKolam("abcde", 2.0, 3.0));
	}
	
	@Test
	public final void testAngkaNegatif2() {
		assertEquals(30.0, kolam.hitungVolumeKolam(-3.0, -2.0, 5.0),0.0);
	}
	
	@Test
	public final void testTidakMasukAngka2() {
		assertEquals(0.0, kolam.hitungVolumeKolam(),0.0);
	}

}
