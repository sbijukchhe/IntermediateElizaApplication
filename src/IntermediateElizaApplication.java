/*
You will continue creating an interactive chat-bot type program. Eliza is a therapist program that interacts with the user. Your program will need to evaluate what the user asks and turn the user's input into a question that sounds like the therapist really cares.

Use HashMaps or String arrays to loop through user's input and implement the following:

Replacements:

replace i with you
replace me with you
replace my with your
replace am with are
We will continue to build on top of this application throughout the week.

Here's how the replacement works:

The user enters something at the prompt: "my teacher hates me"

The program will loop through that string and replace "my" with "your" and "me" with "you" and then prepend the qualifier to the replacement string. So, my teacher hates me becomes "Why do you say that your teacher hates you?" The replacement method returns the same words as the user entered only the replacement words have been swapped.

Spend some time thinking how you would search through a string and replacing specific words. Hint: read about the split  (Links to an external site.)operator.


public class SplitExample{

     public static void main(String []args){
      String Str = new String("I really like this Java course");
      System.out.println("Return Value :" );

      for (String retval: Str.split(" ")) {
         System.out.println(retval);
      }
     }
}
Example output:
Good day. What is your problem? Enter your response here or Q to quit: my teacher hates me
your teacher hates you
Enter your response here or Q to quit: i dont know what's wrong
you dont know what's wrong
Enter your response here or Q to quit: i am feeling great
you are feeling great
 */


import java.lang.reflect.Array;
import java.util.*;

public class IntermediateElizaApplication {

    public static void main (String[] args){

        String answer = "";
        String[] ansArr;
        String inAns = "I am feeling great";
        Scanner input = new Scanner(System.in);

        System.out.println("Good day !!! What is your problem ?");
        System.out.println("-------------------------------------");

        while(!(answer.equalsIgnoreCase(inAns))&&!(answer.equalsIgnoreCase("Q"))) {

            if (!answer.equalsIgnoreCase(inAns) || !(answer.equalsIgnoreCase("Q"))) {

                System.out.println("\n\nEnter your response here or Q to quit: ");
                System.out.println("----------------------------------------");
                answer = input.nextLine();

                ansArr = answer.split(" ");

                for (int i = 0; i < ansArr.length; i++) {

                    if (ansArr[i].equalsIgnoreCase("I")) {
                        // set method of class Array
                        Array.set(ansArr, i, "You");
                    }

                    if (ansArr[i].equalsIgnoreCase("am")) {
                        Array.set(ansArr, i, "are");
                    }

                    if (ansArr[i].equalsIgnoreCase("my")) {
                        Array.set(ansArr, i, "your");
                    }

                    if (ansArr[i].equalsIgnoreCase("me")) {
                        Array.set(ansArr, i, "you");
                    }
                }
                // printing array after replace
                for (String ans : ansArr) {
                    System.out.print(ans + " " );
                }
            }
        }
    }
}

