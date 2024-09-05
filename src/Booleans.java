import java.util.Scanner;

public class Booleans {

    public static void main(String [] args) {

        //boolean is a data type that stores either true or false
        boolean b = true;
        System.out.println(b);

        b = false;
        System.out.println(b);

        //! is negation - said as "NOT"
        b = !true;
        System.out.println(b);

        //flip the current value
        b = !b;
        System.out.println(b);

        //comparisons - >, <, >=, <= (less than or equal to)
        int x = 8;

        //boolean variables can be assigned boolean expressions
        //(what would go as the condition for an if-statement)
        b = x > 3;
        System.out.println(b);

        //can negate expressions
        //-first evaluate the expression as-is, then find the
        //opposite value
        b = !(x > 3);
        System.out.println(b);

        //single equals (=) is the assignment operator
        //double equals (==) is a comparison -
        // check if the two values are the same

        //right side first - check if x is the same as 8, which is either true or false
        //left side - assign that true/false value to b
        b = x == 8;
        System.out.println(b);

        b = !(x == 8);
        //same as:
        b = x != 8;

        // != checks if the values are not the same --> true,
        //and if they ARE the same --> false

        //in math:
        // 4 <= x < 10

        //not valid in java
        //b = 4 <= x < 10;

        //each side of an && (AND) needs to be its own
        //standalone expression
        //with AND - both expressions need to be true for
        //the whole thing to be true
        x = 5;
        b = 4 <= x && x < 10;
        System.out.println(b);

        x = 11;
        b = 4 <= x && x < 10; //only one of the expressions is true
        System.out.println(b);

        //OR - || - at least one of the expressions needs to be true
        //check if x is greater than 10 OR it's even
        b = x > 10 || x % 2 == 0; //one of the expressions is true, the other isn't
        System.out.println(b);

        String word = "apple";
        //for Strings, do NOT use == for comparison - sometimes it works, sometimes doesn't
        // use .equals(word) - this will work consistently
        b = word.equals("orange");
        System.out.println(b);

        //the terms can go on either side
        b = "orange".equals(word);


        //to negate, this doesn't work:
        //b = "orange".!equals(word);

        //negate the whole expression
        //--> true bc orange is not the same as apple --> false, then negate false
        b = !"orange".equals(word);

        //want the user to enter "a" or "b", and set a boolean to true
        //if they did it correctly, false otherwise
        Scanner input = new Scanner(System.in);
        System.out.println("enter a or b:");
        String user = input.nextLine();

        boolean correct = user.equals("a") || user.equals("b");

        System.out.println(correct);

        //same as
        correct = !( !user.equals("a")  && !user.equals("b") );
        System.out.println(correct);

        //Demorgan's Law:
        //!(A OR B) is the same as !A AND !B
        //!(A AND B) is the same as !A OR !B

    }
}
