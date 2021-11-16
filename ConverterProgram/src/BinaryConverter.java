/*
 * This converts binary to decimal and vice versa
 */
import java.util.Scanner;
import java.lang.Math;
public class BinaryConverter {
Scanner input = new Scanner(System.in);
DecimalToBinaryConverter DtoB = new DecimalToBinaryConverter();
String strnewbinnum;
	public void userinput() {
		displayOptions();
		int choice = input.nextInt();
		/*needed to add an extra input.NextLine(); because of a weird thing that scanner was doing with input.nextInt(); 
		 *instead of letting me input the binary number it was completely skipping it, putting a zero and going back to displayOptions.
		 */
		input.nextLine();
		while(choice>0) {
			if(choice==1){
				bintodinput();
			}
			else if(choice==2) {
				DtoB.UserInput();
			}
			displayOptions();
			choice = input.nextInt();
		}
	}
	
	/*
	 * STUFF TO CONVERT BINARY TO DECIMAL
	 */
	public void bintodinput() {
		System.out.println("Enter a binary number");
		strnewbinnum = input.nextLine();
		setbinnum(strnewbinnum);
		convertBtoD();
	}
	public void convertBtoD() {
		getbinnum();
		// first need to reverse the string so you can add the powers of 2 to the ith power
		String reverse = "";
		for(int i=0; i<strnewbinnum.length(); i++) {
			char j = strnewbinnum.charAt(i);
			//adds each character to empty string.
			reverse = j+reverse;
		}
		//next we can convert the binary string to decimal string
		int decimal=0;
		for(int i=0; i<reverse.length(); i++) {
			char bit = reverse.charAt(i);
			if(bit == '1') {
				decimal= decimal+(int) Math.pow(2,i);
			}
			else {
				decimal = decimal + 0;
			}
		}
		System.out.println(decimal);
		System.out.println("");
	}
	
	// gets and sets
	public String getbinnum() {
		return strnewbinnum;
	}
	public void setbinnum(String binnum) {
		this.strnewbinnum=binnum;
	}
	//options for this sub menu
	public void displayOptions() {
		System.out.println("0. Go back");
		System.out.println("1. Convert binary to decimal");
		System.out.println("2. Convert decimal to binary");
	}
	/*
	 * STUFF TO CONVERT DECIMAL TO BINARY
	 */
}
