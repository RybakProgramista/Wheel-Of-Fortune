import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class QuestionsManager {
    private List<Question> questions = new ArrayList<>();
    private FileManagment fileManagment;
    public QuestionsManager(){
        fileManagment = new FileManagment_FILE();
        questions = fileManagment.getQuestionsList();
    }
    public Question getQuestion(int difficulty){
        Random r = new Random();
        while(true){
            int id = r.nextInt(questions.size());
            if(questions.get(id).getDifficulty() == difficulty && !questions.get(id).checkIfUsed()){
                questions.get(id).used();
                return questions.get(id);
            }
        }
    }
}
