package Taksi;

import java.util.Scanner;

public class Taksi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Lutfen gidilen  mesafeyi giriniz : ");
		int km=scan.nextInt();
		int girisFiyat=10 ;
		double kmFiyat=2.20 ;
		double ucret = girisFiyat +(km * kmFiyat);
		
		ucret = (ucret <20) ? 20  : ucret ; 
		System.out.println("Ucret : "  +ucret);
	
	}

}
