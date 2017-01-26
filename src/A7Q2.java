
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author annt0773
 */
public class A7Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a new scanner
        Scanner input = new Scanner(System.in);
        //ask how many students they have
        System.out.println("How many people are there?");
        //get the student number
        int people = input.nextInt();
        //create an array to store height of the people
        double[] height = new double[people];
        //get the user to fill the array
        for (int i = 0; i < height.length; i++) {
            //ask for the hieght
            System.out.println("Please enter height " + (i + 1));
            //get the number
            height[i] = input.nextDouble();
        }
        //double total=marks[]+marks;
        //add all the numbers using a loop
        double total = 0;
        //go through each number
        for (int i = 0; i < height.length; i++) {
            //add the number into total
            total = total + height[i];
        }
        //calculate the average
        double average = total / people;
        //round the decimals
        average = Math.round(average * 100) / 100.0;
        //create fot loop to check all the length
        for (int i = 0; i < height.length; i++) {
            //if the height is above the average
            if (height[i] > average) {
            //print out the answer
            System.out.println("These people's height are above the average " + height[i]);
        }
        }
        //print out the people who is above the average


        // TODO code application logic here
    }
}