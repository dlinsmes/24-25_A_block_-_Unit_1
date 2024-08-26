import java.util.Scanner;

public class InputPractice {

    public static void main(String [] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("What is your name?");

        String name = input.nextLine();

        System.out.println("How old are you in years?");

        int years = input.nextInt();

        //years to decades and remaining years
        //10 years in a decade

        //int division is useful here bc we don't want 9 years
        //to round up to 1 decade
        int decades = years/10;

        //mod produces the remainder after division
        int remainder = years % 10;

        System.out.println("hi " + name + ", you are " + decades
        + " decades and " + remainder + " years old");

        //years to days
        int days = years * 365;

        int leapYearDays = years / 4;

        System.out.println("this is the same as " + days + " days" +
                " and " + leapYearDays + " leap year days");


        //weird Scanner behavior:
        //when switching from number input to String input, the following String
        //input will get skipped

        //workaround: add an extra nextLine() that will get skipped so then
        //the one you need will run correctly
        input.nextLine();

        //prompt for favorite color and favorite food, then output both
        System.out.println("favorite color?");
        String color = input.nextLine();
        System.out.println("Favorite food?");
        String food = input.nextLine();

        System.out.println("your favorite color is " + color
        + " and your favorite food is " + food);
    }
}
