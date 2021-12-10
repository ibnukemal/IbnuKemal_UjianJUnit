package com.sqa.hitung.function;

public class KolamAir {
		
	public double hitungKelilingKolam(double panjang, double lebar, double tinggi) {
		double keliling = 4 *(panjang + lebar + tinggi);
		return keliling;
	}
	
	public double hitungVolumeKolam(double panjang, double lebar, double tinggi) {
		double volume = panjang * lebar * tinggi;
		return volume;
	}

	
}
