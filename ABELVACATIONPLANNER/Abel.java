import java.util.Scanner;
public class Abel {
public static void main(String[] args)
 {
	String  name;
	String city;
	int days, hours;
	double tripamount;
	String currency;
	String curencyother;
	double timedifference;
	double squarearea;
	double minu;
	double spendperday;
	double converstionrate;
	String currentcity;
	String reply;
	double timerate;
	double timeratecit;
	double abb;
	double afin;
	
	
	
    Scanner input = new Scanner(System.in);

	javax.swing.JOptionPane.showMessageDialog(null, "HI WELCOME TO ABEL VACATION PLANNER \n");

	System.out.println("WELCOME TO VACATION PLANNER !\n");

	System.out.print("\nPLEASE INPUT YOUR NAME ? \n");
	name = input.nextLine();
	name = name.toUpperCase();

	System.out.print("\nNICE TO MEET YOU " + name + " WHERE DO YOU INTEND  TRAVELLING TO ? \n");
	city = input.nextLine();
	city = city.toUpperCase();
	System.out.println(" \nGREAT! " + city + " SOUNDS LIKE A GREAT PLACE TO VISIT\n");

	city = city.toUpperCase();
System.out.print("\nHOW MANY DAYS DO YOU INTEND TO  SPEND IN " + city + " ?\n");
days = input.nextInt();


System.out.print("\n WHAT IS THE NAME OF YOUR CURRENT CITY ? \n" );
currentcity = input.next();



currentcity = currentcity.toUpperCase();
System.out.print("\nWHAT IS THE THREE LETTER CURRENCY SYMBOL OF " + currentcity + " ? \n"  );
currency = input.next();

city = city.toUpperCase();
System.out.print("\nWHAT IS THE THREE LETTER CURENCY SYMBOL OF " + city + "  ? \n");
curencyother = input.next();


currency = currency.toUpperCase();
System.out.print("\n HOW MANY " + currency + " DO YOU INTEND TO SPEND \n" );
tripamount = input.nextDouble();


System.out.print("\n HOW MANY " + currency + " ARE THERE IN " +  curencyother + " \n ");
abb = input.nextDouble();


hours = days*24;
minu = hours*60;
System.out.print("\n IF YOU ARE TRAVELLING FOR " + days + " DAYS THAT IS THE SAME AS " + hours + " hours or " + minu + " minutes \n");

currency = currency.toUpperCase();
System.out.print("\n IF YOU ARE GOING TO SPEND " + tripamount + currency + " FOR " + days + " days .\n");


spendperday = tripamount/days;
curencyother = curencyother.toUpperCase();
System.out.print(" \n THEN YOU ARE AVERAGLY GOING TO SPEND " + spendperday + curencyother + " EACH DAY \n ");

afin = abb * tripamount;
System.out.print("\n WHICH IS EQUAL TO " + afin + "\n");
// converstionrate = 
// System.out.print("\n WHICH IS EQUAL TO " + converstionrate + curencyother " \n");


currentcity = currentcity.toUpperCase();
city = city.toUpperCase();
System.out.print("\n WHAT IS THE TIME DIFFERENCE, IN HOURS,BETWEEN " + currentcity + " AND " + city + " ? \n");
timedifference = input.nextDouble();



timerate = 12.00;
timeratecit = timerate - timedifference;
currentcity = currentcity.toUpperCase();
System.out.print("\nTHAT MEANS THATS WHEN IT IS " + timerate + " IN " + currentcity + " THEN IT IS " + timeratecit + "  IN? " + city + " . \n");

System.out.print(" \n ..............PLEASE INPUT EITHER LIKE OR DISLIKE TO LEAVE A COMMENT \n");
reply = input.next();

		
       

currentcity = currentcity.toUpperCase();
city = city.toUpperCase();
		// if (reply == "like") {
			
			javax.swing.JOptionPane.showMessageDialog(null, "\n Thanks FOR USING ABEL APP\n DONT FORGET TO GET ME A GIFT \n FROM " + city +" WHEN COMING BACK TO " + currentcity + " .\n" );
		
		// } else if  (reply == "dislike") {
			
		// 	javax.swing.JOptionPane.showMessageDialog(null, "\n Thanks FOR USING ABEL APP \n WOW IT SEEMS  LIKE YOU DONT LIKE ONE OR MORE FEATURES ON OUR APP \n YOU CAN COMMENT IN THE COMMENT BOX AT GOOGLE PLAY STORE \n TO HELP US IMPROVE ON OUR SERVICE.\n");
		
			
		// } 





}
}
