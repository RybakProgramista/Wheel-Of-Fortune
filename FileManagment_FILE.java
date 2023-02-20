import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileManagment_FILE extends FileManagment {
    public List<Question> getQuestionsList(){
        List<Question> output = new ArrayList<>();
        try {
            Scanner sc = new Scanner(new File("Pytania.txt"));
            while(sc.hasNextLine()){
                String[] info = sc.nextLine().split("/");
                output.add(new Question(info[0], info[1], info[2], info[3], info[4], info[5], info[6], Integer.parseInt(info[7])));
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return output;
    }
}
