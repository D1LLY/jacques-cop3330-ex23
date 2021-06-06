/*
Example Output
Is the car silent when you turn the key? y
Are the battery terminals corroded? n
The battery cables may be damaged.
Replace cables and try again.

Constraint
Ask only questions that are relevant to the situation and to the previous answers. Don’t ask for all inputs at once.
 */

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Dilly Jacques
 */


package programming1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String dos = "";

        System.out.print("Is the car silent when you turn the key? ");
        String uno = in.next();

        if (uno.equalsIgnoreCase("y")) {
            System.out.print("Are the battery terminals corroded? ");
            dos = in.next();
            if (dos.equalsIgnoreCase("y")) {
                System.out.print("Clean terminals and try starting again.");
                return;
            } else if (dos.equalsIgnoreCase("n")) {
                System.out.print("The battery cables may be damaged.\nReplace cables and try again.");
                return;
            }

        }
        if (uno.equalsIgnoreCase("n")) {
            System.out.print("Does the car make a slicking noise? ");
            dos = in.next();
            if (dos.equalsIgnoreCase("y")) {
                System.out.print("Replace the battery.");
                return;
            } else if (dos.equalsIgnoreCase("n")) {
                System.out.print("Does the car crank up but fail to start? ");
                String tres = in.next();
                if (tres.equalsIgnoreCase("y")) {
                    System.out.print("Check spark plug connections.");
                    return;
                } else if (tres.equalsIgnoreCase("n")) {
                    System.out.print("Does the engine start and then die? ");
                    String four = in.next();
                    if (four.equalsIgnoreCase("y")) {
                        System.out.print("Does your car have fuel injection? ");
                        String cinco = in.next();
                        if (cinco.equalsIgnoreCase("y")) {
                            System.out.print("Get it in for service.");
                            return;
                        } else if (cinco.equalsIgnoreCase("n")) {
                            System.out.print("Check to make sure the choke is opening and closing.");
                            return;
                        }
                    } else if (four.equalsIgnoreCase("n")) {
                        System.out.print("This should not be possible.");
                        return;

                    }

                }
            }
        }
    }}