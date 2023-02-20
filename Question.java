public class Question {
    private String text;
    private String[] ansewrs;
    private String correctAnswer, category;
    private int difficulty;
    private boolean isUsed;

    public Question(String text, String[] answers, String correctAnswer, String category, int difficulty){
        this.text = text;
        this.ansewrs = answers;
        this.correctAnswer = correctAnswer;
        this.category = category;
        this.difficulty = difficulty;
        isUsed = false;
    }
    public Question(String text, String ans1, String ans2, String ans3, String ans4, String correctAnswer, String category, int difficulty){
        this.text = text;
        String[] answers = {ans1, ans2, ans3, ans4};
        this.ansewrs = answers;
        this.correctAnswer = correctAnswer;
        this.category = category;
        this.difficulty = difficulty;
        isUsed = false;
    }

    public String show(){
        String out = "---Category: " + category + "---\n" + text + "\n";
        for (String ans : ansewrs) {
            out += ans + "\n";
        }
        return out;
    }
    public boolean correctAns(String userAns){
        if(userAns.equals(correctAnswer) ){
            return true;
        }
        else{
            return false;
        }
    }
    public int getDifficulty(){
        return difficulty;
    }

    public boolean checkIfUsed(){
        return isUsed;
    }
    public void used(){
        isUsed = true;
    }
}
