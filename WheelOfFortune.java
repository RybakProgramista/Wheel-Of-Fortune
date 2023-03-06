import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
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
                System.out.print(currQ.show() + "\n" + "Twoja odpowiedz to(a/b/c/d): ");
                String userAns = sc.next();
                if(currQ.correctAns(userAns)){
                    System.out.print("\n  +++Poprawna odpowiedz!+++\n");
                    player.addPoints(currQ.getDifficulty());
                }
                else{
                    System.out.print("\n ---Niepoprawna odpowiedz!---\n");
                }
            }
        }
    }
    public void endGame(){
        isPlayin = false;
        int maxPoints = 0;
        for (Player player : players) {
            System.out.println(player.getName() + " " + player.getPoints());
            if(maxPoints < player.getPoints()){
                maxPoints = player.getPoints();
            }
        }
        for(Player player : players){
            if(player.getPoints() == maxPoints){
                System.out.println("Najwiecej punktow zdobyl: " + player.getName());
            }
        }
    }
}
