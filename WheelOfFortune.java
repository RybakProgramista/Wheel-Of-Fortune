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
        isPlayin = true;
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
        System.out.print("Wybierz ilosc graczy \n>");
        int playerAmmount = sc.nextInt();
        System.out.print("Wybierz ilosc tur \n>");
        turnNumber = sc.nextInt();
        for(int x = 1; x <= playerAmmount; x++){
            System.out.print("Witaj graczu nr " + x + "\n");
            System.out.print("Podaj swoj nick \n>");
            String nick = sc.next();
            players.add(new Player(nick, 0));
        }
    }
    public void midGame(){
        for(int x = 0; x < turnNumber; x++){
            for (Player player : players) {
                System.out.print("Tura gracza " + player.getName() + ", który ma " + player.getPoints() + " punktow" + "\nWybierz ilu punktowe chcesz pytanie (1/2/3)\n");
                int difficulty = sc.nextInt();
                Question currQ = questionsManager.getQuestion(difficulty);
                System.out.print(currQ.show() + "\n" + "Twoja odpowiedz to(1/2/3/4): ");
                int userAns = sc.nextInt();
                if()
            }
        }
    }
    public void endGame(){
        isPlayin = false;
    }
}
