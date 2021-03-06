import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Rock_Paper_Scissor_Project {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean quit = false;
        while(quit==false) {

            System.out.println("Enter either Rock, Paper, or Scissor. Enter Q when you would like the game to stop :");
            String user_input = sc.next();
            user_input = user_input.toLowerCase();
            if(user_input.equals("Q")||user_input.equals("q")){
                System.out.println("Game Ended");
                break;
            }
            int random_num = (int) (Math.random() * ((2 - 0) + 1) + 0);
            ArrayList<String> RPS = new ArrayList(Arrays.asList("Rock", "Paper", "Scissors"));
            String Computer_input = RPS.get(random_num);


            //Tie
            if (user_input.equals("rock") && Computer_input.contains("Rock") || user_input.equals("scissor") && Computer_input.equals("Scissor") || user_input.equals("paper")&& Computer_input.equals("Paper")) {
                String output = user_input.substring(0, 1).toUpperCase() + user_input.substring(1);
                System.out.println("You entered " + output);
                System.out.println("Computer entered " + Computer_input);
                System.out.println("Tie");
            }
            //Computer Wins
            if (user_input.equals("rock") && Computer_input.equals("Paper") || user_input.equals("paper")&& Computer_input.equals("Scissor") || user_input.equals("scissor") && Computer_input.equals("Rock")) {
                String output = user_input.substring(0, 1).toUpperCase() + user_input.substring(1);
                System.out.println("You entered " + output);
                System.out.println("Computer entered " + Computer_input);
                System.out.println("Computer Wins");
            }
            //User Wins
            if (user_input.equals("rock")&& Computer_input.equals("Scissors") || user_input.equals("paper")&& Computer_input.equals("Rock") || user_input.equals("scissor") && Computer_input.equals("Paper")) {
                String output = user_input.substring(0, 1).toUpperCase() + user_input.substring(1);
                System.out.println("You entered " + output);
                System.out.println("Computer entered " + Computer_input);
                System.out.println("You win!");
            }
            // If invalid Input
            else{
                System.out.println("Invalid Input");
            }
        }

    }
}
