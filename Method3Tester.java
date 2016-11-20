/*
   Tester for Method 3 Assignment
   CSCD 210 Grading
   Brian Kamp
   10/25/16
   
   @author: Brian Mize
   
   Assignment Write Up:
   You will write a class that contains the following methods:

    evenChar - takes a string and returns a string with the characters that are in
               the even positions in the passed in string.  The first character in 
               the string is at position 0.
               
    arrayFill - takes an int array, and an int bound, uses Random.nextInt(int bound)
                to fill the array with random integers and returns the filled array.
                
    squareOfAsterisks - takes a single int for the number of rows and colums. 
                        Prints out a square made of astrisks that has an equal 
                        number of rows and columns.

   You are not required to write a main method, but you can if you desire for testing.  
   All of the methods should be public.
   
   Summary:
   This class will call each of the methods in the student created class file
   and it will print out the results of the tests.
   
   
*/
public class Method3Tester {

   public static void main(String[] args) {
   
   String test1 = "0123456789";
   String test2 = "012345 789 1234";
   
   int[] array1 = new int[10];
   int[] array2 = new int[100];
   
   //Testing evenChar
   System.out.println();
   System.out.println("Testing evenChar() method");
   System.out.println("===========================\n");
   System.out.println("Calling evenChar() test1");
   System.out.println("The even characters of " + test1 + " : " + Methods3.evenChar(test1));
   System.out.println();
   System.out.println("Calling evenChar() test2");
   System.out.println("The even characters of " + test2 + " : " + Methods3.evenChar(test2));
   System.out.println();
 
 
   //Testing arrayFill
   System.out.println();
   System.out.println("Testing arrayFill() method");
   System.out.println("===========================\n");
   System.out.println("Calling arrayFill() with array1");
   Methods3.arrayFill(array1, 42);
   for(int i: array1){
      System.out.println(i);
   }
   System.out.println();
   System.out.println("Calling arrayFill() with array2");
   Methods3.arrayFill(array2, 2000);
   for(int i: array2){
      System.out.println(i);
   }
   System.out.println();
   
   //Testing squareOfAsterisks
   System.out.println();
   System.out.println("Testing squareOfAsterisks() method");
   System.out.println("===========================\n");
   System.out.println("Calling squareOfAsterisks() with 4");
   Methods3.squareOfAsterisks(4);
   System.out.println();
   System.out.println("Calling squareOfAsterisks() with 50");
   Methods3.squareOfAsterisks(50);
   System.out.println();
   
   
   
   } // end main
   
} // end class
