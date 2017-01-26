
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author annt0773
 */
public class A7Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a scanner
        Scanner input=new Scanner(System.in);
        //create an array that will store two integers
        double[] A=new double[2];
        //get the user to fill the array
        for (int i = 0; i < A.length; i++) {
            System.out.println("Please enter interger" + (i + 1));
            A[i] = input.nextDouble();
        }
        
        if(A[0]>A[1]){
            double temp=A[0];
            A[0]=A[1];
            A[1]=temp;
        }
       
        
        System.out.println("The integers in order are " + A[0] + " and " + A[1]);
        // TODO code application logic here
    }
}
