package quiz;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Question {
    private String questionText;
    private List<Answer> answers;
    private QuestionType type;

    public Question(String questionText, QuestionType type) {
        this.questionText = questionText;
        this.type = type;
        this.answers = new ArrayList<>();
    }

    public void addAnswer(Answer answer) {
        answers.add(answer);
    }

    public boolean isValidResponse(String response) {
        for (char c : response.toCharArray()) {
            if (c < 'A' || c >= 'A' + answers.size()) {
                return false;
            }
        }
        return true;
    }
    public boolean isCorrectResponse(String response) {
        List<Character> correctAnswers = new ArrayList<>();
        for (char i = 'A'; i < 'A' + answers.size(); i++) {
            if (answers.get(i - 'A').isCorrect()) {
                correctAnswers.add(i);
            }
        }
        for (char c : response.toCharArray()) {
            if (!correctAnswers.contains(c)) {
                return false;
            }
            correctAnswers.remove((Character) c);
        }
        return correctAnswers.isEmpty();
    }

    public String getQuestionText() {
        return questionText + " (" + type.toString() + ")";
    }
}
