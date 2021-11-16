/*
This is the class that makes the calculation to convert between imperial and metric units. I'll use this as the calculator section in my menu class.
*/
import java.util.Scanner;
class MetricConversions{
Scanner input = new Scanner(System.in);

  //This is the sub menu that displays when the user selects (1) from the main menu
  public void SubMenu(){
  displaySubOptions();
  int choice = input.nextInt();
  while(choice>0){
    if(choice == 1){
      metricToMetric();
    }
    else if(choice == 2){
      imperialToMetric();
    }
    
    else if(choice == 3){
      metricToImperial();
    }
    displaySubOptions();
    choice = input.nextInt();
  }
  }
  //This displays the options in the submenu. I'll call it so I don't have to type this out twice and it's more organized. Same concept for this method is used in the main menu.
  public void displaySubOptions(){
  System.out.println("What would you like to convert? -1 to exit");
  System.out.println("1). A metric prefix to another prefix");
  System.out.println("2). An imperial unit to a metric unit");
  System.out.println("3). A metric unit to an imperial unit");
  }

  //This method takes in the users input and converts between various metric prefixes.
  public void metricToMetric(){
  System.out.println("Which prefix would you like to convert from?");
  System.out.println("1 = kilo");
  System.out.println("2 = base");
  System.out.println("3 = milli");
  int from = input.nextInt();
  System.out.println("Enter the number you'd like to convert");
  int start = input.nextInt();
  System.out.println("Which prefix would you like to convert to?");
  System.out.println("1 = kilo");
  System.out.println("2 = base");
  System.out.println("3 = milli");
  int to = input.nextInt();
  int result;
  if(from == 1){
    if(to == 1){
      result = start;
      System.out.println(start + " kilo is equal to " + result + " kilo");
    }
    else if(to == 2){
      result = start*1000;
      System.out.println(start + " kilo is equal to " + result + " base units");
    }
    else if(to == 3){
      result = start*1000000;
      System.out.println(start + " kilo is equal to " + result + " milli");
    }
  }
  else if(from == 2){
    if(to == 1){
      result = start/1000;
      System.out.println(start + " base units is equal to " + result + " kilo");
    }
    else if(to == 2){
      result = start;
      System.out.println(start + " base units is equal to " + result + " base units");
    }
    else if(to == 3){
      result = start*1000;
      System.out.println(start + " base units is equal to " + result + " milli");
    }
  }
  else if(from == 3){
    if(to == 1){
      result = start/1000000;
      System.out.println(start + " milli is equal to " + result + " kilo");
    }
    else if(to == 2){
      result = start/1000;
      System.out.println(start + " milli is equal to " + result + " base units");
    }
    else if(to == 3){
      result = start;
      System.out.println(start + " milli is equal to " + result + " milli");
    }
  }
  }

  //This method takes in user input and converts from an imperial unit to a metric unit. This is either a volume, weight or length.
  public void imperialToMetric(){
  System.out.println("Would you like to convert: ");
  System.out.println("1. A volume (gallons to liters");
  System.out.println("2. A weight (pounds to kilograms)");
  System.out.println("3. A length (miles to kilometers)");
  int from2 = input.nextInt();
  if(from2 == 1){
    System.out.println("Enter a number of gallons to convert");
    int start2 = input.nextInt();
    double result2 = start2*3.785;
    System.out.println(start2 + " gallons is equal to " + result2 + " liters");
  }
  else if(from2 == 2){
    System.out.println("Enter a number of pounds to convert");
    int start2 = input.nextInt();
    double result2 = start2*.454;
    System.out.println(start2 + " pounds is equal to " + result2 + " kilograms");
  }
  else if(from2 == 3){
    System.out.println("Enter a number of miles to convert");
    int start2 = input.nextInt();
    double result2 = start2*1.61;
    System.out.println(start2 + " miles is equal to " + result2 + " kilometers");
  }
  }
  //This method takes in user input and converts from a metric unit to an imperial unit. This is either a volume, weight or length once again. This method is pretty much a reverse of the imperialToMetric method.
  public void metricToImperial(){
  System.out.println("Would you like to convert: ");
  System.out.println("1. A volume (Liters to gallons)");
  System.out.println("2. A weight (kilograms to pounds)");
  System.out.println("3. A length (Kilometers to miles)");
  int from3 = input.nextInt();
  if(from3 == 1){
    System.out.println("Enter a number of liters to convert");
    int start3 = input.nextInt();
    double result3 = start3*.264;
    System.out.println(start3 + " liters is equal to " + result3 + " gallons");
  }
  else if(from3 == 2){
    System.out.println("Enter a number of kilograms to convert");
    int start3 = input.nextInt();
    double result3 = start3*2.20;
    System.out.println(start3 + " kilograms is equal to " + result3 + " pounds");
  }
  else if(from3 == 3){
    System.out.println("Enter a number of kilometers to convert");
    int start3 = input.nextInt();
    double result3 = start3*.621;
    System.out.println(start3 + " kilometers is equal to " + result3 + " miles");
  }
  }

  //This method displays the conversion factors that can be displayed in the main menu. I put it here to make it easier to access them while coding the calculator.
  public void displayConversionFactors(){
	System.out.println("****METRIC AND IMPERIAL****");
    System.out.println("Metric Scale for this calculator!:");
    System.out.println("Kilo = K = 1,000 base");
    System.out.println("Milli = m = .001 base");
    System.out.println("Volume:");
    System.out.println("1 gallon = 3.785 liters");
    System.out.println("1 liter = .264 gallons");
    System.out.println("Weight:");
    System.out.println("1 pound = .454 Kg");
    System.out.println("1 Kg = 2.20 pounds");
    System.out.println("Length:");
    System.out.println("1 mile = 1.61 Km");
    System.out.println("1 Km = 0.621 miles");
    System.out.println("****BINARY****");
    System.out.println("Binary is done in base 2 with the least significant bit (LSB) on the right");
    System.out.println("Each bit is either a 1 or a zero");
    System.out.println("Counting from right to left it starts at 2^0, then 2^1 and so on, you add every bit that's a 1");
    System.out.println("Converting to binary from decimal is done by dividing the decimal number continually by 2 until the decimal number reaches 0");
    System.out.println("For each iteration of dividing by 2, if the remainder is 0, the bit from left to right is 0. If it is 1, the corresponding bit is 1");
    System.out.println("");
  }
}