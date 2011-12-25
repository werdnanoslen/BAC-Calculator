/**
* Blood alcohol content calculator
* @author Andrew Nelson
*/

import java.util.*;

public class BAC {
	public static void main(String[] args){		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("How much do you weigh? (pounds)");
		double weight = scanner.nextDouble();
		
		System.out.println("Are you male or female?");
		String gender = scanner.next();
		
		System.out.println("How many hours ago did you start drinking?");
		double time = scanner.nextDouble();
		
		System.out.println("How many drinks did you have?");
		int numDrinks = scanner.nextInt();
		
		int i=1;
		double bac = 0;
    double currentBAC = 0;
		double widmark = (gender.toLowerCase().charAt(0) == 'f') ? 0.73 : 0.66;
		
		while (i<=numDrinks){
			System.out.println("What was the volume of drink #" +i +"? (ounces)");
			double volume = scanner.nextDouble();
			
			System.out.println("What was the % abv of that drink?");
			double abv = (scanner.nextDouble())/100;
			
			System.out.println("How many times did you have this drink?");
			double drinkCount = scanner.nextDouble();
			
			bac += (volume*abv*5.14)/(weight*widmark);
			i += drinkCount;
		}
		
    currentBAC = bac - 0.015*time;

    if (currentBAC >= 0){
      System.out.println("Your blood alcohol content is probably around " + currentBAC);
    } else{
      System.out.println("Your blood alcohol content should be normal by now");
    }
    }
}
