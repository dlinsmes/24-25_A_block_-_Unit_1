import java.util.Scanner;

public class Rounding {
    public static void main(String [] args) {

        //implement the normal rounding rule -
        //if the decimal is .5 or higher, the int value goes up
        //otherwise the int value stays the same
        double num = 9.49999999999999;

        //you can cast (convert) from double to int:
        int n = (int)(num);
        //this truncates (cuts off) the decimal
        System.out.println("n is " + n);


        //add .5, then cast
        //this works because if the initial double value
        //has a decimal of .5 or greater, adding .5 will
        //force the int value to go up by 1
        //-if the initial double value has a decimal of less than .5,
        //then adding .5 will keep the int value the same
        int rounded = (int) (num + 0.5);
        System.out.println("rounded is " + rounded);

        //int division - keep just the whole number (int), truncate
        //decimals
        //7
        int a = 37 / 5;

        //remainder after dividing 37 by 5
        //2
        int b = 37 % 5;

        System.out.println("37 / 5 is " + a);
        System.out.println("37 % 5 is " + b);

        //assignment operator: evaluate what's on the RIGHT first
        //since 7 and 2 are both ints (no decimals), this evaluates as
        //int division and produces 3
        //THEN 3 is saved to a double variable and becomes 3.0
        double c = 7 / 2;
        System.out.println("7 / 2 as a double is " + c);

        //should be 7.5
        c = 9.7 - 2.2;
        System.out.println("9.7 - 2.2 is " + c);
        //doubles are only an approximation of decimal numbers
        //sometimes the value is extremely close, but off by
        //a small decimal amount

        c = 9.7 - 2.1;
        System.out.println("9.7 - 2.1 is " + c);

        c = 9.7 - 2.0;
        System.out.println("9.7 - 2.0 is " + c);

        c = 47.49 % 1;
        System.out.println("47.49 % 1 is " + c);

        //round to the desired decimal place
        //should be 7.5
        c = 9.7 - 2.2;

        //move the decimal to the desired place value to keep,
        // THEN round, then move the decimal back
        c = c * 10; //74.999999...
        int cRounded = (int)(c + 0.5); //round to 75
        c = cRounded / 10.0; //use double division to move the decimal place back
        System.out.println("c is " + c);

        //should be 0.49
        c = 47.49 % 1;
        c = c * 100; //49.000002
        cRounded = (int)(c + 0.5); //49
        c = cRounded / 100.0; //0.49
        System.out.println("c is " + c);

        //cash register
        //prompt the user to enter a dollar and cent value
        //output the minimum quantity of bills and coins
        // needed to add up to that value
        //bills: 100, 20, 10, 5, 1;
        //coins: quarter, dime, nickel, penny
        //use ONLY division, modulo, and rounding
        //(no multiplication, subtractions, ifs, loops)

        Scanner input = new Scanner(System.in);

        System.out.println("enter a dollar and cent amount as a double");
        double amt = input.nextDouble();

        //start with the largest denomination first, then work down to small

        //calculate division and cast as an int bc you can only have a whole number
        //quantity of bills
        int h = (int)(amt/100);
        System.out.println(h + " $100 bills");

        //use modulo to find the REMAINING amount to calculate change for
        amt = amt % 100;

//        System.out.println("remaining amount: " + amt);
        int twenties = (int)(amt/20);
        System.out.println(twenties + " $20 bills");
        amt = amt % 20;

        int tens = (int)(amt/10);
        System.out.println(tens + " $10 bills");
        amt = amt % 10;

    }
}
