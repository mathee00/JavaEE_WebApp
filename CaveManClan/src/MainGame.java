import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class MainGame {

	public static void main(String[] args) {
		
		/*
		//start the game with guessing a number, demo of variables and while loop.
		Random rand = new Random();
		
		int theSecretNumber = rand.nextInt(10);
		int yourGuess = 0;
		
		Scanner scan = new Scanner(System.in);
		
		while(theSecretNumber != yourGuess) {
			System.out.println("I have a secret number. Enter a guess");
			//get input from the user
			yourGuess = scan.nextInt();
			
			//check to see if the guess was correct
			if(yourGuess < theSecretNumber) {
				System.out.println("Too low. Try guessing a larger number");
			}else if(yourGuess > theSecretNumber) {
				System.out.println("Too high. Try guessing a smaller number");
			}
			System.out.println();
		}

		System.out.println("You got the secret number!");
		
		
//======================================================		
		
		
		//show me some loops
		for(int i = 0; i < 9; i++) {
			System.out.print("The number is "+ i +",");
		}
		
		//show me some arrays
		int[] luckyNumbers = {13, 14, 19, 29, 34, 98};
		System.out.println("The first item of the array is "+luckyNumbers[0]);
		System.out.println("=======================");
		System.out.println("The array length = "+luckyNumbers.length);
		System.out.println("=======================");
		
		//Printing the array with for loop
		for(int i = 0; i < luckyNumbers.length; i++) {
			System.out.println("The number in the position "+ i +" is "+luckyNumbers[i]);
		}
		System.out.println("=======================");
		
		//Printing the array with for each loop
		for(int number : luckyNumbers) {
			System.out.println("The lucky number is "+number);
		}
		
		for (int j : luckyNumbers) {
			System.out.println(j);
		}
		System.out.println("=======================");
		
		//show me some lists
		ArrayList<Integer> unluckyNumbers = new ArrayList<>();
		
		unluckyNumbers.add(7);
		unluckyNumbers.add(17);
		unluckyNumbers.add(27);
		unluckyNumbers.add(57);
		unluckyNumbers.add(79);
		
		System.out.println();
		System.out.println("Size of the Array List is "+unluckyNumbers.size()+"\n");
		
		for(int i = 0; i < unluckyNumbers.size(); i++) {
			System.out.println("The unlcuky number in the position "+ i +" is "+unluckyNumbers.get(i));
		}
		
		for(int number : unluckyNumbers) {
			System.out.println("Unlucky number is "+number);
		}
		*/
		
		//show me some objects
		CaveMan c1 = new CaveMan();
		CaveMan c2 = new CaveMan("Ogg", 17, 92.4f, new ArrayList<Rock>());
		
		c1.sayHi();
		c2.sayHi();
		
		c1.setName("Ugg");

		c1.sayHi();
		c2.sayHi();
		
		System.out.println("C1 = "+c1);
		System.out.println("C2 = "+c2);
		
		Rock r1 = new Rock();
		Rock r2 = new Rock("Red", 88.4f);
		Rock r3 = new Rock("Green", 23.3f);
		Rock r4 = new Rock("Grey", 5.2f);
		
		ArrayList<Rock> allOftheRocks = new ArrayList<>();
		allOftheRocks.add(r1);
		allOftheRocks.add(r2);
		allOftheRocks.add(r3);
		allOftheRocks.add(r4);
		
		ArrayList<Rock> someRocks = new ArrayList<>();
		someRocks.add(r1);
		someRocks.add(r3);
		
		c1.setRockCollection(someRocks);
		c2.setRockCollection(allOftheRocks);
		System.out.println("==================================");
		System.out.println("C1 = "+c1);
		System.out.println("C2 = "+c2);
		
		System.out.println("==================================");
		//for-each loop for objects
		for(Rock r: allOftheRocks) {
			System.out.println("A rock in the collection is "+r);
		}
		
		//for loop for objects
		for(int i = 0; i<someRocks.size(); i++) {
			System.out.println("A rock in the somerocks collection is "+someRocks.get(i));
		}
	}

}
