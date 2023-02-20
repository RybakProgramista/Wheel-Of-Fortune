import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WheelOfFortune implements GameManager {
    private QuestionsManager questionsManager;
    private List<Player> players;
    private Scanner sc;
    private boolean isPlayin;
    private int turnNumber;

    public void play(){
        while(isPlayin){
            startGame();
            midGame();
            endGame();
        }
    }

    public void startGame(){
        questionsManager = new QuestionsManager();
        players = new ArrayList<>();
        sc = new Scanner(System.in);
        isPlayin = true;
        System.out.print("Wybierz ilosc graczy \n>");
        int playerAmmount = sc.nextInt();
        System.out.print("\nWybierz ilosc tur \n>");
        int turnNumber = sc.nextInt();
            for(int x = 0; x < playerAmmount; x++){
                System.out.println("Witaj graczu nr " + x);
                System.out.print("\nPodaj swoj nick \n>");
                String nick = sc.nextLine();
                players.add(new Player(nick, 0));
            }
    }
    public void midGame(){
        for(int x = 0; x < turnNumber; x++){
            for (Player player : players) {
                System.out.print("Tura gracza " + player.getName() + ", który ma " + player.getPoints() + " punktow" + "\nWybierz ilu punktowe chcesz pytanie (1/2/3)\n");
                int difficulty = sc.nextInt();
                questionsManager.getQuestion(difficulty);
            }
        }
    }
    public void endGame(){

    }
}
