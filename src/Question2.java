/**
 * Created by lrterry on 10/13/16.
 */
import java.util.Scanner;
public class Question2 {
    public static void main(String[] args) {
        //Ask a user to add in a number, save it to a variable and print out that variable.
        int userChoice;
        Scanner input = new Scanner(System.in);

        System.out.println("Please choose a number");
        userChoice = input.nextInt();

        System.out.println(userChoice);


    }
}
