/*
 *  UCF COP3330 Summer 2021 Assignment 23 Solution
 *  Copyright 2021 Julian Espinoza
 *
 *  Exercise 23 - Troubleshooting Car Issues
 *  Create a program that walks the user through troubleshooting issues with a car.
 *
 *  Constraint:
 *  Ask only questions that are relevant to the situation and to the previous answers. Don’t ask for all inputs at once.
 *
 */

package ex23;
import java.util.Scanner;

public class base {
    static Scanner userInput = new Scanner(System.in);

    public static void main(String [] args)
    {
        // Initialization of variables
        base myBase = new base();
        String ans;

        // Initial User Input
        System.out.printf("Is the car silent when you turn it on? ");
        ans = userInput.nextLine();

        // If statements go through the full process of discovering what's
        // wrong with the car using the function truFal to fill in for user
        // input.
        if(myBase.truFal(ans))
        {
            System.out.printf("Are the battery terminals corroded? ");
            ans = userInput.nextLine();
            if(myBase.truFal(ans))
            {
                System.out.printf("Clean the terminals and try starting again.");
            }
            else
            {
                System.out.printf("Replace cables and try again.");
            }
        }
        else
        {
            System.out.printf("Does the car make a slicking noise? ");
            ans = userInput.nextLine();
            if(myBase.truFal(ans))
            {
                System.out.printf("Replace the battery.");
            }
            else
            {
                System.out.printf("Does the car crank up but fail to start? ");
                ans = userInput.nextLine();
                if(myBase.truFal(ans))
                {
                    System.out.printf("Check the spark plug connections.");
                }
                else
                {
                    System.out.printf("Does the engine start then die? ");
                    ans = userInput.nextLine();
                    if(myBase.truFal(ans))
                    {
                        System.out.printf("Does your car have fuel injection? ");
                        ans = userInput.nextLine();
                        if(myBase.truFal(ans))
                        {
                            System.out.printf("Get it in for service");
                        }
                        else
                        {
                            System.out.printf("Check to ensure the choke is opening and closing.");
                        }
                    }
                    else
                    {
                        System.out.printf("This should not be possible.");
                    }
                }
            }
        }

    }

    // Function takes user input and returns
    // either true or false depending on the input.
    public boolean truFal(String ans)
    {
        if(ans.equals("y") || ans.equals("Y") || ans.equals("Yes") || ans.equals("yes"))
        {
            return true;
        }
        else
        {
            return false;
        }

    }
}
