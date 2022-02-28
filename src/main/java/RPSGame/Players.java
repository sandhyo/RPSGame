package RPSGame;

import java.util.Random;
import java.util.Scanner;

public class Players {
    String name, userAnswer, pcAnswer;
    String[] choices = {"Rock", "Paper", "Scissors"};
    Scanner scanner = new Scanner(System.in);

    public void setName(String askName) {
        System.out.println(askName);
        this.name = scanner.nextLine();
    }
    public void setUserAnswer(String askAnswer){
        System.out.println(askAnswer);
        this.userAnswer = scanner.nextLine();
    }
    public void setPcAnswer(){
        int random = new Random().nextInt(choices.length);
        this.pcAnswer = choices[random];
    }

    public String getName() {
        return name;
    }
    public String getUserAnswer(){
        return userAnswer;
    }

    public String getPcAnswer() {
        return pcAnswer;
    }
}
