/*   
   Method 3 Assignment
   CSCD 210 Grading
   Brian Kamp
   10/25/16
   
   @author: Brian Mize 
   
*/

import java.util.Random;

class Methods3 {

   /*
      takes a string and returns a string with the characters that are in
      the even positions in the passed in string.  The first character in 
      the string is at position 0.
   */
   public static String evenChar(String s){
      
      String res = "";
      for(int i = 0; i < s.length(); i += 2){
         res += s.charAt(i);
      }
      
      return res;
   }
   
   /* 
      takes an int array, and an int bound, uses Random.nextInt(int bound)
      to fill the array with random integers.
   */
   public static void arrayFill(int[] array, int b) {
      
      Random rand = new Random();
      
      for(int i = 0; i < array.length; i ++) {
         array[i] = rand.nextInt(b);
      }
      
   } 
   
   /*
      takes an int for the number of rows and colums. Prints out a square made of astrisks
      that has an equal number of rows and columns: 
      Example  4 passed in:
      
      ****
      ****
      ****
      ****
      
   */
   public static void squareOfAsterisks(int s) {
      
      for(int i = 0; i < s; i ++){
         for(int j = 0; j < s; j ++){
            System.out.print("*");
         }
         System.out.println();
      }
   }


} // end class