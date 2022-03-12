package week3Arrays;

public class week3CodingAssignment {

	public static void main(String[] args) {
		//Question 1 
		//Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93
		//print the difference of the item in the last element of the array (length of ages - 1)
		//from the item in the first element
		
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		int difference = ages[ages.length-1] - ages[0];
		System.out.println(difference);
		//loop to print iterate through the array and calculate the average age
		double sum = 0.0;
		for (int i = 0; i < ages.length; i++) {
			sum += ages[i];
		}
		double average = sum / ages.length;
		System.out.println(average);
		
		//Question 2
		//Create an array of String called names that contains "Sam, Tommy, Tim, Sally, Buck and Bob."
		//Use a loop to iterate through the array and calculate the average number of letters per name.
		
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		double numLetters = 0.0; //total number of letters for the Strings in the array
		for (int i = 0; i < names.length; i++) {
			//loop through to add the lengths of each string in the array to numLetters
			numLetters += names[i].length();
		}
		double stringAverage = numLetters / names.length;
		System.out.println(stringAverage);
		
		//Loop to iterate through the array again and concatenate all the names together, separated by spaces,
		
		String concatenate = ""; //new String to take up all the strings in one
		for (int i = 0; i < names.length; i++) {
			//loop through to add the actual strings in the array to the string cocatenate
			concatenate += names[i];
		}
		System.out.println(concatenate);
		
		//Question 3
		//To access the last element of any array, do arrayName[arrayname.length - 1];
		
		//Question 4
		//To access the first element of any array, do arrayName[0];
		
		//Question 5
		//Create a new array of int called nameLengths. Loop over the previously created names
		//array and add the length of each name to the nameLengths array.
		
		int[] nameLengths = new int [names.length];
		for (int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length();
		}
		
		//Question 6
		//Write a loop to iterate over the nameLengths array and calculate
		//the sum of all the elements in the array. Print the result to the console.
		
		int sumNameLengths = 0;
		for (int i =0; i < nameLengths.length; i++) {
			sumNameLengths += nameLengths[i];
		}
		System.out.println(sumNameLengths);	
	}
	
	//Question 7
	//Write a method that takes String word and int n as arguments and will loop to add
	//each word in the iteration of the loop to String complete
	//will return the String complete
	
	static String completeWord(String word, int n) {
		String complete = "";
		for (int i = 0; i < n; i++) {
			complete += word;
		}
		return complete;
	}
	
	//Question 8
	//Method that takes Strings firstName and lastName then returns the full name
	
	static String fullName(String firstName, String lastName) {
		String full = firstName + " " + lastName;
		return full;
	}
	
	//Question 9
	//Method that takes an array of int and returns true if the sum of all ints
	//in the array is greater than 100
	
	static boolean overHundred(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		if (sum > 100) {
			return true;
		} else {
			return false;
		}
	}
	
	//Question 10
	//Method that takes an array of double and returns the averages of all elements in the array
	
	static double averageDouble(double[] array) {
		double sum = 0.0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return sum / array.length;
	}
	
	//Question 11
	//Method that akes two arrays of double and returns true if average of elements in the first
	//array is greater than the average of elements in the second array
	
	static boolean greater(double[] firstArray, double[] secondArray) {
		double sumFirstArray = 0.0;
		double sumSecondArray = 0.0;
		for (int i = 0; i < firstArray.length; i++) {
			sumFirstArray += firstArray[i];
		}
		for (int j = 0; j < secondArray.length; j++) {
			sumSecondArray += secondArray[j];
		}
		double averageFirst = sumFirstArray / firstArray.length;
		double averageSecond = sumSecondArray / secondArray.length;
		if (averageFirst > averageSecond) {
			return true;
		} else {
			return false;
		}
	}
	
	//Question 12
	//Method called willBuyDrink that takes a boolean of isHotOutside and
	//a double moneyInPocket and returns true if it is hot outside and
	//if moneyInPocket is greater than 10.50
	
	static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if (isHotOutside == true && moneyInPocket > 10.50) {
			return true;
		} else {
			return false;
		}
	}
	
	//Question 13
	//Own method to solve problem. The inflation rate in the US is soaring. This
	//method is used to return true if your new wages for the upcoming year
	//are beating the inflation rates. If yes, you should probably look for a different job.
	//This takes in 3 parameters, this year's current wage, next year's wage, and the inflation rate as a percent (eg 0.08).
	//Within the method, the inflation rate is multiplied by the current wage. If it is less than
	//next year's wage, then the method will return true. Else it will return false.
	
	static boolean beatInflation(double currentWage, double newWage, double inflation) {
		if (newWage > currentWage * (1 + inflation)) {
			return true;
		} else {
			return false;
		}
	}
}
