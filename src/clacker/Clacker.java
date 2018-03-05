/*
 * Date: February 28, 2018
 * Name: Brian Zhang
 * Teacher: Mr. Chu
 * Description: Summative Assesment -Clacker Game
 */
package clacker;

/**
 *
 * @author Brian
 */
import java.util.Scanner;

public class Clacker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String name;
        String decide;
        String again = "yes";
        int dice1;
        int dice2;
        int counter = 1;
        int sum = 0;
        boolean[] nums={true,true,true,true,true,true,true,true,true,true,true,true};
        
        boolean notUserSum = false;

        Scanner userIntro = new Scanner(System.in);
        System.out.println("Enter your name: ");
        name = userIntro.nextLine();

        System.out.println("Do you want to decide which values to cover? (yes or no)");
        decide = userIntro.nextLine();

        if (decide.equalsIgnoreCase("no")) {
            while (again.equalsIgnoreCase("yes")) {
                for (int i=0;i<12;i++ ) {
                    nums[i] = true;
                }
                counter = 0;
                while (num1 || num2 || num3 || num4 || num5 || num6 || num7 || num8 || num9 || num10 || num11 || num12) {
                    System.out.println("Rolling dice for Roll " + counter + "...");
                    dice1 = (int) (Math.random() * 6) + 1;
                    dice2 = (int) (Math.random() * 6) + 1;
                    notUserSum = false;
                    if ((dice1 == 1 || dice2 == 1) && num1) {
                        num1 = false;
                        notUserSum = true;
                    }
                    if ((dice1 == 2 || dice2 == 2) && num2) {
                        num2 = false;
                        notUserSum = true;
                    }
                    if ((dice1 == 3 || dice2 == 3) && num3) {
                        num3 = false;
                        notUserSum = true;
                    }
                    if ((dice1 == 4 || dice2 == 4) && num4) {
                        num4 = false;
                        notUserSum = true;
                    }
                    if ((dice1 == 5 || dice2 == 5) && num5) {
                        num5 = false;
                        notUserSum = true;
                    }
                    if ((dice1 == 6 || dice2 == 6) && num6) {
                        num6 = false;
                        notUserSum = true;
                    }

                    if (!notUserSum) {
                        sum = dice1 + dice2;
                        if (sum == 7) {
                            num7 = false;
                        } else if (sum == 8) {
                            num8 = false;
                        } else if (sum == 9) {
                            num9 = false;
                        } else if (sum == 10) {
                            num10 = false;
                        } else if (sum == 11) {
                            num11 = false;
                        } else if (sum == 12) {
                            num12 = false;
                        }
                    }

                    System.out.println("The numbers rolled are: " + dice1 + ", " + dice2);
                    counter++;
                    System.out.println("The numbers remaining are: ");
                    if (num1) {
                        System.out.print("1 ");
                    }
                    if (num2) {
                        System.out.print("2 ");
                    }
                    if (num3) {
                        System.out.print("3 ");
                    }
                    if (num4) {
                        System.out.print("4 ");
                    }
                    if (num5) {
                        System.out.print("5 ");
                    }
                    if (num6) {
                        System.out.print("6 ");
                    }
                    if (num7) {
                        System.out.print("7 ");
                    }
                    if (num8) {
                        System.out.print("8 ");
                    }
                    if (num9) {
                        System.out.print("9 ");
                    }
                    if (num10) {
                        System.out.print("10 ");
                    }
                    if (num11) {
                        System.out.print("11 ");
                    }
                    if (num12) {
                        System.out.print("12 ");
                    }
                    System.out.println("");

                }
                System.out.println("Congratulations! It took you " + counter + " rolls!");

                System.out.println("Do you want to play again? (yes or no)");
                again = userIntro.nextLine();
            }
        }

    }

}
