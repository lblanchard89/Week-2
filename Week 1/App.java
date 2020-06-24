public class App {

	public static void main(String[] args) {

		//Item price
		double tacoPrice = 1.74;
		System.out.println("A taco costs $" + tacoPrice + ".");	
		
		double burritoPrice = 7.49;	
		System.out.println("A burrito costs $" + burritoPrice + ".");
		
		// Amount of money in wallet
		double myWallet = 127.50;
		System.out.println("I have $" + myWallet + " in my wallet.");
		
		double joshWallet = 1417.76;
		System.out.println("Josh has $" + joshWallet + " in his wallet.");
		
		//Number of friends
		int myFriends = 8;
		System.out.println("I have " + myFriends + " friends.");
		
		int joshFriends = 56;
		System.out.println("Josh has " + joshFriends + " friends.");
		
		//Age in years(as a whole number)
		int myAge = 30;
		System.out.println("I am " + myAge + " years old.");
		
		int joshAge =27;
		System.out.println("Josh is " + joshAge + " years old." );
		
		//My first name
		String myFirstName = "Lee";
		System.out.println("My first name is " + myFirstName + ".");
		
		//My last name
		String myLastName = "Blanchard";
		System.out.println("My last name is " + myLastName+ ".");
		
		//My middle intitial
		char myMiddleInitial = 'T';
		System.out.println("My middle initial is " + myMiddleInitial + ".");
		
		//Friends first name
		String friendsFirstName = "Josh";
		System.out.println("My friend's first name is " + friendsFirstName +".");
		
		//Friends last name
		String friendsLastName = "Roberts";
		System.out.println("My friend's last name is " + friendsLastName + ".");
		
		//Friends middle initial
		char friendsMiddleInitial = 'B';
		System.out.println("My friend's middle initial is " + friendsMiddleInitial + ".");
	
		//Operation for new amount of money in wallet after purchase
		double myUpdatedWallet = myWallet - tacoPrice;
		System.out.println("I bought a taco, now I have $" + myUpdatedWallet + " left.");
		
		double joshUpdatedWallet = joshWallet - burritoPrice;
		System.out.println("Josh bought a burrito, now he has $" + joshUpdatedWallet + " left.");
		
		//Operation for number of friends made each year
		int myYearsToMakeFriend = myAge / myFriends;
		System.out.println("Every " + myYearsToMakeFriend + " years I make a friend.");
		
		int joshFriendsPerYear = joshFriends / joshAge;
		System.out.println("Josh made " + joshFriendsPerYear + " friends each year.");
		
		//Operation for full name
		String myFullName = myFirstName +" "+ myMiddleInitial + " "+ myLastName;
		System.out.println("My full name is " + myFullName + ".");
		
		String friendsFullName = friendsFirstName + " " + friendsMiddleInitial + " " + friendsLastName;
		System.out.println("My friend's full name is " + friendsFullName + ".");
	}
	

}
