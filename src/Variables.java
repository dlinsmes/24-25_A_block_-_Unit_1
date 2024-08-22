import java.util.Scanner;
//Scanner is a built-in code library that lets us
//get input
//-Scanner is NOT tested

public class Variables {

    public static void main(String [] args) {
        System.out.println("my name is bob");

        //variables store data

        //declare the variable first - reference it for the first time
        //define the type - String
        //give the variable a name - username
        //assign the initial value - "wallace"
        String username = "wallace";

        System.out.println(username);

        //only declare once - after that, to use or change the value, just
        //use the variable name
        username = "something else";

        //strings can be concatenated (joined together) with a +
        System.out.println("now my name is " + username);

        //var names can't have spaces - use camelCase or underscores _ _ _
        String friendName = "grommet";

        //append (add) to an existing string
        friendName = friendName + " smith";
        System.out.println("my friend's name is " + friendName);

        // single equals (=) is the assignment operator
        //-evaluate what's on the right, then assign to the left
        //-use the old value of friendName, add " Smith", then save
        //the new String back to the friendName variable

        //to represent numbers, use the int or double data types

        //int is an integer - whole numbers, including negatives and zero
        int num = 8;

        System.out.println("num is " + num);

        //num = "steve";
        //cannot save string values to int variables

        //take the old value of num (8) , add 4, save back to the num variable
        num = num + 4;
        System.out.println(" + 4 is " + num);

        //+ add
        //- sub
        //* multiple
        // / divide
        // % modulo (mod) - remainder after dividing

        //remainder of 3 after dividing 13 by 5
        //-the whole number is irrelevant for modulo
        System.out.println("13 % 5 is " + 13%5);

        System.out.println("num is " + num);

        //same as num = num + 2
        num += 2;
        System.out.println("+ 2 is " + num);

        //same works for -=, *=, /=

        //same as num = num + 1 and num += 1
        num++;
        System.out.println("+1 is " + num);

        //num-- works, not for ** or //


        //important - int division truncates (cuts off) any decimals
        num = 7/2;
        System.out.println("7 / 2 is " + num);

        //rounding up does not occur - decimal gets truncated
        System.out.println("99 / 100 is " + 99/100);

        //the double data type will hold decimal values
        double numnum = 9.0;
        //to get division results with decimals, at least one operand
        //needs to be a double
        System.out.println("9.0 / 2 is " + numnum/2);

        //IMPORTANT - the right of the = gets evaluated first
        // 99/100 is evaluated as int division because neither
        //operand is a double or has decimals, so this produces 0
        //-then to save 0 to a double variable (numnum), the .0 gets added
        numnum = 99/100;
        System.out.println(numnum);


        //to evaluate as double division and get decimals in the result,
        //at least one of the operands needs to be a double or have a decimal
        numnum = 99.0/100;
        System.out.println(numnum);

        numnum = 99/100.0;
        System.out.println(numnum);

        numnum = 99.0/100.0;
        System.out.println(numnum);

        numnum = 7; //save an int value as a double, which will add the .0
        System.out.println(numnum);

        //this doesn't work bc ints cannot hold decimal values
        //int n = 7.9;

        //can force the type conversion by casting 7.9 as an int
        int wholeNum = (int)(7.9);

        //when casting doubles to ints, decimals are truncated, not rounded
        System.out.println("7.9 casted to an int is " + wholeNum);


        //set up a Scanner called input that allows keyboard input
        Scanner input = new Scanner(System.in);

        System.out.println("What is your name?");

        //take the line that the user types in and save it to a var
        //-waits to continue running until the user enters input
        String name = input.nextLine();

        //this won't run until the user types something
        System.out.println("Hi " + name);

        System.out.println("enter an integer");
        //use nextInt() for ints
        int uNum = input.nextInt();

        //without the extra parentheses, 6 and 4 were interpreted as Strings
        System.out.println(uNum + " + 4  is " + (uNum+4));

        System.out.println("enter a decimal number");
        double uDouble = input.nextDouble();
        System.out.println(uDouble + " / by 7 is " + (uDouble/7));
    }
}
