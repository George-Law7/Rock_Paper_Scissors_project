import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Rock_Paper_Scissor_Project {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int computer_win=0;
        int user_win=0;
        while(computer_win<5&&user_win<5) {

            System.out.println("Enter either Rock, Paper, or Scissor. Enter Q when you would like the game to stop :");
            String user_input = sc.next();
            user_input = user_input.toLowerCase();
            if(user_input.equals("Q")||user_input.equals("q")){
                System.out.println("Game Ended");
                break;
            }
            int random_num = (int) (Math.random() * ((2 - 0) + 1) + 0);
            ArrayList<String> RPS = new ArrayList(Arrays.asList("Rock", "Paper", "Scissor"));
            String Computer_input = RPS.get(random_num);


            //Tie
             if (user_input.equals("rock") && Computer_input.contains("Rock") || user_input.equals("scissor") && Computer_input.equals("Scissor") || user_input.equals("paper")&& Computer_input.equals("Paper")) {
                String output = user_input.substring(0, 1).toUpperCase() + user_input.substring(1);
                System.out.println("You entered " + output);
                System.out.println("Computer entered " + Computer_input);
                System.out.println("Tie");
                 System.out.println("Computer: "+computer_win+" /5");
                 System.out.println("User: "+user_win+" /5");
            }
            //Computer Wins
            else if (user_input.equals("rock") && Computer_input.equals("Paper") || user_input.equals("paper")&& Computer_input.equals("Scissor") || user_input.equals("scissor") && Computer_input.equals("Rock")) {
                String output = user_input.substring(0, 1).toUpperCase() + user_input.substring(1);
                System.out.println("You entered " + output);
                System.out.println("Computer entered " + Computer_input);
                System.out.println("Computer Wins");
                computer_win++;
                 System.out.println("Computer: "+computer_win+" /5");
                 System.out.println("User: "+user_win+" /5");

             }
            //User Wins
            else if (user_input.equals("rock")&& Computer_input.equals("Scissor") || user_input.equals("paper")&& Computer_input.equals("Rock") || user_input.equals("scissor") && Computer_input.equals("Paper")) {
                String output = user_input.substring(0, 1).toUpperCase() + user_input.substring(1);
                System.out.println("You entered " + output);
                System.out.println("Computer entered " + Computer_input);
                System.out.println("You win!");
                user_win++;
                 System.out.println("User: "+user_win+" /5");
                 System.out.println("Computer: "+computer_win+" /5");
             }
            // If invalid Input
            else
            {
                System.out.println("Invalid Input");
            }
        }

    }
}
