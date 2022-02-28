package RPSGame;


public class Game {
    boolean gameOver = false;
    final Players player;
    int userScore = 0, pcScore = 0;

    public Game(Players player) {
        this.player = player;
    }

    public void startGame() {
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
        player.setUserAnswer("SHOOT!");
    }

    public void playGame() {
        while (gameOver == false) {
            startGame();
            player.setPcAnswer();

            if (player.getUserAnswer().equalsIgnoreCase(player.getPcAnswer())) {
                System.out.println("Draw! Go Again");
            } else if (player.getUserAnswer().equalsIgnoreCase("Rock") && player.getPcAnswer().equalsIgnoreCase("Paper")) {
                System.out.println("Haha I win! Paper eats Rock");
                pcScore += 1;
                System.out.println(getScore());
            } else if (player.getUserAnswer().equalsIgnoreCase("Rock") && player.getPcAnswer().equalsIgnoreCase("Scissors")) {
                System.out.println("You win! Rock breaks Scissors");
                userScore += 1;
                System.out.println(getScore());
            } else if (player.getUserAnswer().equalsIgnoreCase("Paper") && player.getPcAnswer().equalsIgnoreCase("Rock")) {
                System.out.println("You win! Paper eats Rock");
                userScore += 1;
                System.out.println(getScore());
            } else if (player.getUserAnswer().equalsIgnoreCase("Paper") && player.getPcAnswer().equalsIgnoreCase("Scissors")) {
                System.out.println("Haha I win! Scissors cut Paper");
                pcScore += 1;
                System.out.println(getScore());
            } else if (player.getUserAnswer().equalsIgnoreCase("Scissors") && player.getPcAnswer().equalsIgnoreCase("Paper")) {
                System.out.println("You win! Scissors cut Paper");
                userScore += 1;
                System.out.println(getScore());
            } else if (player.getUserAnswer().equalsIgnoreCase("Scissors") && player.getPcAnswer().equalsIgnoreCase("Rock")) {
                System.out.println("Haha I win! Rock breaks Scissors");
                pcScore += 1;
                System.out.println(getScore());
            } else {
                System.out.println("No fair! Only rocks, papers and scissors allowed!");
            }
            if (userScore == 3 || pcScore == 3) {
                if (userScore == 3) {
                    System.out.println("Congratulations you win!");
                } else {
                    System.out.println("HAHAHA I WIN TRY AGAIN NEXT TIME!");
                }
                gameOver = true;
            }
        }

    }

    public String getScore() {
        return  "The score is " + player.getName() + " " + userScore + " - " + pcScore + " Computer";
    }
}
