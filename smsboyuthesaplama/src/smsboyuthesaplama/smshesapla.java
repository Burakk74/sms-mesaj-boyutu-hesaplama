package smsboyuthesaplama;

import java.util.Scanner;

public class smshesapla {

	/*
	 * 
	 * her 160 karakter 1 sms e tekabül etmektedir.
	 * 
	 */
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Mesajınızı yazın :");
		String sms = input.nextLine();
		
		double sms_hak =(Math.ceil(sms.length() / 160.0 ));
		int sms_uzunluk = sms.length();
		
		
		System.out.println("Mesajınız " + sms_uzunluk + " kadardır. " + sms_hak + " kadar sms hakkı bakiyenizden düşmüştür.");
	
		
		
		
	}
}
