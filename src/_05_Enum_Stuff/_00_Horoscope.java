package _05_Enum_Stuff;

import javax.swing.JOptionPane;

public class _00_Horoscope {
	// 1. Create an enum in a separate file called Zodiac that contains a category for
	//    all 12 zodiac signs.
	
	
	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane to display
	//    a different horoscope based on the Zodiac's state.
			public static void Horoscoptic(Zodiac zode) {
				switch(zode) {
				case ARIES:
					JOptionPane.showMessageDialog(null, "You are an Aries, one misspelling away from the god of war.");
					break;
				case TAURUS:
					JOptionPane.showMessageDialog(null, "Taurus is cool, but I prefer the pokemon.");
					break;
				case GEMINI:
					JOptionPane.showMessageDialog(null, "Geminis are wack.");
					break;
				case CANCER:
					JOptionPane.showMessageDialog(null, "Oeuf...");
					break;
				case LEO:
					JOptionPane.showMessageDialog(null, "If you are a Leo, you probably care about horoscopes too much.");
					break;
				case VIRGO:
					JOptionPane.showMessageDialog(null, "VirGO and do something with your life instead of looking at horoscopes.");
					break;
				case LIBRA:
					JOptionPane.showMessageDialog(null, "You're basically a Libra if you have OCD.");
					break;
				case SCORPIO:
					JOptionPane.showMessageDialog(null, "If you're a scorpio, you're an emotional wreck. That's probably why you're looking at horoscopes.");
					break;
				case SAGITTARIUS:
					JOptionPane.showMessageDialog(null, "If you're a Sagittarius, you probably don't give a damn what your personality is, you just like it for the name.");
					break;
				case CAPRICORN:
					JOptionPane.showMessageDialog(null, "Beyblade.");
					break;
				case AQUARIUS:
					JOptionPane.showMessageDialog(null, "Fancy way of saying water.");
					break;
				case PISCES:
					JOptionPane.showMessageDialog(null, "IDK what this one is, but it probably sucks like the rest. Don't waste your time looking at horoscopes.");
					break;
				}
			}
	
	// 3. Make a main method to test your method
	public static void main(String [] args) {
		Zodiac zode = Zodiac.LIBRA;
		Horoscoptic(zode);
			
		
	}
}
