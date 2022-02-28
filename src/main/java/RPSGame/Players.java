package RPSGame;

import java.util.Random;
import java.util.Scanner;

public class Players {
    String name, userAnswer, pcAnswer;
    String[] choices = {"Rock", "Paper", "Scissors"};
    int random = new Random().nextInt(choices.length);
    Scanner insertName = new Scanner(System.in);
    Scanner answer = new Scanner(System.in);

    public void setName(String askName) {
        System.out.println(askName);
        this.name = insertName.nextLine();
    }
    public void setUserAnswer(String askAnswer){
        System.out.println(askAnswer);
        this.userAnswer = answer.nextLine();
    }

    public String getName() {
        return name;
    }
    public String getUserAnswer(){
        return userAnswer;
    }

}
