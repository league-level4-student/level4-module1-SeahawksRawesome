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
					JOptionPane.showMessageDialog(null, "  ");
					break;
				case TAURUS:
					JOptionPane.showMessageDialog(null, "  ");
					break;
				case GEMINI:
					JOptionPane.showMessageDialog(null, "  ");
					break;
				case CANCER:
					JOptionPane.showMessageDialog(null, "  ");
					break;
				case LEO:
					JOptionPane.showMessageDialog(null, "  ");
					break;
				case VIRGO:
					JOptionPane.showMessageDialog(null, "  ");
					break;
				case LIBRA:
					JOptionPane.showMessageDialog(null, "  ");
					break;
				case SCORPIO:
					JOptionPane.showMessageDialog(null, "  ");
					break;
				case SAGITTARIUS:
					JOptionPane.showMessageDialog(null, "  ");
					break;
				case CAPRICORN:
					JOptionPane.showMessageDialog(null, "  ");
					break;
				case AQUARIUS:
					JOptionPane.showMessageDialog(null, "  ");
					break;
				case PISCES:
					JOptionPane.showMessageDialog(null, "  ");
					break;
				}
			}
	
	// 3. Make a main method to test your method
	public static void main(String [] args) {
		Zodiac zode = Zodiac.AQUARIUS;
		Horoscoptic(zode);
			
		
	}
}
