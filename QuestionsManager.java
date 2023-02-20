import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class QuestionsManager {
    private List<Question> questions = new ArrayList<>();
    private FileManagment fileManagment = new FileManagment();
    public QuestionManagers(){
        questions = fileManagment.getQuestionsList();
    }
    public getQuestion(int difficulty){
        Random r = new Random();
        while(true){
            int id = r.nextInt(0, questions.size());
            
        }
    }
}
