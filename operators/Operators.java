package operators;

import javax.swing.plaf.synth.SynthStyleFactory;

public class Operators {

	public static void main(String[] args) {
		
		//Arithmetic Operators
		int passengers = 0;
		int num1 = 20;
		int num2 = 10;
		{ 
			System.out.println("Arithmetic Operators "+"\n");
			System.out.println("num1 + num 2: "+(num1 + num2));
			System.out.println("num1 - num 2: "+(num1 - num2));
			System.out.println("num1 * num 2: "+(num1 * num2));
			System.out.println("num1 / num 2: "+(num1 / num2));
			System.out.println("num1 % num 2: "+(num1 % num2));
		}
		
		//---------------------------------------------------------------------------------------------------------------------
			
		passengers = passengers + 5;
		passengers = passengers - 3;
		passengers = passengers -1 + 5;
		
		System.out.println( "Passengers :" + passengers +"\n");
		
		
	//-------------------------------------------------------------------------------------------------------------------------------
		
		int stops , fare;
		stops = 0;
		fare = 0;
		stops = stops + 1;
		fare = fare + 5 ;
		stops = stops + 1 ;
		fare = fare + 3;
		stops = stops + 1;
		fare = fare + 7;
		
		System.out.println("Stops : " + stops + "\n");
		System.out.println("The bus made $"+fare+" after "+stops+" stops \n");
		System.out.println("---------------------------------------\n");
		//-----------------------------------------------------------------------------------------------------------------
		
		// double Variable Arithmetic
		// to know how much u should pay tip
		
		double paid = 10;
		double change = 3.25;
		double tip = (paid - change )* 0.2;
		System.out.println(" The tip is : "+ tip+ "\n");
		System.out.println("---------------------------------------\n");
		//------------------------------------------------------------------------------------------------------------------
		
		// Truncation is Cutting off The digits to the right of a Decimal point
		// Casting from double to integer 
		
		double current = 17;
		double rate = 1.5;
		double future = current * rate;
		System.out.println("Without Casting "+future +"\n");
		
		System.out.println("---------------------------------------\n");
		
		int approx = (int) future;
		System.out.println("With Casting "+approx +"\n");
		
		System.out.println("---------------------------------------\n");
		
	  // Casting from integer to double 
		int x = 5;
		int y = 2;
		double div = x/y;
		System.out.println("Without Casting "+div +"\n");
		
		System.out.println("---------------------------------------\n");
		
		double accurate = (double) x/y;
		System.out.println("With Casting "+accurate +"\n");
		
		
		
		System.out.println("---------------------------------------\n");
		
		//to get the average......
		/* Your friend seems to be really good at music, 
		he managed to score 96% on his final exam!
		Now that you know all 5 subject grades, 
		update the average calculation below to calculate the 
		total average of all subjects. */

		double maths = 97.5;
		double english = 98;
		double science = 83.5;
		double drama = 75;
		double sum = maths + english + science + drama;
		double average = sum / 4;
		System.out.println(" The Average is : "+average+"\n");
		
		System.out.println("---------------------------------------\n");
		
		//-------------------------------------------------------------------------------------------------------------
		//-------------------------------------------------------------------------------------------------------------
		int a = 0 ;
		int r = 4;
		double v = 3;
		a = a + 2;
		v = a + r - 7;
		r = a *3;
		System.out.println("a = "+a);
		System.out.println("r = "+r);
		System.out.println("v = "+v+ "\n");
		
		
		//Assignment Operators
		
		{ System.out.println(" Assignment Operators"+"\n");
		
		num1 = num2;
		System.out.println(" = output" + num1);
		
		num1 += num2;
		System.out.println(" += output" + num1);
		
		num1 *= num2;
		System.out.println(" *= output" + num1);
		
		num1 /= num2;
		System.out.println(" /= output" + num1);
		
		num1 %= num2;
		System.out.println(" %= output" + num1);}
		
		
		System.out.println("\n");
		//-------------------------------------------------------------------------------------------------------------
		//-------------------------------------------------------------------------------------------------------------
		
		
		//Auto-increment and Auto-decrement Operators
		
		System.out.println("Auto-increment and Auto-decrement Operators"+"\n");
		
	    int	num3 = 20;
	    int num4 = 40;
	      num3++;
	      System.out.println("num1++ is: "+num3);
	      
	      num4--;
	      System.out.println("num2-- is: "+num4);
	      
	      //------------------------------------------------------------------------------------------------------------
	      System.out.println("---------------------------------------\n");
		
	      
	      // String Variables
	   
	        String driver;
			driver = "Hamish";
			
		// to print this number of the characters use .length()
			 int letters = driver.length();
			 System.out.println(letters);
			 
		// to make all the characters Capital use .toUpperCase()
			 
			 driver = driver.toUpperCase();
			 System.out.println(driver);
			 
		 //------------------------------------------------------------------------------------------------------------
		     System.out.println("---------------------------------------\n");
		 
		     
		 // String Concatenation  this to add Strings netx each other 
		     
		    String fristName = "Mohamed";
		    String lastName = "Sabbah";
		    String fullName = fristName +" "+ lastName;
		    
		    System.out.println("The Full Name is: " + fullName);
		    
		    
		 //------------------------------------------------------------------------------------------------------------
		   System.out.println("---------------------------------------\n");
				 
		// Decision Making ......
		// for example if shirts are discount 20% or more then that's a good deal or if i already have a lot of shirts then no deal will interest me, etc
		 //Using If statement.....
		   
		   boolean isCold = true ; // true or false
		   
		   if(isCold) {
			   //executes Only if isCold is true..
			   System.out.println("It's cold, wear a coat\n");
		   }
		   System.out.println("---------------------------------------\n");
		   
		   // example light traffic for car
		   boolean isItGreen = true;
		   
		   if(isItGreen) {
			   // check if it is green and add the speed
			   int carSpeed = 100;
			   
			   System.out.println("Drive \n");
			   System.out.println(" the Care Speed is : "+ carSpeed+"\n");
		   }
		   System.out.println("---------------------------------------\n");
		   // example to make Windshield Wipers working when is Raining
		   
		   boolean isRaining ;
		   
		   if(isRaining = true) {
			   System.out.println("windshield Wipers on\n");
		   }
		   
		   System.out.println("---------------------------------------\n");
		   // using If statement and else Statement......
		   
		   boolean isGreen = false;
		   if(isGreen == true) {
			   System.out.println("DRIVE!");
		   }else {
			   System.out.println("STOP..\n");
		   }
		   
		   System.out.println("---------------------------------------\n");
		   
		   
		   // Using else if Statement
		   
		   boolean isLightGreen = false;
		   boolean isLightYellow = true;
		   
		   if(isLightGreen == true) {
			   // traffic light is green
			   System.out.println("Drive!\n");
		   }else if (isLightYellow == true) {
			   // light is Not Green but is Yellow
			   System.out.println("Slow Down.\n");
		   }else {
			   //light neither green nor yellow
			   System.out.println("STOP...\n");
		   }
		   
		   
		   System.out.println("---------------------------------------\n");
		   
		   // example of Library Card
		   
		   boolean passport = false;
		   boolean birthCertificate = true;
		   boolean driversLicense = true;
		   
		   if (passport) {
			   System.out.println("A passport is a valid ID..\n");
		   }else if (birthCertificate) {
			   System.out.println("A Birth Certificate is a valid ID \n");
		   }else if (driversLicense) {
			   System.out.println("A Driver License is a valid ID..\n"); 
		   }else {
			   System.out.println("Invalid Id. Your application is denied\n");
		   }
		   
		   
		   System.out.println("---------------------------------------\n");
		   
		  // NOTE..........
		   
		   /* Boolean Expressions 
		    Booleans are true or false 
		    values can directly assigned......
		    boolean b1 = true;
		    boolean b2 = false
		    
		    Or calculated with tests like comparisons!
		    boolean b3 = 3 < 5; --> true
		    boolean b4 = 3 > 5; --> false
		    
		    you can also use it with <= ,>= , == , !=
		    */
		   
		   // Example Tickets to the Museum ...
		   
		   /*  Automated Discount
		    General ticket cost $10
		    Discount $5
		    1) Age 15 and under
		    2) Age over 60
		    3)student
		    */
		   
		   int ticketPrice = 10;
		   int age = 20;
		   boolean isStudent = true;
		   
		   if(age <= 15) {
			   ticketPrice = 5;
		   }else if(age >= 60) {
			   ticketPrice = 5;
		   }else if(isStudent) {
			   ticketPrice = 5;
		   }else {
			   ticketPrice = 10;
		   }System.out.println("The Price is: "+ticketPrice+"\n");
		   
		   System.out.println("---------------------------------------\n");  
		   // Logical Operators
		   /*
		    Three main Logical Operators..
		    1) AND 3 < 5 && 2 > 5 --> false
		    2) OR 3 < 5 || 2 > 15 --> true
		    3) NOT !(3 < 5) --> false
		    */
		   
		   if(age <=15 || age > 60 || isStudent) {
			   ticketPrice = 5;
		   }else {
			   ticketPrice = 10;
		   }System.out.println("Ticket Price: "+ticketPrice+"\n");
		   
		   System.out.println("---------------------------------------\n");  
		   
		   // Nested if Statements
		   // Example of pick a movie that Everyone will like
		   
		   boolean action = true;
		   boolean romance = true;
		   boolean horror = false;
		   boolean comedy = true;
		   
		   if (action && romance) {
			   //include action and romance
			   System.out.println("This movie includes action and romance\n");
			   if (comedy || horror) {
				   //everyone's preferences have been met !
				   System.out.println("This also includes comedy or horror\n");
			   }
		   }
		   
		   System.out.println("---------------------------------------\n");
		   
		   
		   // Switch Statement
		   // Checks the value of a variable and tests it for equality
		   // example for smart coffee Machine
		   
		   int passcode = 555;
		   String coffeeType;
		   
		   switch(passcode) {
		   case 555 :
			   coffeeType = "Espresso";
			   break;
		   case 312:
			   coffeeType = "Vanilla Latte";
			   break;
		   case 629:
			   coffeeType = "drip coffee";
			   break;
			   default: 
				   coffeeType = "Unknown";
				   break;
		   }System.out.println(coffeeType);
		   
		   System.out.println("---------------------------------------\n");
		   //----------------------------------------------------------------------------------------
		   // Calling the function or the method
		   chorus();
		   
		   System.out.println("---------------------------------------\n");
		   // Calling the function by values
		   greeting("New York");
		 
		   // Calling the function by variables
		   String city = "Alexandria";
		   greeting(city);
		   
		   System.out.println("---------------------------------------\n");
		   
		   // Calling Functions with return values
		   int returnedLike = likePhoto(0, "Nice Photo!", false);
		   int totalLikes = likePhoto(returnedLike, "I like this", true);
		   
		   System.out.println("---------------------------------------\n");
		   
		   double theRest = mackChange(10.0, 30);
		   
		   System.out.println("---------------------------------------\n");
		   
		   // Calling The Random method
		   int roll1 = rollDice();
		   int roll2 = rollDice();
		   System.out.println("Roll 1: " + roll1);
		   System.out.println(" Roll 2: "+ roll2);
		   
		 int roll3 =  rollDice(10);
		 System.out.println(roll3);
		 
		   System.out.println("---------------------------------------\n");
		   
		   // Calling Warning Alert
		   raiseAlarm(3);
		   System.out.println("---------------------------------------\n");
		   
		   raiseAlarm2(5);
		   System.out.println("---------------------------------------\n");
		   
		   countBlocks(5);
		   
		   
		   System.out.println("---------------------------------------\n");
		   evenNumber();
	}
	
	
	/*----------------------------------------------------------------------------------------
	 * ------------------------------------------------------------------------------
	 * ------------------------------------------------------------------
	 */
	
	
	  /* What is a Function?
	    * Functions :
	    * Organize and group code perform a specific task.
	    * Contains the code a function executes.
	    * Calling a function is equivalent to executing the code in the definition.
	    * Function call to the rescue.
	    */
	   /*
	    * Importance of Functions
	    * 1) Easy to reuse code
	    * 2) Organize and group code
	    * 3) More maintainable code
	    */
	// to call the function use the name of it +(); 
	public static void chorus() {
		//print out the song
		System.out.println("Once I had a love and it was a gas");
		System.out.println("Soon turned out had a heart of glass");
		System.out.println("Seemed like the real thing, only to find");
		System.out.println("Mucho mistrust, love's gone behind");
	}
	
