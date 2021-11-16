/**
This is the class that provides the framework for my software and allows the use of loops to give continuity.
**/
import java.util.Scanner;
class Menu{
Scanner input = new Scanner(System.in);
MetricConversions convertM = new MetricConversions();
BinaryConverter b = new BinaryConverter();
  //Displays the main menu for the software in a while loop
  public void displayMenuMain(){
  displayOptionsMain();
  int choice1 = input.nextInt();
  while(choice1>0){
    if(choice1 == 1){
      convertM.SubMenu();
    }
    else if(choice1 == 2) {
    	b.userinput();
    }
    else if(choice1 == 3){
      convertM.displayConversionFactors();
    }
    displayOptionsMain();
    choice1 = input.nextInt();
  }
  }
  //Prints out the options for the main menu of the software
  public void displayOptionsMain(){
    System.out.println("Welcome! What would you like to do? -1 to exit");
    System.out.println("1. Convert metric and imperial units");
    System.out.println("2. Convert binary and decimal");
    System.out.println("3. Display conversion factors");
  }

  
}