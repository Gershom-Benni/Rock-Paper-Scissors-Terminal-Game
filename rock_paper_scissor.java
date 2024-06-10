import java.util.Random;
import java.util.Scanner;
public class rock_paper_scissor {
    public static final String TEXT_RESET = "\u001B[0m";
    public static final String TEXT_RED = "\u001B[31m";
    public static final String TEXT_GREEN = "\u001B[32m";
    public static final String TEXT_YELLOW = "\u001B[33m";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        char con = 'i';
        do {
            int random_num = rand.nextInt(3);
            String computer = "";
            String user = "";
            System.out.println("Enter your Choice 'r','p','s': ");
            char user_char = scanner.next().charAt(0);
            if(random_num == 0){
                computer = "Rock";
            }else if(random_num == 1){
                computer = "Paper";
            }else if(random_num == 2){
                computer = "Scissor";
            }
            if(user_char == 'r'){
                user = "Rock";
            }else if(user_char == 'p'){
                user = "Paper";
            }else if(user_char == 's'){
                user = "Scissor";
            }
            if((user == "Rock" && computer == "Scissor")||(user == "Paper" && computer == "Rock")||(user == "Scissor" && computer == "Paper")){
                System.out.println(TEXT_GREEN + "You Won!" + TEXT_RESET);
                System.out.println("You chose : "+user+"\nComputer chose : "+computer);
            }else if(user == computer){
                System.out.println(TEXT_YELLOW + "Game Tied!" + TEXT_RESET);
                System.out.println("You chose : "+user+"\nComputer chose : "+computer);
            }else{
                System.out.println(TEXT_RED + "Computer Won!" + TEXT_RESET);
                System.out.println("You chose : "+user+"\nComputer chose : "+computer);
            }
            System.out.println("Wanna Play Again(y/n)");
            con = scanner.next().charAt(0);
        } while (con == 'y'||con == 'Y');
        scanner.close();
    }
}
