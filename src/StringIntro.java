//this is a code comment
//notes or explanations for what the code does
//doesn't get run as part of the program

/*
this is a block comment
-don't need // within a block comment

Java classes are program files
-class names need to match the file name
-class names need to start with a Capital letter
and have no spaces
-all code will go in the curly braces for the class
 */

public class StringIntro {

    //this is the main method
    //for now, all code we write goes in the main method
    public static void main(String [] args) {

        //this is a print statement - same as console.log in JS
        System.out.println("hello world");

        //"hello world" is in quotes - it's a string
        //Strings are chars/nums/text that can be output or
        //or used as data in the program
        System.out.print("hi");

        //-System.out.print() (NOT prinln()) will output
        //immediately after the previous output on the same line
        //-System.out.println() inserts a line break AFTER what gets output
        System.out.print("hi");

        System.out.println("something else");

        System.out.println(); //empty println() to give an extra line break
        System.out.println("blah");

    }
}
