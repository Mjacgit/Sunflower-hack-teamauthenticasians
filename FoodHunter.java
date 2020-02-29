import java.util.Scanner;
public class FoodHunter {
	
	private static  Scanner keyboard;

	public static void main(String[] args)  {
		
		 Scanner keyboard = new Scanner(System.in);

		//Ask the qyestion 
		 //scanner
		 
		 String foodPreference;
			System.out.println("Do you prefer sweet, sour, spicy, salty or cheesy food?");
	         foodPreference = keyboard.nextLine();	
		 
		
	         String cusineChoice;
	 		System.out.println("Which cuisine do you want? (Thai, Italian, Chinese, Mexican, American,"
 				+ " Mediterranian, Vegetarian, French, Vietnamese)");
 	   cusineChoice = keyboard.next();	
	 	
	 	   
	 		String dietaryRestrictions;
			System.out.println("Are there any dietary restrictions?");
			dietaryRestrictions = keyboard.next();
			
			String eatOut;
			System.out.println("Do you want to eat in or out?");
			eatOut = keyboard.next();
			
			double budget;
			System.out.println("What's your budget? \n$");
			budget = keyboard.nextDouble();
	         
			String paymentMethod;
			String cardType;
			
			System.out.println("Please enter your paynemt method: ");
			paymentMethod = keyboard.next();
			
			if(paymentMethod.equalsIgnoreCase("credit") || paymentMethod.equalsIgnoreCase("card")) {
				System.out.println("Enter card type i.e(Mastercard, Visa, American Express): ");
				cardType = keyboard.next();
			}
			
		food_preference(foodPreference);
		cusines(cusineChoice);
		dietaryRestrictions(dietaryRestrictions);

		budget(budget);
//		payment_method();
		
		
	}
	
	public static String food_preference(String foodPreference) {
if(foodPreference.equalsIgnoreCase("salty")) {
	System.out.println("You may like French fries which you can get at MCdonalds, Wendys Shake Shack"
			+ " or almost any place that serves burgers.");
	
}

else if(foodPreference.equalsIgnoreCase("sweet")) {
	System.out.println("You may like frozen Yougart which you can find at Red Mango and 16 handles.");
	
}

else if(foodPreference.equalsIgnoreCase("sour")) {
	System.out.println("You may like Hot and sour soup which you can find at May Wah Fast Food and China King");
	
}

else if(foodPreference.equalsIgnoreCase("spicy")) {
	System.out.println("You may like Vindaloo pork which you can find at Deep Indian Kitchen");
	
}

else if(foodPreference.equalsIgnoreCase("cheesy")) {
	System.out.println("You may like Panera Bread which you can find at Panera Bread");
	
}
	



     return foodPreference;
        
	}
	
	public static String cusines(String cusineChoice) {
		
		if(cusineChoice.equalsIgnoreCase("Chinese")) {
			System.out.println("You may like New Asian Cusine or Fu Chinese Cusine");
		}
		else if(cusineChoice.equalsIgnoreCase("Thai")) {
			System.out.println("You may like Mee Thai Cuisine or 22 Thai Cuisine");
		}
		else if(cusineChoice.equalsIgnoreCase("Italian")) {
			System.out.println("You may like Ceci and Prima Sarabella");
		}
		else if(cusineChoice.equalsIgnoreCase("Mexican")) {
			System.out.println("You may like Zona Tribeca Mezcaleria and Baja Mexican Cuisine");
		}
		else if(cusineChoice.equalsIgnoreCase("American")) {
			System.out.println("You may like The Paris Cafe and Farmhouse");
		}
		else if(cusineChoice.equalsIgnoreCase("Mediterranian")) {
			System.out.println("You may like Omar Mediterranean Cuisine and Zerda Mediterranean Cuisine");
		}
		else if(cusineChoice.equalsIgnoreCase("Vegetarian")) {
			System.out.println("You may like Amitoufu Vegan Cuisine and Bodhi Kosher Vegetarian Restraunt");
		}
		else if(cusineChoice.equalsIgnoreCase("Vietnamese")) {
			System.out.println("You may like Sao Mai and Nam Son");
		}
		
		return cusineChoice;
	}
	
	
	public static String dietaryRestrictions(String dietaryRestrictions) {
		
		if(dietaryRestrictions.equalsIgnoreCase("gluten-free")) {
			System.out.println("You may like Marea and Noglu");
		}
		else if(dietaryRestrictions.equalsIgnoreCase("dairy-free")) {
			System.out.println("Sam’s fried Ice cream and Ben & Jerry’s have dairy free options");
		} 
		else if(dietaryRestrictions.equalsIgnoreCase("no") || dietaryRestrictions.equalsIgnoreCase("no")) {
			System.out.println("No Dietary restrictions");
		}
		else {
			System.out.println("Sorry, we don't have any recommendations based on your dietary restrictions at the moment.");
		}
		
		return dietaryRestrictions;
	}
	
	public static double budget(double budget) {
		
		if(budget < 10) {
			System.out.println("Based on your budget you may like McDonalds, Wendys, Taco Bell or Burger King");
		}
		else if (budget <20) {
			System.out.println("Based on your budget you may like Chipotle, Five guys or Shake Shack");
		}
		else {
			System.out.println("you may like Morton Williams");
		}
		return budget;
	}
	
//	public static  String eat_out_or_at_home() {
//		String eatOut;
//		System.out.println("Do you want to eat out or eat at home?");
//		eatOut = keyboard.next();
//		
//		if(eatOut.equalsIgnoreCase("Eat out")) {
//			System.out.println("We'll recommend some restruants");
//		}
//		else if(eatOut.equalsIgnoreCase("Eat out")) {
//			System.out.println("We'll recommend some restruants");
//		}
//		return eatOut;
//	}
	
//	public static double budget() {
//		double budget;
//		System.out.println("What's your budget?");
//		budget = keyboard.nextDouble();
//		return budget;
//	}
//	public static String payment_method() {
//		String paymentMethod;
//		String cardType;
//		
//		System.out.println("Please enter your paynemt method: ");
//		paymentMethod = keyboard.next();
//		
//		if(paymentMethod.equalsIgnoreCase("credit card") || paymentMethod.equalsIgnoreCase("card")) {
//			System.out.println("Enter card type i.e(Mastercard, Visa, American Express): ");
//			cardType = keyboard.next();
//		}
//		
//		return paymentMethod;
//	}

}
