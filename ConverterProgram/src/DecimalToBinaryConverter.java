import java.util.Scanner;
public class DecimalToBinaryConverter {
	Scanner input = new Scanner(System.in);
	double newD;
		//handles inputs
		public void UserInput(){
			System.out.println("Give me an integer number!");
			newD = input.nextInt();
			convertToD();
		}
		//Does the converting
		public void convertToD() {
			//Step 1: get new binary double
			getD();
			String newB = "";
			for(int i = 0; newD/2>0; i++) {
				if(newD%2>0) {
					newB = newB+"1";
					newD = (newD/2)-0.5;
				}
				else {
					newB = newB+"0";
					newD = newD/2;
				}
			}
			//Step 2: typecast the double of newB as a string so we can reverse it for step 3
			String newBSTR = (String) newB;
			//Step 3: reverse binary string for LSB on right
			String reverse = "";
			for(int i=0; i<newBSTR.length(); i++) {
				char j = newBSTR.charAt(i);
				//adds each character to empty string.
				reverse = j+reverse;
			}
			System.out.println(reverse);
			System.out.println("");
			
		}
		//Getters and setters
		public double getD() {
			return newD;
		}
		public void setD(double D) {
			this.newD = D;
		}

}
