
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author annt0773
 */
public class A7Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a scanner
        Scanner input = new Scanner(System.in);
        //create an array that will store ten integers
        double[] marks = new double[10];
        //get the user to fill the array
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Please enter marks" + (i + 1));
            marks[i] = input.nextDouble();
        }
        for (int i = 0; i < marks.length-1; i++) {
            for (int o = i+1; o < marks.length; o++) {
                if (marks[i] > marks[o]) {
                    double temp = marks[i];
                    marks[i] = marks[o];
                    marks[o] = temp;
                }
            }
            
        }
        System.out.println(" The marks from lowest to highest is the ");
        for(int i=0; i<marks.length;i++){
            System.out.println(marks[i]);
        }
        // TODO code application logic here
    }
}
