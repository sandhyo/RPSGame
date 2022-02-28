package RPSGame;

import java.util.Random;
import java.util.Scanner;


public class Game {
    boolean gameOver = false;
    Players player = new Players();

    public void startGame(){
        System.out.println("Best of 3! Type your answer on SHOOT!");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Rock...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Paper...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Scissors...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        player.setUserAnswer("SHOOT");
    }

    public void playGame() {
        startGame();
        while (gameOver = false){
        }

    }
}
