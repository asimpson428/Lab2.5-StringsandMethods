import java.util.Scanner;

public class StringLab {

	public static void main(String[] args) {
	
		Scanner scnr = new Scanner(System.in);
		String input = scnr.nextLine();
		
		System.out.println(capitalizewords "input");

	}
	
	public static void capitalizeWords (String words) {
		String output = words.substring(0, 1).toUpperCase() + words.substring(1).toLowerCase();
	}

}

	