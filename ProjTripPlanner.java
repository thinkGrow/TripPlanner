import java.awt.*;
import java.util.Scanner;

public class ProjTripPlanner {

    public static void main (String[] args)

    {
        intro(); //Ask name, where travel to etc
        budget(); //days converted to hours, minutes, show per day cost in USD & local
        time(); // Show what time will it be there at midnight and noon at your home
        distance(); // convert the distance of the area square to miles square for convenience


    }

    public static void intro ()

    {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Vacation Planner!");
        System.out.print("What is your name?  ");
        String name = input.nextLine();
        System.out.print("Nice to meet you " + name + ", where are you travelling to?  ");
        String travellingTo = input.nextLine();
        System.out.println("Great!" + travellingTo + " sounds like a great trip");
        System.out.println("********** \n \n");

    }



     public static void budget () {
         Scanner input = new Scanner(System.in);
         System.out.println("How many days are you going to spend travelling?");
         int daysTravel = input.nextInt();
         System.out.println("How much money, in USD, are you planning to spend on your trip?");
         double moneyWantSpend = input.nextDouble();
         System.out.println("What is the three letter currency symbol for your travel destination?");
         String currencySymbol = input.next();
         System.out.println("How many " + currencySymbol + " are there in 1 USD? ");
         double unitCurIn1USD = input.nextDouble();
         int hourTravel = daysTravel * 24;
         int minTravel = hourTravel * 60;
         System.out.println("If you are travlling for " + daysTravel + " days that is the same as " + hourTravel + " hours or " + minTravel + " minutes");
         double perDayCost = moneyWantSpend / daysTravel;

         double perDayCostCon; //These 4 lines of process is to convert a continous number to 2 decimal places
         perDayCostCon = perDayCost * 100;
         perDayCostCon = (int) perDayCostCon;
         perDayCostCon = perDayCostCon / 100;

         System.out.println("If you're going to spend $" + moneyWantSpend + " USD that means per day you can spend up to $" + perDayCostCon + " USD");
         double moneyWantSpendInLocal = moneyWantSpend * unitCurIn1USD;
         System.out.println("Your total budget in " + currencySymbol + " is " + moneyWantSpendInLocal + " " + currencySymbol + ", which per day is ");
         double perDayCostInLocal = perDayCost * unitCurIn1USD;

         double perDayCostInLocalCon;
         perDayCostInLocalCon = perDayCostInLocal * 100;
         perDayCostInLocalCon = (int) perDayCostInLocalCon;
         perDayCostInLocalCon = perDayCostInLocalCon / 100;


         System.out.println(perDayCostInLocalCon + currencySymbol);
         System.out.println("***************");

     }

        //****************************



     public static void time ()

     {
         Scanner input = new Scanner(System.in);
         System.out.println("What is the time difference, in hours, between your home and your destination?");
         int timeDifHour = input.nextInt();
         System.out.println("That means that when it is midnight at home it will be " + (timeDifHour % 24) + ":00 in your travel destination ");
         System.out.println("and when it is noon at home it will be " + ((timeDifHour + 12) % 24) + ":00."); //mod is used if 24 hours exceeded, to round back to 24 hours
         System.out.println("********************** \n \n \n");

     }




        //**************************



      public static void distance () {

          Scanner input = new Scanner(System.in);
          System.out.println("What is the square area of your destination country in km2?");
          int sqArea = input.nextInt();
          double inMiles = sqArea * 0.62137 * 0.62137;

          double inMilesCon;
          inMilesCon = inMiles * 100;
          inMilesCon = (int) inMilesCon;
          inMilesCon = inMilesCon / 100;

          System.out.println(" In miles2 that is " + inMilesCon);
          System.out.println("**************** \n \n \n");

      }







}