	/* Parameters and Arguments
	 * Parameters: 
	 Variables in the parentheses of our function, 
	 that we can then use inside our functions
	 
	 * Arguments:
	1) Specific values passed into function call
	 2)  use variables Easy to change variable values input the correct type of variable.
	 */
	
	public static void greeting(String location) {
		// greet a specific location
		System.out.println("Hello, "+ location);
	
	}
	
	/* use functions with return value
	 to return a value you need:
	  1) a return type (void ,int, String , boolean)
	  2) a return Statement (line of code that returns a value)
	 */
	
	public static int likePhoto(int currentLikes, String comment, boolean like) {
		// prints out comment
		System.out.println("feedback: "+ comment);
		if (like) {
			//increase number of likes by 1
			currentLikes = currentLikes + 1;
		}
		// print out current number of likes
		System.out.println("Number of likes: "+ currentLikes);
		return currentLikes;
		
	}
	
	// example for Functions with returns vales ( Cashier Program)
	// Automatically calculates correct change
	
	public static double mackChange(double itemCost, double dollarsProvided){
		double change = dollarsProvided - itemCost;
		System.out.println("The change is: " + change);
		return change;
		
	}
	
	/*
	 Returning Random Numbers (Simulating random events)
	 Math.random();
	 
	* Returns a random decimal value between 0 and 1
	* Range includes 0 but not 1
	* Returns a random decimal value between 0 and 1 can work with the returned value
	*/
	
