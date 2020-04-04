/**
 * 
 */
package com.bilisimegitim.gui;

import javax.swing.JFrame;

import com.bilisimegitim.gui.ekranlar.GirisEkran;

public class Calistir {

	
	public static void main(String[] args) {
		
		GirisEkran girisEkran = new GirisEkran();
		
		girisEkran.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Ekranin kosesindeki carpiya basinca kapanmasi icin
		girisEkran.setSize(450, 300); // Ekranin Boyunu veririz
		girisEkran.setLocationRelativeTo(null);//Ekranin Ortasinda Cikmasi Icin
		girisEkran.setVisible(true); // Ekrani Göstermek icin
		
		
		
		

	}

}
