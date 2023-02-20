public class Main{
    public static void main(String[] args) {
        QuestionsManager questionsManager = new QuestionsManager();
        System.out.println(questionsManager.getQuestion(1).show());
    }
}