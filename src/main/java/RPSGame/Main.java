package RPSGame;


public class Main {

    public static void main(String[] args) {
        Players player = new Players();
        Game game = new Game(player);
        player.setName("What's your name?");
        System.out.println("Hi " + player.getName() + " let's play rock paper scissors!");
        System.out.println("Best of 3! Type your answer on SHOOT!");
        game.playGame();

    }
}