	// Example Rolling Dice 
	
	public static int rollDice() {
		// random num between 0 and (almost) 1
		double randomNumber = Math.random();
		
		// change range to 0 to (almost) 6 
		randomNumber = randomNumber * 6 ;
		
		 // shift range up one
		randomNumber = randomNumber + 1;
		
		// cast to integer (ignor decimal part)
		// ex. 6.998 becomes 6
		int randomInt = (int) randomNumber;
		return randomInt;
		
	
	}
	
	// Using the sides parameter, change this code so that it returns
	// the correct range of roll values no matter the number of sides provided.
	// ex. For an 8-sided dice the numbers returned should be integers between 1-8

	public static int rollDice(int sides){
	        // random num between 0 and (almost) 1
	        double randomNumber=Math.random();

	        // change range to 0 to (almost) 6
	        randomNumber=randomNumber* sides;

	        // shift range up one
	        randomNumber=randomNumber+1;

	        // cast to integer (ignore decimal part)
	        // ex. 6.998 becomes 6
	        int randomInt=(int)randomNumber;

	        // return statement
	        return randomInt;
	        }
	
	
	/* While Loops 
	 * while loops allow you to repeat an if condition over and over for as long as that condition remains true, hence the name while!
	To create a while loop, simply follow the same steps like an if condition, but replace the if with a while to look something like this:
	while(isRaining){
	   System.out.println("It's still raining outside!");
	   isRaining = checkWeather();
	}
	System.out.println("Now it's not raining anymore");
	This code block above will continue to print the message "It's still raining outside!" for as long as the boolean isRaining is true, 
	once the function checkWeather() returns false isRaining will no longer be true, 
	so the while loop would end and the message "Now it's not raining anymore" will be displayed.
	Unlike if blocks however, while loops don't have else blocks, they are simply like a repeated if block that would only end when the condition becomes false.
		 */
	
