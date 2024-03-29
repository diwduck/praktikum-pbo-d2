/**
 * File: MPoligon.java 13/03/2024
 * Penulis: Thoriq Hadiwinata
 * Deskripsi: representasi dasar dari objek poligon (segi banyak)
 */



package org.main;

import org.bangundatar.*;

public class MPoligon {
	public static void main(String[] args) {
		PersegiPanjang persegi = new PersegiPanjang(10,10,4);
		persegi.printInfo();
		System.out.println("Luas Persegi Panjang : "+persegi.hitungLuas());
		Segitiga segitiga = new Segitiga(6,5,3);
		segitiga.printInfo();
		System.out.println("Luas Segitiga : "+segitiga.hitungLuas());
	}
}
