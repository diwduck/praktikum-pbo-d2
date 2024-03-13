/**
 * File: Poligon.java 13/03/2024
 * Penulis: Thoriq Hadiwinata
 * Deskripsi: representasi dasar dari objek poligon (segi banyak)
 */


package org.bangundatar;

import org.poligon.Poligon;

public class PersegiPanjang extends Poligon {
	private double panjang,lebar;
	
	public PersegiPanjang(double panjang, double lebar, int jumlahSisi) {
		this.panjang = panjang;
		this.lebar = lebar;
		this.jumlahSisi = jumlahSisi;
	}
	
	public double hitungLuas() {
		return panjang*lebar;
	}
	
	public void printInfo() {
		System.out.println("Bangun Persegi Panjang berisi "+this.getJumlahSisi());
	}
	
}
