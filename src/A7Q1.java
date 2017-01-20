
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author annt0773
 */
public class A7Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create a new scanner
        Scanner input = new Scanner(System.in);
        //ask how many students they have
        System.out.println("How many students in the class?");
        //get the student number
        int student = input.nextInt();
        //create an array to store student marks
        double[] marks = new double[student];
        //get the user to fill the array
        for (int i = 0; i < student; i++) {
            //ask for the marks
            System.out.println("Please enter in mark " + (i + 1));
            //get the number
            marks[i] = input.nextDouble();
        }
        //double total=marks[]+marks;
        //add all the numbers using a loop
        double total = 0;
        //go through each number
        for (int i = 0; i < marks.length; i++) {
            //add the number into total
            total = total + marks[i];
        }
        //calculate the average
        double average = total / marks.length;
        //round the answer to 2 decimal places
        average = Math.round(average*100)/100.0;
        //print out the answer
        System.out.println("The class average is " + average + "%");
    }
}
