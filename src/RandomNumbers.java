public class RandomNumbers {

    public static void main(String [] args) {

        //Math.random() produces a random double
        //between 0 and 1, exclusive of 1
        //[0, 1) --- always zero point something
        double r = Math.random();
        System.out.println(r);

        //expand the range of generated numbers to [0, 5)
        //the highest is 4.99999
        r = Math.random() * 5;
        System.out.println(r);

        //generate a random int [0, 5) - same as [0, 4]
        //same as the above formula, but cast to an int
        //to truncate the decimals
        int rand = (int)(Math.random() * 5);
        System.out.println(rand);

        //this is always zero
        //bc without parentheses, only the term right next
        //to (int) gets cast. Since Math.random() always
        //produces 0.something, this will cast to 0
        //-0 multiplied by anything is still 0
        rand = (int)Math.random() * 5;
        System.out.println(rand);

        //[1,5]
        //add 1 to offset the whole range
        rand = (int)(Math.random() * 5) + 1;
        System.out.println(rand);

        //die roll [1, 6]
        rand = (int)(Math.random() * 6) + 1;
        System.out.println(rand);

        //[10, 20]
        //multiplier is how many numbers in the range
        //add-on is the starting value (can be negative)
        rand = (int)(Math.random() * 11) + 10;
        System.out.println(rand);

        //[3, 10]
        rand = (int)(Math.random() * 8) + 3;
        System.out.println(rand);

        //formula for [min, max]
        //(int)(Math.random() * (max - min + 1) ) + min

        //[51, 97]
        rand = (int)(Math.random() * (97 -51 + 1) ) + 51;

    }
}
