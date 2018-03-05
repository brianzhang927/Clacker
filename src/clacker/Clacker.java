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
        boolean[] nums = {true, true, true, true, true, true, true, true, true, true, true, true};

        boolean notUserSum = false;

        Scanner userIntro = new Scanner(System.in);
        System.out.println("Enter your name: ");
        name = userIntro.nextLine();

        System.out.println("Do you want to decide which values to cover? (yes or no)");
        decide = userIntro.nextLine();

        if (decide.equalsIgnoreCase("no")) {
            while (again.equalsIgnoreCase("yes")) {
                for (int i = 0; i < 12; i++) {
                    nums[i] = true;
                }
                counter = 1;
                while (nums[0] || nums[1] || nums[2] || nums[3] || nums[4] || nums[5] || nums[6] || nums[7] || nums[8] || nums[9] || nums[10] || nums[11]) {
                    System.out.println("Rolling dice for Roll " + counter + "...");
                    dice1 = (int) (Math.random() * 6) + 1;
                    dice2 = (int) (Math.random() * 6) + 1;

                    notUserSum = nums[dice1 - 1] || nums[dice2 - 1];
                    nums[dice1 - 1] = false;
                    nums[dice2 - 1] = false;

                    if (!notUserSum) {
                        sum = dice1 + dice2;
                        nums[sum - 1] = false;
                    }

                    System.out.println("The numbers rolled are: " + dice1 + ", " + dice2);
                    counter++;
                    System.out.println("The numbers remaining are: ");
                    for (int j = 0; j < 12; j++) {
                        if (nums[j]) {
                            System.out.print(j + 1);
                            System.out.print(" ");
                        }
                    }

                    System.out.println("");

                }
                System.out.println("Congratulations! It took you " + (counter-1) + " rolls!");

                System.out.println("Do you want to play again? (yes or no)");
                again = userIntro.nextLine();
            }
        }

    }

}
