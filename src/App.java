
public class App {

	public static void main(String[] args) {
		System.out.println("Hello World");
		
		//The story of 2 Friends
		
		double donutPrice = 2.00;
		double coffeePrice = 3.00;
		double walletRoss = 20.00;
		double walletChandler = 10.00;
		int numberOfFriendsRoss = 60;
		int numberOfFriendsChandler = 50;
		byte ageRoss = 30;
		byte ageChandler = 25;
		String firstNameFriend1 = "Ross";
		String firstNameFriend2 = "Chandler";
		String lastNameFriend1 = "Geller";
		String lastNameFriend2 = "Bing";
		char middleInitialFriend1 = 'E';
		char middleInitialFriend2 = 'M';

		double walletRossTotal = walletRoss - donutPrice;
		double walletChandlerTotal = walletChandler- coffeePrice;

		int avgNumberFriendsRoss = numberOfFriendsRoss / ageRoss;
		int avgNumberFriendsChandler = numberOfFriendsChandler / ageChandler;
		
		String fullNameFriend1 = firstNameFriend1 + " " + middleInitialFriend1 + " " + lastNameFriend1;
		String fullNameFriend2 = firstNameFriend2 + " " + middleInitialFriend2 + " " + lastNameFriend2;
		
		System.out.println("Story of two Friends");
	
		System.out.println("The first friend's full name is " + fullNameFriend1);
		System.out.println("The second friend's full name is " + fullNameFriend2);
		


		System.out.println(firstNameFriend1 + " has $" + (String.format("%.2f",walletRoss)));
		System.out.println("The price of a donut is $" + (String.format("%.2f",donutPrice)));
		System.out.println("After purchasing the doughnut, Ross is left with $" + (String.format("%.2f",walletRossTotal)));

		System.out.println(firstNameFriend2 + " has $" + (String.format("%.2f",walletChandler)));
		System.out.println("The price of a coffee is $" + (String.format("%.2f",coffeePrice)));
		System.out.println("After purchasing the doughnut, Chandler is left with $" + (String.format("%.2f",walletChandlerTotal)));

		System.out.println(firstNameFriend1 + " is " + ageRoss + " years old");
		System.out.println(firstNameFriend1 + " has " + numberOfFriendsRoss + " friends");
		System.out.println("Ross averages " + avgNumberFriendsRoss + " friends per year");

		System.out.println(firstNameFriend2 + " is " + ageChandler + " years old");
		System.out.println(firstNameFriend2 + " has " + numberOfFriendsChandler + " friends");
		System.out.println(firstNameFriend2 + " averages " + avgNumberFriendsChandler + " friends per year");	
		
		
		


	}

}
