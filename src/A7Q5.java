
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author annt0773
 */
public class A7Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a scanner
        Scanner input = new Scanner(System.in);
        //ask how many students they have
        System.out.println("How many marks are there?");
        //get the student number
        int mmarks = input.nextInt();
        //create an array that will store two integers
        double[] marks = new double[mmarks];
        //get the user to fill the array
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Please enter marks" + (i + 1));
            marks[i] = input.nextDouble();
        }
        for (int i = 0; i < marks.length - 1; i++) {
            for (int o = i + 1; o < marks.length; o++) {
                if (marks[i] > marks[o]) {
                    double temp = marks[i];
                    marks[i] = marks[o];
                    marks[o] = temp;
                }
            }
        }
        System.out.println(" The marks from lowest to highest is the ");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
        int median = 0;
        if (marks.length % 2 == 0) {
            median = (int) marks[marks.length / 2];
        } else {
            median = (int) marks[marks.length / 2];
        }
        System.out.println("The median is " + median);
        if (median != 0) {
            int media = (int) marks[marks.length / 2];
            media = (media + media)/2;
            System.out.println("The media is " + media);
        }
    }
}
// TODO code application logic here


