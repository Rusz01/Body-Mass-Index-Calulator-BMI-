// Importing Scanner type to take input from the user
import java.util.Scanner;

// Creating a class named BMI
public class bmi {
// Creating a main class


    public static void main(String[] args) {
        Scanner unit = new Scanner(System.in); // creating a scanner method to get input from user
        System.out.println("Enter the weight in kg and height in meter:");

        Double kg = unit.nextDouble(); // assigning double datatype to input numrical value by the user
        Double m = unit.nextDouble(); // assigning double datatype to input numrical value by the user
        Double z;

        z = kg/(m*m); // Formula to calculate BMI

        System.out.println("The BMI is = " + z);

        if (z <= 18.5){ // initializing condition if the statement is true or false
            System.out.println("You are under weight");
        } else if (z >= 24.9) {// initializing condition if the statement is false
            System.out.println("You are over weight");
        } else { // initializing condition if the both statement is false
            System.out.println("You are healthy");
        }
    }
}