	// alarm example for while loop
	
	// makes a single beep sound
	public void beep() {
		
	}
	
	// @return true if alarm is on , false if off
	public boolean checkAlarm() {
		boolean check = true;
		return check;
	}
	
	//keep beeping until snoozed
	public void alarm() {
		boolean on = checkAlarm();
		while(on) {
			beep();
			on = checkAlarm();
		}
		
	}
	
	// example while loop for roll dice
	
	public int keepRolling() {
		int dice1 = rollDice();
		int dice2 = rollDice();
		int dice3 = rollDice();
		int count = 1;
		while(!(dice1 == dice2 && dice2 == dice3)) {
			// we need to re-roll
			dice1 = rollDice();
			dice2 = rollDice();
			dice3 = rollDice();
			count = count + 1;
		}
		return count;
	}
	
	//  example alter warning with while loop
	
	public static void raiseAlarm(int numOfWarnings) {
		int i = 1; // 1) loop counter
		
		while(i <= numOfWarnings) { //2) loop condition
			System.out.println("Warning!");
			
			i++;  //3) loop increment
		}
	}
	
	// using for loops
	public static void raiseAlarm2(int numOfWarnings) {
		for (int i = 1 ; i <= numOfWarnings ; i++) {
			System.out.println(" warong # " + i);
		}
	}
	
	// example using for loop counting the blocks to build pyramids
	
	public static int countBlocks(int levels) {
		int total = 0;
		for(int i = 1; i <= levels; i++) {
			total = total + (i * i);
			
		}System.out.println(total);
		return total;
	}
	
	//  the counting up (increment)
	public static void countBlocks() {
		
		for(int i = 1; i <= 5; i++) {
			System.out.println(i);
			
		}
	}
	
	//  the counting down (decrement)
	public static void countBlocks3() {
		
		for(int i = 5; i >= 1; i--) {
			System.out.println(i);
			
		}
	}
	
	// print the even numbers between 2 and 10
	
	public static void evenNumber() {
		for (int i = 2; i <=10; i+=2) {
			System.out.println(i);
			
		}
	}
	
	// Arrays  and loops
	// example of Array the get the average of the temperatures
	public static double calculateAverage(double [] temperatures) {
		// to get the size of the array
		int size = temperatures.length;
		double total = 0;
		for(int i = 0; i < size; i ++) {
			total += temperatures[i];
		}
		double average = total/size;
		return average;
		
	}
	
	// Example array search (Find the Longest Name)
	/**
	 * Search an array of name
	 * for the longest name
	 * @param names array of names
	 * @return String : the Longest name found
	 */
	public static  String findLongestName(String [] names) {
		int size = names.length;
		String longestName = names[0];
		for (int i = 1; i < size ; i++) {
			if(names[i].length() > longestName.length()) {
				longestName = names[i];
			}
		}
		return longestName;
	}
	
	
}

