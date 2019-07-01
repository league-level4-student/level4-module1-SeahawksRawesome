package _03_Switch_Statement_Practice;

import javax.swing.JOptionPane;

public class CustomButtonOptionPanes {
	public static void main(String[] args) {
		String[] options = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		int input = JOptionPane.showOptionDialog(null, "Choose a day of the week", "Custom Buttons", 0, -1, null,
				options, 0);

		String choice = options[input];
		
		//use a switch statement to do something cool for each option
		switch(choice) {
		case "Sunday":
			System.out.println("Sunday mornings are great, but you get hit hard later in the day, when the sense of dread for school comes on. Then it sucks.");
			break;
		case "Monday":
			System.out.println("Monday is pretty lame, as it's the first day of the week. It the first school day, so that sucks. ");
			break;
		case "Tuesday":
			System.out.println("When it Tuesday, you typically feel a sense of dread, but that less so of a Monday, as you are 2/5 of the way of completing your school week");
			break;
		case "Wednesday":
			System.out.println("Wednesday is pretty neat, because it is that halfway point. You feel hope, but also sadness, as there are two days left of school that week");
			break;
		case "Thursday":
			System.out.println("Thursday is also a pretty neat day, because it is usually the last of the bad days. You have hope for Friday, the best weekday.");
			break;
		case "Friday":
			System.out.println("The Friday. It can be the best weekday and even better than the weekends. Everyone is typically free Friday, and after completing all the hard work at school, you are free! Nifty");
			break;
		case "Saturday":
			System.out.println("Saturday is probably the best day out of all days in a week. Period. You don't have school, you can hang out with all your friends, and you have an extra day to do stuff tomorrow.");
			break;
			
		}
	}
}
